package LeetCode;

/**
 * @description: 63 不同路径 II
 * @author: csc
 * @create: 2020/1/28 19:22
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] result = new int[width];
        result[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int i = 0; i < width; i++) {
                if (row[i] == 1) result[i] = 0;
                else if (i != 0) result[i] += result[i - 1];
            }
        }
        return result[width - 1];
    }
}
