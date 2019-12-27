package LeetCode;

/**
 * @description: pow(x, n), 计算 x 的 n 次幂函数
 * @author: csc
 * @create: 2019/12/27 12:45
 */
public class MyPow {
    public static void main(String[] args) {
        System.out.println(myPow(2.0,-3));
    }
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) return temp * temp;
        if (n > 0) return temp * temp * x;
        return temp * temp / x;

    }
}
