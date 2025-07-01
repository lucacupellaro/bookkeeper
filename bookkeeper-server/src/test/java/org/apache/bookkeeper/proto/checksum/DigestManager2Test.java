package org.apache.bookkeeper.proto.checksum;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.util.ByteBufList;
import org.junit.After;
import org.junit.Test;

import static org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType;
import static org.junit.Assert.*;

public class DigestManager2Test {

    private static final long LEDGER_ID = 99L;
    private static final byte[] PASSWORD = "pwd".getBytes();

    @After
    public void cleanup() {
        // Rilasci di buffer gestiti da ciascun test
    }

    /*-------------------------------------------------------
     HMAC v2: computeDigestAndPackageForSending + verifyDigestAndReturnData (+ LAC)
    --------------------------------------------------------*/



    /*-------------------------------------------------------
     HMAC v3 (legacy): computeDigestAndPackageForSendingLac + verifyDigestAndReturnLac
    --------------------------------------------------------*/
    @Test
    public void testHmacV3ComputeAndVerifyLac() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, DigestType.HMAC, PooledByteBufAllocator.DEFAULT, false);

        long lac = 123L;
        ByteBufList lacPkg = dm.computeDigestAndPackageForSendingLac(lac);
        assertNotNull(lacPkg);

        ByteBuf buf = lacPkg.getBuffer(0).copy();
        long recovered = dm.verifyDigestAndReturnLac(buf);
        assertEquals(lac, recovered);

        buf.release();
    }

    /*-------------------------------------------------------
     CRC32C v2: entry + LAC
    --------------------------------------------------------*/

    /*-------------------------------------------------------
     CRC32 v3: verifyDigestAndReturnData + verifyDigestAndReturnLastConfirmed
    --------------------------------------------------------*/
    @Test
    public void testCrc32VerifyReturnDataAndLastConfirmed() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, DigestType.CRC32, PooledByteBufAllocator.DEFAULT, false);

        long fakeEntryId = 42, lastAddConfirmed = 15, length = 256;
        ByteBuf headers = Unpooled.buffer(DigestManager.METADATA_LENGTH + dm.macCodeLength);
        headers.writeLong(LEDGER_ID);
        headers.writeLong(fakeEntryId);
        headers.writeLong(lastAddConfirmed);
        headers.writeLong(length);

        int checksum = dm.update(0, headers, 0, DigestManager.METADATA_LENGTH);
        dm.populateValueAndReset(checksum, headers);

        ByteBuf dataOut = dm.verifyDigestAndReturnData(fakeEntryId, headers.copy());
        // readerIndex == METADATA_LENGTH + macCodeLength
        assertEquals(DigestManager.METADATA_LENGTH + dm.macCodeLength, dataOut.readerIndex());
        dataOut.release();

        DigestManager.RecoveryData rd = dm.verifyDigestAndReturnLastConfirmed(headers.copy());
        assertEquals(lastAddConfirmed, rd.getLastAddConfirmed());
        assertEquals(length, rd.getLength());

        headers.release();
    }

    /*-------------------------------------------------------
     Error case: corruzione payload HMAC v2
    --------------------------------------------------------*/
    @Test(expected = BKException.BKDigestMatchException.class)
    public void testHmacV2CorruptionThrows() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                LEDGER_ID, PASSWORD, DigestType.HMAC, PooledByteBufAllocator.DEFAULT, true);

        String msg = "bad-data";
        ByteBuf data = Unpooled.wrappedBuffer(msg.getBytes());
        long entryId = 3, lac = 1;
        byte[] mk = DigestManager.generateMasterKey(PASSWORD);

        ReferenceCounted pkg = dm.computeDigestAndPackageForSending(
                entryId, lac, data.readableBytes(), data.copy(), mk, /*flags=*/0);

        ByteBuf buf = (pkg instanceof ByteBufList)
                ? ((ByteBufList) pkg).getBuffer(0)
                : ((ByteBuf) pkg);

        int off = DigestManager.METADATA_LENGTH + dm.macCodeLength;
        buf.setByte(off, buf.getByte(off) ^ 0xFF);

        // deve lanciare BKDigestMatchException
        dm.verifyDigestAndReturnData(entryId, buf.copy());
    }

    /*-------------------------------------------------------
     Dummy digest always passa
    --------------------------------------------------------*/

}
