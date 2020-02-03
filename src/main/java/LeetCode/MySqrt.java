package LeetCode;

/**
 * @description: 69 x 的平方根
 * @author: csc
 * @create: 2020/2/3 15:14
 */
public class MySqrt {
    public int mySqrt(int x) {
        long left = 0, right = x / 2 + 1;
        while (left < right) {
            // 取右中位数
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) right = mid - 1;
            else left = mid;
        }
        return (int) left;
    }
}
