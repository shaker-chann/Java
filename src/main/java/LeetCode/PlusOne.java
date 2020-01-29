package LeetCode;

import java.util.Arrays;

/**
 * @description: 66 加一
 * @author: csc
 * @create: 2020/1/29 12:31
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else if (i == 0) {
                int[] res = new int[digits.length + 1];
                Arrays.fill(res, 0);
                res[0] = 1;
                return res;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
