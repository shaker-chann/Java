package LeetCode;/**
 * @author csc
 * @date 2019/12/8 17:01
 * @version 1.0
 */

/**
 * @program: Java
 * @description: 33. 搜索旋转排序数组
 * @author: liu yan
 * @create: 2019/12/8 17:01
 */
public class SearchRevolveSort {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[r] == target) return r;
            else if (nums[l] == target) return l;

            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                if (nums[r] > target || nums[r] < nums[mid]) l = mid + 1;
                else if (nums[r] < target) r = mid - 1;
            } else if (nums[mid] > target) {
                if (nums[l] < target || nums[l] > nums[mid]) r = mid - 1;
                else if (nums[l] > target) l = mid + 1;
            } else return mid;
        }
        return -1;
    }
}
