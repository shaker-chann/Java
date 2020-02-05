package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 51 N皇后
 * @author: csc
 * @create: 2020/2/5 14:15
 */
public class SolveNQueens {
    public static void main(String[] args) {
        
        solveNQueens(4);
    }

    static List<List<String>> ans = new ArrayList<>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static List<List<String>> solveNQueens(int n) {
        for (int i = 0; i < n; i++)
            stringBuilder.append(".");
        dfs(n, new ArrayList<>(), 0);
        return ans;
    }

    private static void dfs(int n, ArrayList temp, int row) {
        if (!is(temp)) return;
        if (row == n) changeRes(temp);
        for (int i = 0; i < n; i++) {
            temp.add(new int[]{row, i});
            dfs(n, temp, row + 1);
            temp.remove(temp.size() - 1);
        }
    }

    private static void changeRes(ArrayList temp) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            int[] cur = (int[]) temp.get(i);
            stringBuilder.setCharAt(cur[1], 'Q');
            res.add(stringBuilder.toString());
            stringBuilder.setCharAt(cur[1], '.');
        }
        ans.add(res);
    }

    private static boolean is(ArrayList temp) {
        if (temp.size() < 2) return true;
        int[] cur = (int[]) temp.get(temp.size() - 1);
        print(cur);
        for (int i = 0; i < temp.size() - 1; i++) {
            int[] tem = (int[]) temp.get(i);
            print(tem);
            if (tem[1] == cur[1] || (cur[0] - tem[0] == Math.abs(cur[1] - tem[1]))) return false;
        }
        return true;
    }

    private static void print(int[] cur) {
        System.out.println(cur[0]+" "+cur[1]);
    }

}
