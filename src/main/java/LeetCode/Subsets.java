package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 78 子集
 * @author: csc
 * @create: 2020/2/4 21:11
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    private void backtrack(int start, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, nums, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
