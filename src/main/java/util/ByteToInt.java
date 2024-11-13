package util;

/**
 * @Description:
 * @PackageName: util
 * @Author: csc
 * @Create: 2021-08-09 14:35
 * @Version: 1.0
 */
public class ByteToInt {
    public static void main(String[] args) {
        byte[] data = new byte[]{121, 100, 52, 1};
        System.out.println(byte2intLE(data, 4));
    }

    /**
     * 低位在前
     *
     * @param data
     * @param n
     * @return
     */
    public static int byte2intLE(byte[] data, int n) {
        switch (n) {
            case 1:
                return (int) data[0];
            case 2:
                return (int) (data[0] & 0xff) | (data[1] << 8 & 0xff00);
            case 3:
                return (int) (data[0] & 0xff) | (data[1] << 8 & 0xff00) | (data[2] << 16 & 0xff0000);
            case 4:
                return (int) (data[0] & 0xff) | (data[1] << 8 & 0xff00) | (data[2] << 16 & 0xff0000)
                        | (data[3] << 24 & 0xff000000);
            default:
                return 0;
        }
    }

    /**
     * 低位在后
     *
     * @param data
     * @param n
     * @return
     */
    public static int byte2int(byte[] data, int n) {
        switch (n) {
            case 1:
                return (int) data[3];
            case 2:
                return (int) (data[3] & 0xff) | (data[2] << 8 & 0xff00);
            case 3:
                return (int) (data[3] & 0xff) | (data[2] << 8 & 0xff00) | (data[1] << 16 & 0xff0000);
            case 4:
                return (int) (data[3] & 0xff) | (data[2] << 8 & 0xff00) | (data[1] << 16 & 0xff0000)
                        | (data[1] << 24 & 0xff000000);
            default:
                return 0;
        }
    }
}
