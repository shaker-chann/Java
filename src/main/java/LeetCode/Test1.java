package LeetCode;

/**
 * @Description 编码测试
 * @Author csc
 * @Date 2019/8/12 17:07
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        int n=5;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
        //System.out.println(canJump(new int[]{0, 2, 3}));
    }

    public static boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

    public int coinChange(int[] coins, int amount) {
        

        return -1;
    }
}
