package LeetCode;

import java.util.Scanner;

/**
 * @Description
 * @Author csc
 * @Date 2019/8/27 9:19
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (i % 3 % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}