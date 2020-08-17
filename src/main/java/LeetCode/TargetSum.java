package LeetCode;

/**
 * @ClassName target
 * @Description $
 * @Author csc
 * @Date 2019/8/12 9:41
 * @Version 1.0
 **/
public class TargetSum {
    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public static int findTargetSumWays(int[] nums, int S) {
        return DFS(nums, 0, 0, S);

//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        if (sum < S || (sum + S) % 2 == 1) {
//            return 0;
//        }
//        int w = (sum + S) / 2;
//        int[] dp = new int[w + 1];
//        dp[0] = 1;
//        for (int num : nums) {
//            for (int j = w; j >= num; j--) {
//                dp[j] += dp[j - num];
//            }
//        }
//        return dp[w];
    }

    public static int DFS(int[] nums, int index, int sum, int S) {
        if (index == nums.length) {
            if (sum == S) return 1;
            else return 0;
        }
        return DFS(nums, index + 1, sum + nums[index], S) +
                DFS(nums, index + 1, sum - nums[index], S);
    }

}
