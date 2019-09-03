package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/27 9:19
 * @Version 1.0
 **/
public class MaxSubSum {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-4,1,-5,-1,0}));
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) sum += num;
            else sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }

    public static int getScore(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] c=new int[m];
        int[] s=new int[n];
        for (int i = 0; i < m; i++) {
            c[i]=scanner.nextInt();
            s[c[i]]++;
        }
        int res=0;
        for (int high:s) {
            Math.min(res,high);
        }
        System.out.println(res);
        return res;
    }
}
