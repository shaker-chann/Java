package util;

/**
 * @Description:
 * @PackageName: util
 * @Author: csc
 * @Create: 2021-08-09 14:36
 * @Version: 1.0
 */
public class IntToByte {
    /**
     * 低位在前
     *
     * @param i
     * @return
     */
    public static byte[] intToByteArrayLE(int i) {
        byte[] result = new byte[4];
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;
    }

    /**
     * 低位在后
     * @param i
     * @return
     */
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        result[3] = (byte) ((i >> 24) & 0xFF);
        result[2] = (byte) ((i >> 16) & 0xFF);
        result[1] = (byte) ((i >> 8) & 0xFF);
        result[0] = (byte) (i & 0xFF);
        return result;
    }
}
