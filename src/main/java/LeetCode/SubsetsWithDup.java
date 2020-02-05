package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 90 子集 II
 * @author: csc
 * @create: 2020/2/4 22:06
 */
public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    private void backtrack(int start, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backtrack(i + 1, nums, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
