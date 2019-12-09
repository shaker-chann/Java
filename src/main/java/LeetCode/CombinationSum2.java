package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 40. 组合总和 II
 * @author: csc
 * @create: 2019/12/9 15:34
 */
public  class CombinationSum2 {
    private static List<List<Integer>> res = new ArrayList<>();
    private static List<Integer> temp = new ArrayList<>();

    public static  void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, target);

        return res;

    }

    public static void dfs(int[] candidates, int start, int target) {
        if (target == 0) res.add(new ArrayList<>(temp));
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            //去重，剪枝：连续相同数字会造成重复的组合数组
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            temp.add(candidates[i]);
            dfs(candidates, start + 1, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
