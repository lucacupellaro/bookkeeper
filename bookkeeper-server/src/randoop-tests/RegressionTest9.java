import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType11 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager14 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate(0L, byteArray10, digestType11, byteBufAllocator12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray16 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray15);
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray16 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        java.lang.Class<?> wildcardClass14 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        java.lang.Class<?> wildcardClass12 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) 0, (long) (short) 1);
        long long3 = recoveryData2.getLastAddConfirmed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        java.lang.Class<?> wildcardClass12 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        java.lang.Class<?> wildcardClass16 = byteArray14.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(0L, (long) (byte) -1);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLength();
        long long6 = recoveryData2.getLength();
        long long7 = recoveryData2.getLength();
        long long8 = recoveryData2.getLastAddConfirmed();
        long long9 = recoveryData2.getLength();
        long long10 = recoveryData2.getLength();
        long long11 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType15 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager18 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate((long) 1, byteArray13, digestType15, byteBufAllocator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(10L, (long) (short) -1);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(16L, (long) 0);
        long long3 = recoveryData2.getLength();
        long long4 = recoveryData2.getLastAddConfirmed();
        long long5 = recoveryData2.getLastAddConfirmed();
        long long6 = recoveryData2.getLength();
        java.lang.Class<?> wildcardClass7 = recoveryData2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 16L + "'", long4 == 16L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16L + "'", long5 == 16L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType15 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager18 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate(35L, byteArray13, digestType15, byteBufAllocator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(97L, (long) (short) 100);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        java.lang.Class<?> wildcardClass5 = recoveryData2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) 32, (long) (byte) 0);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(1L, 10L);
        long long3 = recoveryData2.getLength();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) (byte) -1, 0L);
        long long3 = recoveryData2.getLength();
        long long4 = recoveryData2.getLastAddConfirmed();
        long long5 = recoveryData2.getLength();
        long long6 = recoveryData2.getLastAddConfirmed();
        long long7 = recoveryData2.getLastAddConfirmed();
        long long8 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType16 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager19 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate(0L, byteArray15, digestType16, byteBufAllocator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) 'a', 0L);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLength();
        long long6 = recoveryData2.getLastAddConfirmed();
        long long7 = recoveryData2.getLength();
        long long8 = recoveryData2.getLastAddConfirmed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType14 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager17 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate(0L, byteArray12, digestType14, byteBufAllocator15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) (-1), (long) 32);
        long long3 = recoveryData2.getLastAddConfirmed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 86, (byte) -70, (byte) -84, (byte) 32, (byte) 65, (byte) 27, (byte) 83, (byte) -19, (byte) -28, (byte) -118, (byte) -15, (byte) -42, (byte) 16, (byte) 33, (byte) -57, (byte) 73, (byte) 92, (byte) 32, (byte) 20, (byte) 78 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 119, (byte) 71, (byte) -14, (byte) 83, (byte) 7, (byte) 92, (byte) 51, (byte) -7, (byte) 15, (byte) 124, (byte) -61, (byte) -30, (byte) 9, (byte) 93, (byte) 33, (byte) 112, (byte) -28, (byte) 114, (byte) -110, (byte) -109 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 7, (byte) 94, (byte) -26, (byte) -82, (byte) 44, (byte) -44, (byte) 92, (byte) -95, (byte) 23, (byte) -33, (byte) 63, (byte) -115, (byte) -80, (byte) 68, (byte) -10, (byte) 109, (byte) -81, (byte) 25, (byte) 60, (byte) 34 });
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(52L, (long) 0);
        long long3 = recoveryData2.getLength();
        long long4 = recoveryData2.getLastAddConfirmed();
        long long5 = recoveryData2.getLastAddConfirmed();
        long long6 = recoveryData2.getLength();
        long long7 = recoveryData2.getLength();
        long long8 = recoveryData2.getLength();
        long long9 = recoveryData2.getLastAddConfirmed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType11 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager14 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate((long) (short) 1, byteArray10, digestType11, byteBufAllocator12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) (-1), (long) ' ');
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray0);
        byte[] byteArray2 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray1);
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray1);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -123, (byte) 11, (byte) -15, (byte) 7, (byte) 28, (byte) 94, (byte) 61, (byte) -116, (byte) 36, (byte) 35, (byte) 86, (byte) 118, (byte) -8, (byte) -127, (byte) 106, (byte) -32, (byte) -53, (byte) -30, (byte) -15, (byte) 79 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -12, (byte) 54, (byte) -55, (byte) -3, (byte) -2, (byte) 38, (byte) -42, (byte) 107, (byte) 116, (byte) 105, (byte) -79, (byte) 89, (byte) -13, (byte) -127, (byte) -82, (byte) 50, (byte) 17, (byte) -74, (byte) -4, (byte) 33 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -12, (byte) 54, (byte) -55, (byte) -3, (byte) -2, (byte) 38, (byte) -42, (byte) 107, (byte) 116, (byte) 105, (byte) -79, (byte) 89, (byte) -13, (byte) -127, (byte) -82, (byte) 50, (byte) 17, (byte) -74, (byte) -4, (byte) 33 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -65, (byte) -51, (byte) 54, (byte) 110, (byte) -67, (byte) 57, (byte) 84, (byte) 117, (byte) 72, (byte) 106, (byte) -21, (byte) 114, (byte) -72, (byte) -96, (byte) -85, (byte) 75, (byte) -59, (byte) 75, (byte) 41, (byte) -102 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -119, (byte) 6, (byte) -25, (byte) -58, (byte) 85, (byte) -122, (byte) 101, (byte) 117, (byte) -38, (byte) -113, (byte) -8, (byte) 111, (byte) 58, (byte) 92, (byte) -39, (byte) 64, (byte) 93, (byte) -117, (byte) 91, (byte) -84 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -119, (byte) 6, (byte) -25, (byte) -58, (byte) 85, (byte) -122, (byte) 101, (byte) 117, (byte) -38, (byte) -113, (byte) -8, (byte) 111, (byte) 58, (byte) 92, (byte) -39, (byte) 64, (byte) 93, (byte) -117, (byte) 91, (byte) -84 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -119, (byte) 6, (byte) -25, (byte) -58, (byte) 85, (byte) -122, (byte) 101, (byte) 117, (byte) -38, (byte) -113, (byte) -8, (byte) 111, (byte) 58, (byte) 92, (byte) -39, (byte) 64, (byte) 93, (byte) -117, (byte) 91, (byte) -84 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -71, (byte) 126, (byte) -3, (byte) 30, (byte) 48, (byte) -62, (byte) -53, (byte) -92, (byte) 91, (byte) 91, (byte) -44, (byte) -43, (byte) 113, (byte) 120, (byte) 16, (byte) -97, (byte) 6, (byte) 47, (byte) 42, (byte) 29 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(52L, 97L);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType16 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager19 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate((long) (short) 0, byteArray13, digestType16, byteBufAllocator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType9 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.checksum.DigestManager digestManager12 = org.apache.bookkeeper.proto.checksum.DigestManager.instantiate(97L, byteArray8, digestType9, byteBufAllocator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bookkeeper.proto.DataFormats$LedgerMetadataFormat$DigestType.ordinal()\" because \"digestType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(1L, (long) '#');
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLastAddConfirmed();
        long long5 = recoveryData2.getLength();
        long long6 = recoveryData2.getLastAddConfirmed();
        long long7 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) '4', (long) (short) 0);
        long long3 = recoveryData2.getLength();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) 10, (long) 32);
        long long3 = recoveryData2.getLength();
        java.lang.Class<?> wildcardClass4 = recoveryData2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(97L, 0L);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        java.lang.Class<?> wildcardClass5 = recoveryData2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray7);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray13);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        byte[] byteArray16 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray15);
        java.lang.Class<?> wildcardClass17 = byteArray15.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -14, (byte) 80, (byte) 27, (byte) -23, (byte) 47, (byte) 115, (byte) 87, (byte) -33, (byte) -25, (byte) 14, (byte) -38, (byte) 78, (byte) -101, (byte) -81, (byte) -84, (byte) -7, (byte) -82, (byte) 88, (byte) -116, (byte) 110 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray12);
        byte[] byteArray15 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray14);
        byte[] byteArray16 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray15);
        byte[] byteArray17 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray16);
        byte[] byteArray18 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray16);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -14, (byte) 80, (byte) 27, (byte) -23, (byte) 47, (byte) 115, (byte) 87, (byte) -33, (byte) -25, (byte) 14, (byte) -38, (byte) 78, (byte) -101, (byte) -81, (byte) -84, (byte) -7, (byte) -82, (byte) 88, (byte) -116, (byte) 110 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -14, (byte) 80, (byte) 27, (byte) -23, (byte) 47, (byte) 115, (byte) 87, (byte) -33, (byte) -25, (byte) 14, (byte) -38, (byte) 78, (byte) -101, (byte) -81, (byte) -84, (byte) -7, (byte) -82, (byte) 88, (byte) -116, (byte) 110 });
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray5);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray6);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -19, (byte) 70, (byte) -21, (byte) 57, (byte) -71, (byte) -77, (byte) -78, (byte) -22, (byte) 14, (byte) 30, (byte) 4, (byte) -59, (byte) 33, (byte) -30, (byte) 70, (byte) 39, (byte) -8, (byte) -118, (byte) 46, (byte) 33 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 86, (byte) 0, (byte) -72, (byte) 62, (byte) -25, (byte) 26, (byte) 88, (byte) 32, (byte) 63, (byte) -100, (byte) -55, (byte) -53, (byte) -40, (byte) -99, (byte) 8, (byte) 120, (byte) -104, (byte) 34, (byte) 18, (byte) -32 });
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) (byte) 10, (long) 16);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLength();
        long long6 = recoveryData2.getLastAddConfirmed();
        java.lang.Class<?> wildcardClass7 = recoveryData2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 16L + "'", long4 == 16L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16L + "'", long5 == 16L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) '4', (long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = recoveryData2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray3 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray2);
        byte[] byteArray4 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray3);
        byte[] byteArray5 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray6 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray7 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray8 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray4);
        byte[] byteArray9 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray8);
        byte[] byteArray10 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray9);
        byte[] byteArray11 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray10);
        byte[] byteArray12 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray13 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        byte[] byteArray14 = org.apache.bookkeeper.proto.checksum.DigestManager.generateMasterKey(byteArray11);
        java.lang.Class<?> wildcardClass15 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -57, (byte) -123, (byte) -35, (byte) -56, (byte) -28, (byte) -35, (byte) 45, (byte) 68, (byte) 58, (byte) -114, (byte) -62, (byte) -92, (byte) 87, (byte) 106, (byte) -90, (byte) -33, (byte) 89, (byte) -123, (byte) -103, (byte) -63 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -120, (byte) -1, (byte) 125, (byte) -125, (byte) -43, (byte) -108, (byte) 27, (byte) 5, (byte) 75, (byte) 103, (byte) 97, (byte) -105, (byte) 55, (byte) -40, (byte) 63, (byte) -124, (byte) -31, (byte) -76, (byte) 46, (byte) 104 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -57, (byte) -127, (byte) 46, (byte) 29, (byte) 104, (byte) -74, (byte) -58, (byte) 26, (byte) -82, (byte) 85, (byte) 101, (byte) 67, (byte) 122, (byte) 95, (byte) 92, (byte) 100, (byte) 126, (byte) 95, (byte) 55, (byte) -32 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -111, (byte) 91, (byte) 109, (byte) 56, (byte) -14, (byte) -38, (byte) 62, (byte) -79, (byte) 74, (byte) 64, (byte) -49, (byte) 54, (byte) -86, (byte) -89, (byte) -100, (byte) -114, (byte) 14, (byte) -44, (byte) -60, (byte) -82 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -10, (byte) -41, (byte) -2, (byte) -21, (byte) 23, (byte) -11, (byte) 114, (byte) 124, (byte) -101, (byte) 94, (byte) -30, (byte) 124, (byte) -122, (byte) -22, (byte) 23, (byte) 75, (byte) 98, (byte) 111, (byte) 38, (byte) -85 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -33, (byte) 113, (byte) -112, (byte) 41, (byte) -17, (byte) -33, (byte) -124, (byte) 72, (byte) -114, (byte) -85, (byte) -2, (byte) 104, (byte) 93, (byte) -10, (byte) -22, (byte) -86, (byte) 104, (byte) -3, (byte) -68, (byte) -125 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -76, (byte) 43, (byte) -92, (byte) -94, (byte) -30, (byte) 64, (byte) -61, (byte) 103, (byte) 41, (byte) 89, (byte) -44, (byte) -97, (byte) 102, (byte) 65, (byte) -36, (byte) 41, (byte) 94, (byte) 57, (byte) -64, (byte) 29 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData(35L, 0L);
        long long3 = recoveryData2.getLastAddConfirmed();
        long long4 = recoveryData2.getLength();
        long long5 = recoveryData2.getLastAddConfirmed();
        long long6 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData recoveryData2 = new org.apache.bookkeeper.proto.checksum.DigestManager.RecoveryData((long) (short) 10, (long) (short) 100);
        long long3 = recoveryData2.getLength();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }
}

