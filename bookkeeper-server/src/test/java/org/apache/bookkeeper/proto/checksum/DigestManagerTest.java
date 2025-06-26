package org.apache.bookkeeper.proto.checksum;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.util.ByteBufList;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;

import static org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType;

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
                { 999L, 1L, "pwd".getBytes(), DigestType.HMAC, 100L, 255,  DigestManager.generateMasterKey("sdgds".getBytes()), "short", true,0l },
                { 999L, 1L, "pwd".getBytes(), DigestType.HMAC, 100L, 255,  DigestManager.generateMasterKey("pwsdfsdd".getBytes()), "short", false,1l }, // failure?
                { -5L, 999L, "!@#".getBytes(), DigestType.CRC32C, 100L, 1,  DigestManager.generateMasterKey("pwvdvxdd".getBytes()), "A", false,12l },
                { 101L, 1L, "secret".getBytes(), DigestType.CRC32, 100L, 0,
                        DigestManager.generateMasterKey("secret".getBytes()), "entry", true,Long.MAX_VALUE },
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
        Assert.assertEquals(recoveredLac, lac);
    }
}