package org.apache.bookkeeper.proto.checksum;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.client.LedgerHandle;
import org.apache.bookkeeper.util.ByteBufList;
import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;

import static org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DigestManagerTest {

    @Parameterized.Parameter(0)
    public long lastAddConfirmed;

    @Parameterized.Parameter(1)
    public long ledgerId;

    @Parameterized.Parameter(2)
    public byte[] password;

    @Parameterized.Parameter(3)
    public DigestType digestType;

    @Parameterized.Parameter(4)
    public long entryId;

    @Parameterized.Parameter(5)
    public int flags;

    @Parameterized.Parameter(6)
    public byte[] masterKey;

    @Parameterized.Parameter(7)
    public String content;

    @Parameterized.Parameter(8)
    public boolean protocol;

    @Parameterized.Parameter(9)
    public long lac;




    private DigestManager dm;
    private ByteBuf data;
    private long length;
    private Object result;

    @Parameterized.Parameters(name = "#{index} - Digest: {3}, Entry: {4}, Flags: {5}, Content: \"{7}\", V2: {8}")
    public static Collection<Object[]> data() throws NoSuchAlgorithmException {
        return Arrays.asList(new Object[][] {
                { 999L, 1L, "pwd".getBytes(), DigestType.HMAC, 100L, 255,  DigestManager.generateMasterKey("sdgds".getBytes()), "short", true,0l, },
                { 999L, 1L, "pwd".getBytes(), DigestType.HMAC, 100L, 255,  DigestManager.generateMasterKey("pwsdfsdd".getBytes()), "short", false,1l }, // failure?
                { -5L, 999L, "!@#".getBytes(), DigestType.CRC32C, 100L, 1,  DigestManager.generateMasterKey("pwvdvxdd".getBytes()), "A", false,-12l },
                { 101L, 1L, "secret".getBytes(), DigestType.CRC32, 100L, 0,
                        DigestManager.generateMasterKey("secret".getBytes()), "entry", true,Long.MAX_VALUE },
                { 101L, 1L, "secret".getBytes(), DigestType.DUMMY, 100L, 0,
                        DigestManager.generateMasterKey("secret".getBytes()), "entry", true,Long.MAX_VALUE }
        });
    }

    @Before
    public void setUp() throws GeneralSecurityException {
        data = Unpooled.wrappedBuffer(content.getBytes());
        length = data.readableBytes();

        dm = DigestManager.instantiate(
                ledgerId, password, digestType, PooledByteBufAllocator.DEFAULT, protocol);
    }

    @After
    public void tearDown() {
        if (data != null && data.refCnt() > 0) {
            data.release(); // evita memory leak
        }
    }

    @Test
    public void testComputeDigestAndPackageForSending() throws GeneralSecurityException {
        Object result = dm.computeDigestAndPackageForSending(
                entryId, lastAddConfirmed, length, data.copy(), masterKey, flags);

        Assert.assertNotNull("Il risultato non deve essere null", result);
        Assert.assertTrue("Il risultato deve essere un ByteBuf o ByteBufList",
                result instanceof ReferenceCounted);
    }



    @Test
    public void testVerifyDigest() throws BKException.BKDigestMatchException {
        //long lac=12;
        // 1. Crea il pacchetto per LAC
        ByteBufList packet = dm.computeDigestAndPackageForSendingLac(lac);

        // 2. Verifica e ottiene il valore LAC
        long recoveredLac = dm.verifyDigestAndReturnLac(packet.getBuffer(0).copy());

        //Assert.assertNotNull("non deve essere null",recoveredLac);
        assertEquals(recoveredLac, lac);
    }


    @Test
    public void testGenerateMasterKeyMultiplePasswords() throws NoSuchAlgorithmException {
        // 1) prepari la collection delle password da testare
        Collection<byte[]> passwords = Arrays.asList(
                new byte[0],                        // vuota
                "short".getBytes(),                 // corta
                createLongRandomPassword(100_000)   // lunga
        );

        // lunghezza attesa di un HMAC‐SHA1
        int expectedLen = MacDigestManager.genDigest("ledger", "x".getBytes()).length;

        for (byte[] pwd : passwords) {
            byte[] key = DigestManager.generateMasterKey(pwd);

            // non deve mai restituire null
            Assert.assertNotNull("Master key per pwd=" + Arrays.toString(pwd), key);

            if (pwd.length == 0) {
                // con pwd vuota deve essere EMPTY_LEDGER_KEY
                Assert.assertArrayEquals(
                        MacDigestManager.EMPTY_LEDGER_KEY,
                        key
                );
            } else {
                // con pwd non vuota: lunghezza SHA1 e diverso da EMPTY_LEDGER_KEY
                assertEquals(expectedLen, key.length);
                Assert.assertFalse(
                        Arrays.equals(MacDigestManager.EMPTY_LEDGER_KEY, key)
                );
            }
        }
    }

    // helper per generare una password lunga e pseudo‐casuale
    private byte[] createLongRandomPassword(int size) {
        byte[] pwd = new byte[size];
        new java.util.Random(0).nextBytes(pwd);
        return pwd;
    }

    @Test
    public void testValidRecoveryData() throws Exception {
        long ledgerId = 42L;
        long fakeEntryId = 7L;            // verrà ignorato dallo skipEntryIdCheck
        long expectedLAC = 1234L;
        long expectedLength = 5678L;

        // istanzio in V3 (useV2Protocol=false)
        DigestManager dm = DigestManager.instantiate(
                ledgerId,
                "pwd".getBytes(),
                DigestType.CRC32,
                PooledByteBufAllocator.DEFAULT,
                /*useV2Protocol=*/false);

        // costruisco manualmente l’header "metadati"
        int macLen = dm.macCodeLength;
        ByteBuf buf = Unpooled.buffer(DigestManager.METADATA_LENGTH + macLen);
        buf.writeLong(ledgerId);
        buf.writeLong(fakeEntryId);
        buf.writeLong(expectedLAC);
        buf.writeLong(expectedLength);

        // calcolo e appendo il digest
        int digest = dm.update(0, buf, 0, DigestManager.METADATA_LENGTH);
        dm.populateValueAndReset(digest, buf);

        // chiamo il metodo e controllo i valori
        DigestManager.RecoveryData rd = dm.verifyDigestAndReturnLastConfirmed(buf.copy());
        assertEquals(expectedLAC, rd.getLastAddConfirmed());
        assertEquals(expectedLength, rd.getLength());

        buf.release();
    }

    /**
     * Partizione “buffer troppo corto”: devo ottenere subito BKDigestMatchException.
     */
    @Test(expected = BKException.BKDigestMatchException.class)
    public void testTooShortBufferThrows() throws Exception {
        DigestManager dm = DigestManager.instantiate(
                1L,
                "pwd".getBytes(),
                DigestType.DUMMY,
                PooledByteBufAllocator.DEFAULT,
                /*useV2Protocol=*/false);

        // dimensione minore di METADATA_LENGTH + macCodeLength
        ByteBuf tooShort = Unpooled.buffer(DigestManager.METADATA_LENGTH + dm.macCodeLength - 1);
        try {
            dm.verifyDigestAndReturnLastConfirmed(tooShort);
        } finally {
            tooShort.release();
        }
    }

    /**
     * Partizione “ledgerId sbagliato”: header formalmente corretto, ma contiene
     * ledgerId diverso ⇒ eccezione.
     */
    @Test(expected = BKException.BKDigestMatchException.class)
    public void testLedgerIdMismatchThrows() throws Exception {
        long correctLedgerId = 99L;
        long wrongLedgerId   = 100L;
        long fakeEntryId     = 1L;
        long lastAddConfirmed= 55L;
        long length          = 66L;

        DigestManager dm = DigestManager.instantiate(
                correctLedgerId,
                "pwd".getBytes(),
                DigestType.CRC32C,
                PooledByteBufAllocator.DEFAULT,
                /*useV2Protocol=*/false);

        ByteBuf buf = Unpooled.buffer(DigestManager.METADATA_LENGTH + dm.macCodeLength);
        buf.writeLong(wrongLedgerId);
        buf.writeLong(fakeEntryId);
        buf.writeLong(lastAddConfirmed);
        buf.writeLong(length);

        int digest = dm.update(0, buf, 0, DigestManager.METADATA_LENGTH);
        dm.populateValueAndReset(digest, buf);

        try {
            dm.verifyDigestAndReturnLastConfirmed(buf.copy());
        } finally {
            buf.release();
        }
    }



}