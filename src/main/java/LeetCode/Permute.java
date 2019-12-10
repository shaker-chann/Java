package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 46. 全排列
 * @author: csc
 * @create: 2019/12/10 17:10
 */
public class Permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        boolean[] selected = new boolean[nums.length];
        dfs(res, temp, nums, selected);
        return res;
    }

    private static void dfs(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums, boolean[] selected) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (selected[i]) continue;
            selected[i] = true;
            temp.addLast(nums[i]);
            dfs(res, temp, nums, selected);
            selected[i] = false;
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));

    }


}
