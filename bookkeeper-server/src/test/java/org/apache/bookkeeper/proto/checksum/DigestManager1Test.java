package org.apache.bookkeeper.proto.checksum;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.proto.BookieProtocol;
import org.apache.bookkeeper.proto.DataFormats;
import org.apache.bookkeeper.util.ByteBufList;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.security.GeneralSecurityException;

import static org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.*;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class DigestManager1Test {

    private static final long LEDGER_ID = 1234L;
    private static final byte[] PASSWORD = "passwd".getBytes();
    private static final PooledByteBufAllocator ALLOC = PooledByteBufAllocator.DEFAULT;

    // libera ogni ByteBuf allocato
    @After
    public void tearDown() {
        // Netty leak detector segnala automaticamente eventuali buffer non rilasciati
    }



    @Test
    public void testHmacV3_onlyLac() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, HMAC, ALLOC, /*useV2Protocol=*/false);
        long lac = 77L;

        // compute LAC with V3
        ByteBufList pkg = dm.computeDigestAndPackageForSendingLac(lac);
        assertNotNull(pkg);

        ByteBuf buf = pkg.getBuffer(0).copy();
        long got = dm.verifyDigestAndReturnLac(buf);
        assertEquals(lac, got);

        buf.release();
    }


    @Test
    public void testCrc32V3_recoveryAndReturnData() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, CRC32, ALLOC, /*useV2Protocol=*/false);
        long fakeEntry = 9L, lac = 3L, length = 100L;

        // build manual V3 buffer: [ledgerId, entryId, lastAddConfirmed, length] + digest
        ByteBuf hdr = Unpooled.buffer(DigestManager.METADATA_LENGTH + dm.macCodeLength);
        hdr.writeLong(LEDGER_ID);
        hdr.writeLong(fakeEntry);
        hdr.writeLong(lac);
        hdr.writeLong(length);
        int d = dm.update(0, hdr, 0, DigestManager.METADATA_LENGTH);
        dm.populateValueAndReset(d, hdr);

        // verify & return data: readerIndex moves past header+digest
        ByteBuf out = dm.verifyDigestAndReturnData(fakeEntry, hdr.copy());
        assertEquals(DigestManager.METADATA_LENGTH + dm.macCodeLength, out.readerIndex());
        out.release();

        // verify recovery
        DigestManager.RecoveryData rd = dm.verifyDigestAndReturnLastConfirmed(hdr.copy());
        assertEquals(lac, rd.getLastAddConfirmed());
        assertEquals(length, rd.getLength());

        hdr.release();
    }

    @Test
    public void testCrc32cV3_onlyLac() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, CRC32C, ALLOC, /*useV2Protocol=*/false);
        long lac = 55L;

        ByteBufList pkg = dm.computeDigestAndPackageForSendingLac(lac);
        assertNotNull(pkg);

        ByteBuf buf = pkg.getBuffer(0).copy();
        long got = dm.verifyDigestAndReturnLac(buf);
        assertEquals(lac, got);

        buf.release();
    }

    @Test(expected = BKException.BKDigestMatchException.class)
    public void testHmacV2_corruptionThrows() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, HMAC, ALLOC, /*useV2Protocol=*/true);
        String msg = "oops";
        ByteBuf src = Unpooled.wrappedBuffer(msg.getBytes());
        byte[] masterKey = DigestManager.generateMasterKey(PASSWORD);

        ReferenceCounted pkg = dm.computeDigestAndPackageForSending(
                13L, 0L, src.readableBytes(), src.copy(), masterKey, 0);
        ByteBuf buf = (pkg instanceof ByteBufList
                ? ((ByteBufList) pkg).getBuffer(0)
                : ((ByteBuf) pkg));

        // flip one byte in payload
        int off = DigestManager.METADATA_LENGTH + dm.macCodeLength;
        buf.setByte(off, buf.getByte(off) ^ 0xFF);

        // should throw
        dm.verifyDigestAndReturnData(13L, buf.copy());
    }


    @Test
    public void testDummyDigest_neverFails() throws Exception {
        // Dummy con V3: non scrive mai il masterKey nel header
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, DUMMY, ALLOC, /*useV2Protocol=*/false);

        // --- 1) Test entry + payload non fallisce mai ---
        String msg = "dummy-data";
        ByteBuf src = Unpooled.wrappedBuffer(msg.getBytes());
        ReferenceCounted pkg = dm.computeDigestAndPackageForSending(
                /*entryId*/21L,
                /*lastAddConfirmed*/7L,
                src.readableBytes(),
                src.copy(),
                /*masterKey*/new byte[0],
                /*flags*/0);

        // estraiamo il buffer entry
        ByteBuf entryBuf = (pkg instanceof ByteBufList)
                ? ((ByteBufList) pkg).getBuffer(0).copy()
                : ((ByteBuf) pkg).copy();

        // Dummy non deve mai lanciare quando si verifica il payload
        dm.verifyDigestAndReturnData(21L, entryBuf);
        entryBuf.release();
        src.release();

        // --- 2) Test solo LAC non fallisce mai ---
        long lac = 7L;
        ByteBufList lacPkg = dm.computeDigestAndPackageForSendingLac(lac);
        assertNotNull(lacPkg);
        ByteBuf lacBuf = lacPkg.getBuffer(0).copy();

        // Questa è la chiamata corretta per la LAC
        long gotLac = dm.verifyDigestAndReturnLac(lacBuf);
        assertEquals(lac, gotLac);
        lacBuf.release();
    }


}
