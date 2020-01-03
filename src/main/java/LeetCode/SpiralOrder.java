package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 54 螺旋矩阵
 * @author: csc
 * @create: 2020/1/3 15:34
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        int row = matrix.length, col = matrix[0].length;
        int r = 0, c = 0;
        int rh = row - 1, ch = col - 1, rl = 0, cl = 0;
        int status = 0;
        int len = row * col;
        while (len > 0) {
            switch (status){
                case 0://横向从左到右
                    while (c<=ch){res.add(matrix[r][c]);c++;len--;}r++;c--;status=1;rl++;break;
                case 1://纵向从上到下
                    while (r<=rh){res.add(matrix[r][c]);r++;len--;}r--;c--;status=3;ch--;break;
                case 3:
                    while (c>=cl){res.add(matrix[r][c]);c--;len--;}c++;r--;status=4;rh--;break;
                case 4:
                    while (r>=rl){res.add(matrix[r][c]);r--;len--;}r++;c++;status=1;cl++;break;
            }
        }
        return res;

    }
}
