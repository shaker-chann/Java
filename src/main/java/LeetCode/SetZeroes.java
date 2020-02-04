package LeetCode;

/**
 * @description: 73 矩阵置零
 * @author: csc
 * @create: 2020/2/4 17:36
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        int row = matrix.length, col = matrix[0].length;
        boolean rowFlag = false, colFlag = false;
        // 记录第一行、第一列中是否有 0
        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) rowFlag = true;
        }
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) colFlag = true;
        }

        // 遍历其余数组，如果有0，行列的第一个位置置为0
        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 把刚才置为0的行列置为0
        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        // 行列置为0
        if (rowFlag) {
            for (int j = 0; j < col; j++)
                matrix[0][j] = 0;
        }
        if (colFlag) {
            for (int i = 0; i < row; i++)
                matrix[i][0] = 0;
        }

    }
}
