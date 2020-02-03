package LeetCode;

/**
 * @description: 67 二进制求和
 * @author: csc
 * @create: 2020/1/29 23:08
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        int cache = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0 && a.charAt(i) == '1') cache++;
            if (j >= 0 && b.charAt(j) == '1') cache++;
            if (cache % 2 != 0) res.append("1");
            else res.append("0");
            cache = cache >= 2 ? 1 : 0;
            i--;
            j--;
        }
        if (cache != 0) res.append(cache);
        return res.reverse().toString();
    }
}
