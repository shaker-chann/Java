package LeetCode;

/**
 * @description: 55 跳跃游戏
 * @author: csc
 * @create: 2020/1/5 18:05
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = lastPos; i >= 0; i++) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
