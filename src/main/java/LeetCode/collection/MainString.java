package LeetCode.collection;

import javafx.util.Pair;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-11-16
 */
public class MainString {
    public static void main(String[] args) {
        LocalDate end = LocalDate.of(2024, 9, 1);
        LocalDate now = LocalDate.now();
        System.out.println("attention:remain day is " + now.until(end, ChronoUnit.DAYS));

        MainString main = new MainString();
        System.out.println(main.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(main.longestPalindrome("babad"));
        System.out.println(main.convert("PAYPALISHIRING", 3));
        System.out.println(main.isMatch("acdcb", "a*c?b"));
        System.out.println(main.longestValidParentheses(")()())"));
        System.out.println(main.minDistance("leetcode", "etco"));//4
        System.out.println(main.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(main.numDistinct("babgbag", "bag"));
        System.out.println(main.wordBreak("applepenapple", new ArrayList<>(Arrays.asList("apple", "pen"))));
        System.out.println(Arrays.toString(main.removeInvalidParentheses("()())()").toArray()));
        System.out.println(main.decodeString("3[a2[c]]"));
        System.out.println(main.findAnagrams("bbbcb", "cb").toString());
        System.out.println(main.countSubstrings1("aaa"));
        System.out.println(main.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
        System.out.println(main.expressiveWords("heeellooo", new String[]{"hello"}));
        System.out.println(main.ambiguousCoordinates("(00011)"));
        System.out.println(main.uniqueLetterString("ABA"));
        System.out.println(main.kSimilarity("abc", "bca"));
        System.out.println(main.distinctSubseqII("aba"));
        System.out.println(main.longestCommonSubsequence("abbbc", "abc"));
        System.out.println(main.reorderSpaces("  aa"));
        System.out.println(main.maxRepeating("ababc", "ab"));
        System.out.println(main.countConsistentStrings("ab", new String[]{"a", "ab", "abc"}));
        System.out.println(main.minOperations("011010"));
        System.out.println(main.beautySum("aabcbaa"));
        System.out.println(main.numDifferentIntegers("123"));
        System.out.println(main.CheckPermutation("abc", "bca"));
        System.out.println(main.isFlipedString("waterbottle", "erbottlewat"));


//        System.out.println(Arrays.toString(main.calcEquation(new ArrayList<List<String>>() {{
//            add(new ArrayList<String>() {{
//                add("a");
//                add("b");
//            }});
//            add(new ArrayList<String>() {{
//                add("b");
//                add("c");
//            }});
//            add(new ArrayList<String>() {{
//                add("bc");
//                add("cd");
//            }});
//        }}, new double[]{2.0, 3.0, 5.0}, new ArrayList<List<String>>() {{
//            add(new ArrayList<String>() {{
//                add("a");
//                add("c");
//            }});
//            add(new ArrayList<String>() {{
//                add("c");
//                add("b");
//            }});
//            add(new ArrayList<String>() {{
//                add("bc");
//                add("cd");
//            }});
//        }})));
//        System.out.println(main.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
//        System.out.println(main.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
//        System.out.println(main.findClosestElements(new int[]{1}, 1, 1).toString());
//
//        System.out.println(main.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
//        System.out.println(Arrays.toString(main.finalPrices(new int[]{10, 1, 1, 6})));
//
//        System.out.println(main.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
//        System.out.println(main.maximumSwap(98368));
//        System.out.println(main.maximumSwap(1993));
//        main.rectangleArea(new int[][]{{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}});
//        System.out.println(Arrays.toString(main.frequencySort(new int[]{2, 3, 1, 3, 2})));
//        System.out.println(main.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
//        System.out.println(main.canFormArray(new int[]{91, 2, 4, 64, 5, 78, 12, 9}, new int[][]{{78, 12, 3}, {4, 64, 5}, {91, 2}}));
//        System.out.println(main.getKthMagicNumber(5));
//        main.setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
//        System.out.println(main.distinctSubseqII("aba"));
//        System.out.println(main.atMostNGivenDigitSet(new String[]{"7"}, 8));
//        int[][] grid = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
//        System.out.println(main.shortestBridge(grid));
//        System.out.println(main.shortestSubarray(new int[]{1, 4, 1, -2, 1, 1, 3, -1, 2}, 3));
//        System.out.println(main.sumSubarrayMins(new int[]{3, 2, 1, 3, 4, 2}));
//        System.out.println(main.magicalString(6));
//        System.out.println(main.reachNumber(2));
//        System.out.println(main.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
//        System.out.println(main.reversePairs(new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647}));
//        System.out.println(main.numSubarrayBoundedMax(new int[]{2, 3, 1, 4, 9, 10, 4, 6}, 2, 8));
//        System.out.println(main.closestCost(new int[]{1, 7}, new int[]{3, 4}, 10));
//        System.out.println(main.minOperations(new int[]{5, 6, 4, 3, 1, 2}, new int[]{6, 3, 3, 1, 4, 5, 3, 4, 1, 3, 4}));
//        System.out.println(main.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//        main.nextPermutation(new int[]{1, 5, 1});
//        System.out.println(main.trap(new int[]{4, 2, 0, 3, 2, 5}));
//        main.sortColors(new int[]{2, 0, 2, 1, 1, 0});
//        System.out.println(main.largestRectangleArea(new int[]{6, 1, 5, 2, 4, 5, 9, 3}));
//        System.out.println(Arrays.toString(main.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(main.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
//        System.out.println(main.maximalRectangle4(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
//        System.out.println(main.canFinish(3, new int[][]{{1, 0}, {2, 1}, {0, 2}}));
//        System.out.println(main.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
//        System.out.println(Arrays.toString(main.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        System.out.println(main.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
//        System.out.println(main.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
//        System.out.println(main.maxCoins(new int[]{3, 1, 5, 8}));
//        System.out.println(main.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
//        System.out.println(main.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).toString());
//        System.out.println(main.subarraySum(new int[]{1, 2, 3, -1, -2}, 3));
//        main.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'D'}, 2);
//        ArrayList<List<Integer>> objects = new ArrayList<>();
//        recursion(new int[]{1, 2, 3, 4}, 0, objects);
//        System.out.println(objects.toString());
    }

    /**
     * 3. 无重复字符的最长子串
     *
     * @param str
     * @return
     */
    public int lengthOfLongestSubstring(String str) {
        //滑动窗口
        int n = str.length(), ret = 0;
        char[] s = str.toCharArray(), arr = new char[128];
        int left = 0, right = 0;
        while (right < n) {
            arr[s[right]]++;
            while (arr[s[right]] > 1) {
                arr[s[left++]]--;
            }
            right++;
            ret = Math.max(ret, right - left);
        }
        return ret;
    }

    /**
     * 5. 最长回文子串
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = (s1.length() > res.length()) ? s1 : res;
            res = (s2.length() > res.length()) ? s2 : res;
        }
        return res;
    }

    private String palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    /**
     * 6. Z 字形变换
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }


    // 复杂的
    public String longestPalindrome1(String s) {
        StringBuilder news = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            news.append('#').append(s.charAt(i));
        }
        news.append('#');
        //某个位置的回文半径
        int[] circleRadiusArr = new int[news.length()];
        // radiusIndex中心点；rMax以radiusIndex为中心回文的最大右位置的index，
        int radiusIndex = 0, rMaxIndex = 0;
        for (int i = 0; i < news.length(); i++) {
            // i关于radiusIndex的对称位置
            int mirror = 2 * radiusIndex - i;
            circleRadiusArr[i] = i < rMaxIndex ? Math.min(circleRadiusArr[mirror], rMaxIndex - i) : 1;
            //这里可以在news的首尾分别加上不等的字符来结束while；或者判断i + circleRadiusArr[i]的长度
            while (i + circleRadiusArr[i] < news.length() && i - circleRadiusArr[i] >= 0 &&
                    news.charAt(i + circleRadiusArr[i]) == news.charAt(i - circleRadiusArr[i])) {
                ++circleRadiusArr[i];
            }
            if (i + circleRadiusArr[i] > rMaxIndex) {
                radiusIndex = i;
                rMaxIndex = i + circleRadiusArr[i];
            }
        }

        int maxCenter = 0, maxLen = 0;
        for (int i = 0; i < circleRadiusArr.length; i++) {
            if (circleRadiusArr[i] > maxLen) {
                maxLen = circleRadiusArr[i];
                maxCenter = i;
            }
        }
        //实际的len为maxLen - 1，1为中心字符本身
        int startIndex = (maxCenter - maxLen + 1) / 2;
        return s.substring(startIndex, startIndex + maxLen - 1);
    }

    /**
     * 10. 正则表达式匹配
     * <p>
     * dp[i][j] =
     * dp[i][j - 1]
     * dp[i - 1][j]
     * dp[i - 1][j - 1]
     */
    public boolean isMatch(String s, String p) {
        int sL = s.length(), pL = p.length();
        //s 的前 i 个字符与 p 中的前 j 个字符是否能够匹配
        boolean dp[][] = new boolean[sL + 1][pL + 1];
        dp[0][0] = true;

        for (int i = 0; i <= sL; i++) {//从0开始，p为a*时
            for (int j = 1; j <= pL; j++) {
                if (p.charAt(j - 1) == '*') {
                    if (i == 0) dp[i][j] = dp[i][j - 1];
                    else dp[i][j] = dp[i - 1][j] || dp[i][j - 1];//0个p[j-1]
                } else {
                    if (match(s, p, i, j)) dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[sL][pL];
    }

    private boolean match(String s, String p, int i, int j) {
        if (i == 0) return false;
        if (p.charAt(j - 1) == '?') return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    /**
     * 32. 最长有效括号
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    //()()
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    //()(())
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

    /**
     * 72. 编辑距离
     * <p>
     * word1 = "horse", word2 = "ros" 3
     * word1 = "intention", word2 = "execution" 5
     */
    public int minDistance(String word1, String word2) {
        int w1 = word1.length(), w2 = word2.length();
        int dp[][] = new int[w1 + 1][w2 + 1];
        for (int i = 0; i <= w1; i++) dp[i][0] = i;
        for (int j = 0; j <= w2; j++) dp[0][j] = j;

        for (int i = 1; i <= w1; i++) {
            for (int j = 1; j <= w2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[w1][w2];
    }

    /**
     * 76. 最小覆盖子串
     *
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        int left = 0, right = 0;
        int[] tCnt = new int[128], winCnt = new int[128];
        char[] sChars = s.toCharArray(), tChars = t.toCharArray();
        for (char tChar : tChars) tCnt[tChar]++;
        int distance = 0, ansL = 0, minLen = Integer.MAX_VALUE;

        while (right < sChars.length) {
            char curChar = sChars[right];
            if (winCnt[curChar]++ < tCnt[curChar]) distance++;
            right++;
            while (distance == tChars.length) {
                char leftChar = sChars[left];
                if (right - left < minLen) {
                    minLen = right - left;
                    ansL = left;
                }
                if (winCnt[leftChar]-- == tCnt[leftChar]) distance--;
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(ansL, ansL + minLen);
    }

    /**
     * 115. 不同的子序列
     * <p>
     * 给你两个字符串 s 和 t ，统计并返回在 s 的 子序列 中 t 出现的个数，结果需要对 109 + 7 取模
     *
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {
        int sL = s.length(), tL = t.length();
        //s 的前 i 个字符与 p 中的前 j 个字符是否能够匹配
        int dp[][] = new int[sL + 1][tL + 1];
        for (int i = 0; i < sL; i++) dp[i][0] = 1;
        for (int i = 1; i <= sL; i++) {
            for (int j = 1; j <= tL; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[sL][tL];
    }

    public int numDistinct1(String s, String t) {
        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for (int j = 0; j < s.length() + 1; j++) dp[0][j] = 1;
        for (int i = 1; i < t.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                else dp[i][j] = dp[i][j - 1];
            }
        }
        return dp[t.length()][s.length()];
    }

    /**
     * 139.单词拆分
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    /**
     * 301. 删除无效的括号
     *
     * @param s
     * @return
     */
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        int lremove = 0, rremove = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') lremove++;
            else if (s.charAt(i) == ')') {
                if (lremove == 0) rremove++;
                else lremove--;
            }
        }
        helper(s, 0, lremove, rremove, ans);
        return ans;
    }

    private void helper(String s, int start, int lremove, int rremove, List<String> ans) {
        if (lremove == 0 && rremove == 0) {
            if (isValid(s)) ans.add(s);
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (i != start && s.charAt(i) == s.charAt(i - 1)) continue;
            if (lremove + rremove > s.length() - i) return;
            if (lremove > 0 && s.charAt(i) == '(')
                helper(s.substring(0, i) + s.substring(i + 1), i, lremove - 1, rremove, ans);
            if (rremove > 0 && s.charAt(i) == ')')
                helper(s.substring(0, i) + s.substring(i + 1), i, lremove, rremove - 1, ans);
        }
    }

    public List<String> removeInvalidParentheses1(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> currSet = new HashSet<>();

        currSet.add(s);
        while (true) {
            for (String str : currSet) {
                if (isValid(str)) ans.add(str);
            }
            if (ans.size() > 0) return ans;
            Set<String> nextSet = new HashSet<>();
            for (String str : currSet) {
                for (int i = 0; i < str.length(); i++) {
                    if (i > 0 && str.charAt(i) == str.charAt(i - 1)) continue;
                    if (str.charAt(i) == '(' || str.charAt(i) == ')')
                        nextSet.add(str.substring(0, i) + str.substring(i + 1));
                }
            }
            currSet = nextSet;
        }
    }

    private boolean isValid(String str) {
        char[] array = str.toCharArray();
        int count = 0;
        for (char c : array) {
            if (c == '(') count++;
            else if (c == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }

    /**
     * 394. 字符串解码
     *
     * @param s
     * @return
     */
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '[') {
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for (int i = 0; i < cur_multi; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stack_res.removeLast() + tmp);
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.parseInt(c + "");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }


    /**
     * 438. 找到字符串中所有字母异位词
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        int sL = s.length(), pL = p.length();
        List<Integer> ans = new ArrayList<>();
        if (sL < pL) return ans;
        int[] count = new int[26];
        for (int i = 0; i < pL; i++) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }
        int differ = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) differ++;
        }
        if (differ == 0) ans.add(0);
        for (int i = 0; i < sL - pL; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                --differ;
            } else if (count[s.charAt(i) - 'a'] == 0) {
                ++differ;
            }
            count[s.charAt(i) - 'a']--;

            if (count[s.charAt(i + pL) - 'a'] == -1) {
                --differ;
            } else if (count[s.charAt(i + pL) - 'a'] == 0) {
                ++differ;
            }
            count[s.charAt(i + pL) - 'a']++;
            if (differ == 0) ans.add(i + 1);
        }
        return ans;
    }

    /**
     * 647. 回文子串
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int length = s.length(), ans = 0;
        for (int i = 0; i < 2 * length - 1; i++) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
                ans++;
            }
        }
        return ans;
    }

    public int countSubstrings1(String s) {
        StringBuilder news = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            news.append('#').append(s.charAt(i));
        }
        news.append('#');
        //回文半径数组
        int[] circleRadiusArr = new int[news.length()];
        // radiusIndex中心点；rMax以radiusIndex为中心回文的最大右位置的index，
        int radiusIndex = 0, rMaxIndex = 0, ans = 0;
        for (int i = 0; i < news.length(); i++) {
            // i关于radiusIndex的对称位置
            int mirror = 2 * radiusIndex - i;
            circleRadiusArr[i] = i < rMaxIndex ? Math.min(circleRadiusArr[mirror], rMaxIndex - i) : 1;
            //这里可以在news的首尾分别加上不等的字符来结束while；或者判断i + circleRadiusArr[i]的长度
            while (i + circleRadiusArr[i] < news.length() && i - circleRadiusArr[i] >= 0 &&
                    news.charAt(i + circleRadiusArr[i]) == news.charAt(i - circleRadiusArr[i])) {
                ++circleRadiusArr[i];
            }
            if (i + circleRadiusArr[i] > rMaxIndex) {
                radiusIndex = i;
                rMaxIndex = i + circleRadiusArr[i];
            }
            ans += circleRadiusArr[i] / 2;
        }
        return ans;
    }

    /**
     * 792. 匹配子序列的单词数
     *
     * @param s
     * @param words
     * @return
     */
    public int numMatchingSubseq(String s, String[] words) {
        //int[]的length为2，int[0]为words[i],int[1]为words[i].charAt(int[1])
        //类似于广度遍历
        Queue<int[]>[] p = new Queue[26];
        for (int i = 0; i < 26; ++i) {
            p[i] = new ArrayDeque<int[]>();
        }
        for (int i = 0; i < words.length; ++i) {
            p[words[i].charAt(0) - 'a'].offer(new int[]{i, 0});
        }
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            int len = p[c - 'a'].size();
            while (len > 0) {
                int[] t = p[c - 'a'].poll();
                if (t[1] == words[t[0]].length() - 1) {
                    ++res;
                } else {
                    ++t[1];
                    p[words[t[0]].charAt(t[1]) - 'a'].offer(t);
                }
                --len;
            }
        }
        return res;
    }


    /**
     * 809. 情感丰富的文字
     *
     * @param s
     * @param words
     * @return
     */
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            if (expand(s, word)) {
                ++ans;
            }
        }
        return ans;
    }

    private boolean expand(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            char ch = s.charAt(i);
            int cnti = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                ++cnti;
                ++i;
            }
            int cntj = 0;
            while (j < t.length() && t.charAt(j) == ch) {
                ++cntj;
                ++j;
            }
            if (cnti < cntj) {
                return false;
            }
            if (cnti != cntj && cnti < 3) {
                return false;
            }
        }
        return i == s.length() && j == t.length();
    }


    /**
     * 816. 模糊坐标
     *
     * @param s
     * @return
     */
    public List<String> ambiguousCoordinates(String s) {
        int n = s.length() - 2;
        List<String> res = new ArrayList<String>();
        s = s.substring(1, s.length() - 1);
        for (int l = 1; l < n; ++l) {
            List<String> lt = getPos(s.substring(0, l));
            if (lt.isEmpty()) {
                continue;
            }
            List<String> rt = getPos(s.substring(l));
            if (rt.isEmpty()) {
                continue;
            }
            for (String i : lt) {
                for (String j : rt) {
                    res.add("(" + i + ", " + j + ")");
                }
            }
        }
        return res;
    }

    public List<String> getPos(String s) {
        List<String> pos = new ArrayList<String>();
        //非0开头或者单独数字0直接加入结果集合中
        if (s.charAt(0) != '0' || "0".equals(s)) {
            pos.add(s);
        }
        //拆分s，往中间插入小数点构造小数
        for (int p = 1; p < s.length(); ++p) {
            //排除00.11 || 0.10
            if ((p != 1 && s.charAt(0) == '0') || s.charAt(s.length() - 1) == '0') {
                continue;
            }
            pos.add(s.substring(0, p) + "." + s.substring(p));
        }
        return pos;
    }

    /**
     * 828. 统计子串中的唯一字符
     * 函数 countUniqueChars(s) 来统计字符串 s 中的唯一字符，并返回唯一字符的个数。
     * 本题将会给你一个字符串 s ，我们需要返回 countUniqueChars(t) 的总和，其中 t 是 s 的子字符串。输入用例保证返回值为 32 位整数。
     * <p>
     * 注意，某些子字符串可能是重复的，但你统计时也必须算上这些重复的子字符串（也就是说，你必须统计 s 的所有子字符串中的唯一字符）。
     * 贡献度
     * A AB ABA B BA A     1+2+1+1+2+1      (A)1*(空 AB)2+(BA A)2*1(空)     (AB B)2*2(空 BA)
     * A AB ABC B BC C     1+2+3+1+2+1
     * <p>
     * 当前字符c的位置——x_i 上一次出现c的位置——x_i-1 后一次出现c的位置——x_i+1
     * （x_i - x_i-1) * (x_i+1 - x_i)
     */
    public int uniqueLetterString(String s) {
        Map<Character, List<Integer>> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!charIndexMap.containsKey(c)) {
                charIndexMap.put(c, new ArrayList<>());
                charIndexMap.get(c).add(-1);
            }
            charIndexMap.get(c).add(i);
        }
        int res = 0;
        for (Map.Entry<Character, List<Integer>> entry : charIndexMap.entrySet()) {
            List<Integer> indexList = entry.getValue();
            indexList.add(s.length());
            for (int i = 1; i < indexList.size() - 1; i++) {
                res += (indexList.get(i) - indexList.get(i - 1)) * (indexList.get(i + 1) - indexList.get(i));
            }
        }
        return res;
    }

    /**
     * 854. 相似度为 K 的字符串
     * "abc", "bca"
     */
    public int kSimilarity(String s1, String s2) {
        int n = s1.length();
        Queue<Pair<String, Integer>> queue = new ArrayDeque<Pair<String, Integer>>();
        Set<String> visit = new HashSet<String>();
        queue.offer(new Pair<String, Integer>(s1, 0));
        visit.add(s1);
        int step = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                Pair<String, Integer> pair = queue.poll();
                String cur = pair.getKey();
                int pos = pair.getValue();
                if (cur.equals(s2)) {
                    return step;
                }
                while (pos < n && cur.charAt(pos) == s2.charAt(pos)) {
                    pos++;
                }
                for (int j = pos + 1; j < n; j++) {
                    if (s2.charAt(j) == cur.charAt(j)) {
                        continue;
                    }
                    if (s2.charAt(pos) == cur.charAt(j)) {
                        String next = swap(cur, pos, j);
                        if (!visit.contains(next)) {
                            visit.add(next);
                            queue.offer(new Pair<String, Integer>(next, pos + 1));
                        }
                    }
                }
            }
            step++;
        }
        return step;
    }


    private String swap(String cur, int i, int j) {
        char[] arr = cur.toCharArray();
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        return new String(arr);
    }

    /**
     * 940. 不同的子序列 II
     * 给定一个字符串 s，计算 s 的 不同非空子序列 的个数。因为结果可能很大，所以返回答案需要对 10^9 + 7 取余 。
     * <p>
     * 字符串的 子序列 是经由原字符串删除一些（也可能不删除）字符但不改变剩余字符相对位置的一个新字符串。
     * <p>
     * 例如，"ace" 是 "abcde" 的一个子序列，但 "aec" 不是。
     *
     * @param s
     * @return
     */
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        int total = 0;
        int[] f = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            int others = total - f[c]; // 不含 f[c] 的部分（由于取模的原因，这里的减法可能会产生负数）
            f[c] = total + 1; // 更新 f[c]
            total = ((f[c] + others) % mod + mod) % mod; // 更新 total，并保证 total 非负
        }
        return total;
    }

    /**
     * 1143. 最长公共子序列
     * <p>
     * dp[i][j] = dp[i-1][j-1]+1 ;t1[i]=t2[j]
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(), l2 = text2.length();
        //s 的前 i 个字符与 p 中的前 j 个字符 的最长
        int dp[][] = new int[l1 + 1][l2 + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[l1][l2];
    }

    /**
     * 1592. 重新排列单词间的空格
     * text = "  this   is  a sentence "
     * "this   is   a   sentence"
     */
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < text.length(); ) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
                i++;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (i < text.length() && text.charAt(i) != ' ') {
                stringBuilder.append(text.charAt(i));
                i++;
            }
            stringList.add(stringBuilder.toString());
        }
        StringBuilder ans = new StringBuilder();
        if (stringList.size() == 1) {
            ans.append(stringList.get(0));
            for (int i = 0; i < spaceCount; i++) {
                ans.append(' ');
            }
            return ans.toString();
        }
        int spaceSkip = spaceCount / (stringList.size() - 1);
        StringBuilder spaceStringBuilder = new StringBuilder();
        for (int i = 0; i < spaceSkip; i++) spaceStringBuilder.append(' ');
        String spaceString = spaceStringBuilder.toString();


        for (int i = 0; i < stringList.size(); i++) {
            ans.append(stringList.get(i));
            if (i != stringList.size() - 1) ans.append(spaceString);
        }

        int spaceRemain = spaceCount % (stringList.size() - 1);
        if (spaceRemain != 0) {
            StringBuilder spaceRemainStringBuilder = new StringBuilder();
            for (int i = 0; i < spaceRemain; i++) spaceRemainStringBuilder.append(' ');
            ans.append(spaceRemainStringBuilder.toString());
        }
        return ans.toString();
    }

    /**
     * 1668. 最大重复子字符串
     *
     * @param sequence
     * @param word
     * @return
     */
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int[] dp = new int[n + 10];
        int maxx = 0;
        for (int i = 1; i <= n; i++) {
            if (i - m < 0) continue;
            if (sequence.substring(i - m, i).equals(word)) {
                dp[i] = dp[i - m] + 1;
            }
            maxx = Math.max(dp[i], maxx);
        }
        return maxx;
    }

    /**
     * 1684. 统计一致字符串的数目
     * <p>
     * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
     * <p>
     * 请你返回 words 数组中 一致字符串 的数目。
     *
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            mask |= 1 << (c - 'a');
        }
        int res = 0;
        for (String word : words) {
            int mask1 = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                mask1 |= 1 << (c - 'a');
            }
            if ((mask1 | mask) == mask) {
                res++;
            }
        }
        return res;
    }

    /**
     * 1758. 生成交替二进制字符串的最少操作数
     * 对于一个长度为 n 的未知序列 A 而言，假设我们需要花费 cnt 次操作将其变为「从 0 开始的交替串」，
     * 那么我们想要将其变为「从 1 开始的交替串」则需要 n - cnt 次操作：
     *
     * @param s
     * @return
     */
    public int minOperations(String s) {
        int result = 0;
        char[] sc = s.toCharArray();
        char preChar = sc[0];
        for (int i = 1; i < sc.length; i++) {
            if (preChar == sc[i]) {
                preChar = preChar == '0' ? '1' : '0';
                result++;
            } else {
                preChar = sc[i];
            }
        }
        return Math.min(result, s.length() - result);
    }

    /**
     * 1781. 所有子字符串美丽值之和
     *
     * @param s
     * @return
     */
    public int beautySum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] cnt = new int[26];
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                cnt[s.charAt(j) - 'a']++;
                maxFreq = Math.max(maxFreq, cnt[s.charAt(j) - 'a']);
                int minFreq = s.length();
                for (int k = 0; k < 26; k++) {
                    if (cnt[k] > 0) {
                        minFreq = Math.min(minFreq, cnt[k]);
                    }
                }
                res += maxFreq - minFreq;
            }
        }
        return res;
    }

    /**
     * 1805. 字符串中不同整数的数目
     *
     * @param word
     * @return
     */
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<String>();
        int n = word.length(), p1 = 0, p2;
        while (true) {
            while (p1 < n && !Character.isDigit(word.charAt(p1))) {
                p1++;
            }
            if (p1 == n) {
                break;
            }
            p2 = p1;
            while (p2 < n && Character.isDigit(word.charAt(p2))) {
                p2++;
            }
            while (p2 - p1 > 1 && word.charAt(p1) == '0') { // 去除前导 0
                p1++;
            }
            set.add(word.substring(p1, p2));
            p1 = p2;
        }
        return set.size();
    }

    /**
     * 面试题 01.02. 判定是否互为字符重排
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] table = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            table[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            table[s2.charAt(i) - 'a']--;
            if (table[s2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 面试题 01.09. 字符串轮转
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

}
