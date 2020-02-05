package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 39 组合总和
 * @author: csc
 * @create: 2020/2/5 11:09
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> ans, ArrayList temp, int start) {
        if (target == 0) ans.add(new ArrayList<>(temp));
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            temp.add(candidates[i]);
            dfs(candidates, target - candidates[i], ans, temp, i);
            temp.remove(temp.size() - 1);
        }
    }
}
