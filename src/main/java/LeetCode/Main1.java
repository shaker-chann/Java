package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author csc
 * @Date 2019/8/27 9:19
 * @Version 1.0
 **/
public class Main1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Main1 main1 = new Main1();
//        System.out.println(main1.threeSum(new int[]{0, 0, 0}));
    }


    public int longestPalindromeSubseq(String s) {


        if (s.length() <= 1) return s.length();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = check(s, i, i);
            String s2 = check(s, i, i + 1);
            ans = s1.length() > ans.length() ? s1 : ans;
            ans = s2.length() > ans.length() ? s2 : ans;
        }
        return ans.length();
    }

    public List<List<String>> partition(String s) {
        return null;
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (l < r) {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
                l++;
                r--;
            }
        }
        return true;
    }


    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += check1(s, i, i);
            ans += check1(s, i, i + 1);
        }
        return ans;
    }

    private int check1(String s, int left, int right) {
        int ans = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            ans++;
        }
        return ans;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = check(s, i, i);
            String s2 = check(s, i, i + 1);
            ans = s1.length() > ans.length() ? s1 : ans;
            ans = s2.length() > ans.length() ? s2 : ans;
        }
        return ans;
    }

    private String check(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int first = 0; first < length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) continue;
            int third = length - 1;

            for (int second = first + 1; second < length; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                int s1 = -(nums[first] + nums[second]);
                //nums[i] + nums[j] + nums[k] == 0
                while (second < third && nums[third] > s1) {
                    third--;
                }
                if (second == third) break;
                if (nums[third] == s1) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }


    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n - 1];
    }

}