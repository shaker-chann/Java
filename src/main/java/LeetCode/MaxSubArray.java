package LeetCode;

/**
 * @description: 53 最大子序和
 * @author: csc
 * @create: 2020/1/3 15:30
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) sum += num;
            else sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
