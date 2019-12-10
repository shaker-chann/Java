package LeetCode;

import java.util.*;

/**
 * @description: 47. 全排列 II
 * @author: csc
 * @create: 2019/12/10 18:12
 */
public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(res, temp, nums, visited);
        return res;
    }

    private static void dfs(List<List<Integer>> res, Stack<Integer> temp, int[] nums, boolean[] visited) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((visited[i])||(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
//            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            visited[i] = true;
            temp.add(nums[i]);
            dfs(res, temp, nums, visited);
            visited[i] = false;
            temp.pop();
        }
    }
}
