package LeetCode;/**
 * @author csc
 * @date 2019/12/5 17:53
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Java
 * @description: 15. 三数之和
 * @author: liu yan
 * @create: 2019/12/5 17:53
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length <= 3) {
            if (nums.length == 3 && nums[0] + nums[1] + nums[2] == 0)
                lists.add(Arrays.asList(nums[0], nums[1], nums[2]));
            return lists;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i >= 1 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    lists.add(Arrays.asList(nums[0], nums[1], nums[2]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (r > l && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) l++;
                else r--;
            }
        }

        return lists;
    }
}
