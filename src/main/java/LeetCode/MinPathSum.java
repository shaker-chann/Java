package LeetCode;

/**
 * @description: 64 最小路径和
 * @author: csc
 * @create: 2020/1/29 11:50
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] dp = new int[col];
        dp[0] = grid[0][0];
        for (int j = 1; j < col; j++) {
            dp[j] = dp[j - 1] + grid[0][j];
        }
        for (int i = 1; i < row; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < col; j++) {
                if (dp[j - 1] < dp[j]) dp[j] = dp[j - 1] + grid[i][j];
                else dp[j] += grid[i][j];
            }
        }
        return dp[col - 1];
    }
}
