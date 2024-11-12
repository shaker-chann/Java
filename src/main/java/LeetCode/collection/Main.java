package LeetCode.collection;

import javafx.util.Pair;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @Description: des
 * @PackageName: LeetCode.collection
 * @Author: csc
 * @Create: 2022-10-12 9:47
 * @Version: 1.0
 */

public class Main {

    public static void main(String[] args) {
        LocalDate end = LocalDate.of(2024, 9, 1);
        LocalDate now = LocalDate.now();
        System.out.println("attention:remain day is " + now.until(end, ChronoUnit.DAYS));

        Main main = new Main();
//        System.out.println(main.countSubstrings1("aaa"));
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
//        System.out.println(main.wordBreak("applepenapple", new ArrayList<>(Arrays.asList("apple", "pen"))));
//        System.out.println(main.findClosestElements(new int[]{1}, 1, 1).toString());
//
//        System.out.println(main.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
//        System.out.println(Arrays.toString(main.finalPrices(new int[]{10, 1, 1, 6})));
//
//        System.out.println(main.uniqueLetterString("ABA"));
//        System.out.println(main.reorderSpaces("  aa"));
//        System.out.println(main.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
//        System.out.println(main.maximumSwap(98368));
//        System.out.println(main.maximumSwap(1993));
//        main.rectangleArea(new int[][]{{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}});
//        System.out.println(Arrays.toString(main.frequencySort(new int[]{2, 3, 1, 3, 2})));
//        System.out.println(main.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
//        System.out.println(main.kSimilarity("abc", "bca"));
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
//        System.out.println(main.maxRepeating("ababc", "ab"));
//        System.out.println(main.reachNumber(2));
//        System.out.println(main.ambiguousCoordinates("(00011)"));
//        System.out.println(main.countConsistentStrings("ab", new String[]{"a", "ab", "abc"}));
//        System.out.println(main.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
//        System.out.println(main.reversePairs(new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647}));
//        System.out.println(main.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
//        System.out.println(main.numSubarrayBoundedMax(new int[]{2, 3, 1, 4, 9, 10, 4, 6}, 2, 8));
//        System.out.println(main.expressiveWords("heeellooo", new String[]{"hello"}));
//        System.out.println(main.minOperations("0100"));
//        System.out.println(main.closestCost(new int[]{1, 7}, new int[]{3, 4}, 10));
//        System.out.println(main.numDifferentIntegers("123"));
//        System.out.println(main.minOperations(new int[]{5, 6, 4, 3, 1, 2}, new int[]{6, 3, 3, 1, 4, 5, 3, 4, 1, 3, 4}));
//        System.out.println(main.beautySum("aabcbaa"));
//        System.out.println(main.isMatch("acdcb", "a*c?b"));
//        System.out.println(main.longestCommonSubsequence("abbbc", "abc"));
//        System.out.println(main.minDistance("leetcode", "etco"));//4
//        System.out.println(main.numDistinct("babgbag", "bag"));
//        System.out.println(main.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//        main.nextPermutation(new int[]{1, 5, 1});
//        System.out.println(main.trap(new int[]{4, 2, 0, 3, 2, 5}));
//        main.sortColors(new int[]{2, 0, 2, 1, 1, 0});
//        System.out.println(main.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(main.largestRectangleArea(new int[]{6, 1, 5, 2, 4, 5, 9, 3}));
//        System.out.println(Arrays.toString(main.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(main.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
//        System.out.println(main.maximalRectangle4(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
//        System.out.println(main.canFinish(3, new int[][]{{1, 0}, {2, 1}, {0, 2}}));
//        System.out.println(main.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
//        System.out.println(Arrays.toString(main.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        System.out.println(Arrays.toString(main.removeInvalidParentheses("()())()").toArray()));
//        System.out.println(main.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
//        System.out.println(main.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
//        System.out.println(main.maxCoins(new int[]{3, 1, 5, 8}));
//        System.out.println(main.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
//        System.out.println(main.findAnagrams("bbbcb", "cb").toString());
//        System.out.println(main.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).toString());
//        System.out.println(main.subarraySum(new int[]{1, 2, 3, -1, -2}, 3));
//        main.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'D'}, 2);
//        ArrayList<List<Integer>> objects = new ArrayList<>();
//        recursion(new int[]{1, 2, 3, 4}, 0, objects);
//        System.out.println(objects.toString());
    }

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

    //tasks = ["A","A","A","B","B","B"], n = 2
    public int leastInterval(char[] tasks, int n) {
        int[] cnts = new int[26];
        for (char c : tasks) cnts[c - 'A']++;
        int max = 0, tot = 0;
        for (int i = 0; i < 26; i++) max = Math.max(max, cnts[i]);
        for (int i = 0; i < 26; i++) tot += max == cnts[i] ? 1 : 0;
        return Math.max(tasks.length, (n + 1) * (max - 1) + tot);
    }


    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            //对n取余数，得到num原来的值
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }

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

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] < b[0])
                return 1;
            else if (a[0] > b[0])
                return -1;
            else
                return a[1] - b[1];
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            int[] cur = people[i];
            if (cur[1] <= i)
                list.add(cur[1], cur);
            else
                list.add(cur);
        }
        return list.toArray(new int[people.length][]);
    }

    // 左右两边补1
    public int maxCoins(int[] nums) {
        int length = nums.length;
        int[][] res = new int[length + 2][length + 2];
        int[] val = new int[length + 2];
        val[0] = val[length + 1] = 1;
        for (int i = 1; i <= length; i++) {
            val[i] = nums[i - 1];
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i + 2; j <= length + 1; j++) {
                for (int k = i + 1; k < j; k++) {
                    int sum = val[i] * val[k] * val[j];
                    sum += res[i][k] + res[k][j];
                    res[i][j] = Math.max(res[i][j], sum);
                }
            }
        }
        return res[0][length + 1];
    }

    public int maxProfit(int k, int[] prices) {
        if (prices.length < 2) return 0;

        int n = prices.length;
        k = Math.min(k, n / 2);
        //buy[k] 第k次买入后最大的收益
        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        for (int i = 1; i <= k; ++i) buy[i] = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j <= k; ++j) {
                buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }
        return sell[k];
    }

    //最大收益，最大的两个价差
    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int buy1 = -prices[0], sell1 = 0;
//        int buy2 = -prices[0], sell2 = 0;
//        for (int i = 1; i < n; ++i) {
//            buy1 = Math.max(buy1, -prices[i]);
//            sell1 = Math.max(sell1, buy1 + prices[i]);
//            buy2 = Math.max(buy2, sell1 - prices[i]);
//            sell2 = Math.max(sell2, buy2 + prices[i]);
//        }
//        return sell2;


        if (prices.length == 0) return 0;
        //0持有股票；1没有股票处于冷冻期；2没有股票非冷冻期
        int f0 = -prices[0], f1 = 0, f2 = 0;
        for (int i = 1; i < prices.length; i++) {
            int newF0 = Math.max(f0, f2 - prices[i]);
            int newF1 = f0 + prices[i];
            int newF2 = Math.max(f1, f2);
            f0 = newF0;
            f1 = newF1;
            f2 = newF2;
        }
        return Math.max(f1, f2);
    }

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

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) return true;
            else if (matrix[x][y] > target) y--;
            else x++;
        }
        return false;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        answer[0] = 1;
        //answer[i]第一次循环为nums[i]左边的累积；
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int right = 1;
        //answer[i]第二次循环再乘nums[i]右边的累积
        for (int i = nums.length - 1; i > 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int l, int r, int index) {
        int q = randomPartition(nums, l, r);
        if (q == index) return nums[q];
        return q < index ? quickSelect(nums, q + 1, r, index) : quickSelect(nums, l, q - 1, index);
    }

    private int randomPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, i, r);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int x = nums[r], i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] <= x) swap(nums, ++i, j);
        }
        swap(nums, i + 1, r);
        return i + 1;
    }

    List<List<Integer>> edges = new ArrayList<>();
    int[] visited;
    boolean valid = true;

    /**
     * @param numCourses    数量
     * @param prerequisites 先prerequisites[0]再prerequisites[1]的顺序
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indeg = new int[numCourses];
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
            indeg[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) queue.offer(i);
        }
        int visited = 0;
        while (!queue.isEmpty()) {
            visited++;
            Integer poll = queue.poll();
            for (Integer integer : edges.get(poll)) {
                if (--indeg[integer] == 0) queue.offer(integer);
            }
        }
        return visited == numCourses;


//        visited = new int[numCourses];
//        for (int i = 0; i < numCourses && valid; i++) {
//            if (visited[i] == 0) dfs(i);
//        }
//        return valid;
    }

    private void dfs(int pre) {
        visited[pre] = 1;
        for (Integer last : edges.get(pre)) {
            if (visited[last] == 0) {
                dfs(last);
                if (!valid) return;
            } else if (visited[last] == 1) {
                valid = false;
                return;
            }
        }
        visited[pre] = 2;
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int ans = 0;
        for (Integer num : set) {
            if (set.contains(num - 1)) continue;
            int count = 1, cur = num;
            while (set.contains(cur + 1)) {
                cur++;
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public int maximalRectangle4(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int maxArea = 0, cols = matrix[0].length;
        int[] leftLessMin = new int[cols], rightLessMin = new int[cols];
        Arrays.fill(leftLessMin, -1); //初始化为 -1，也就是最左边
        Arrays.fill(rightLessMin, cols); //初始化为 cols，也就是最右边
        int[] heights = new int[cols];
        for (int row = 0; row < matrix.length; row++) {
            //更新所有高度
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == '1') {
                    heights[col] += 1;
                } else {
                    heights[col] = 0;
                }
            }
            //更新所有leftLessMin
            int boundary = -1; //记录上次出现 0 的位置
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == '1') {
                    //和上次出现 0 的位置比较
                    leftLessMin[col] = Math.max(leftLessMin[col], boundary);
                } else {
                    //当前是 0 代表当前高度是 0，所以初始化为 -1，防止对下次循环的影响
                    leftLessMin[col] = -1;
                    //更新 0 的位置
                    boundary = col;
                }
            }
            //右边同理
            boundary = cols;
            for (int col = cols - 1; col >= 0; col--) {
                if (matrix[row][col] == '1') {
                    rightLessMin[col] = Math.min(rightLessMin[col], boundary);
                } else {
                    rightLessMin[col] = cols;
                    boundary = col;
                }
            }

            //更新所有面积
            for (int col = cols - 1; col >= 0; col--) {
                int area = (rightLessMin[col] - leftLessMin[col] - 1) * heights[col];
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    public int findUnsortedSubarray(int[] nums) {
        // right为最后一个递增最左边，left为第一个递增的最右边，
        int n = nums.length;
        int maxn = Integer.MIN_VALUE, right = -1;
        int minn = Integer.MAX_VALUE, left = -1;
        for (int i = 0; i < n; i++) {
            if (maxn > nums[i]) {
                right = i;
            } else {
                maxn = nums[i];
            }
            if (minn < nums[n - i - 1]) {
                left = n - i - 1;
            } else {
                minn = nums[n - i - 1];
            }
        }
        return right == -1 ? 0 : right - left + 1;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        //递减一直放入栈中
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                Integer preMinIndex = stack.pop();
                ans[preMinIndex] = i - preMinIndex;
            }
            stack.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        //寻找单调递升，right[i]是索引为i右边柱子的最高值的索引
        //递减的话
        int[] left = new int[length], right = new int[length];
        Arrays.fill(right, length);
        Stack<Integer> mono_stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.pop()] = i;
            }
            left[i] = mono_stack.isEmpty() ? -1 : mono_stack.peek();
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < length; i++) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }

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


    public void sortColors(int[] nums) {
        int length = nums.length, p0 = 0, p1 = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                ++p1;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if (p0 < p1) {
                    temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                p0++;
                p1++;
            }
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (index == -1 || ans.get(index)[1] < intervals[i][0]) {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
                index++;
            } else {
                ans.get(index)[1] = Math.max(ans.get(index)[1], intervals[i][1]);
            }
        }
        return ans.toArray(new int[index + 1][]);
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //水平翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        //对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public int trap(int[] height) {
        int sum = 0, leftMax = 0;
        int[] rightMax = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            leftMax = Math.max(leftMax, height[i - 1]);
            int min = Math.min(leftMax, rightMax[i]);
            if (min > height[i]) sum += min - height[i];
        }
        return sum;
    }

    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) j--;
            swap(nums, i, j);
        }
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int num = nums[j];
        nums[j] = nums[i];
        nums[i] = num;
    }

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

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

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


    public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        if (6 * n < m || 6 * m < n) return -1;

        int[] cnt1 = new int[7];
        int[] cnt2 = new int[7];
        int diff = 0;
        for (int i : nums1) {
            ++cnt1[i];
            diff += i;
        }
        for (int i : nums2) {
            ++cnt2[i];
            diff -= i;
        }
        if (diff == 0) return 0;
        else if (diff > 0) return help(cnt2, cnt1, diff);
        else return help(cnt1, cnt2, -diff);
    }

    public int help(int[] h1, int[] h2, int diff) {
        //h[i]改动影响差值为i的个数
        int[] h = new int[7];
        for (int i = 1; i < 7; ++i) {
            h[6 - i] += h1[i];
            h[i - 1] += h2[i];
        }
        int res = 0;
        for (int i = 5; i > 0 && diff > 0; --i) {
//            diff/i + (i-1)/i;
            int t = Math.min((diff + i - 1) / i, h[i]);
            res += t;
            diff -= t * i;
        }
        return res;
    }


    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int n = boxes.length;
        int[] p = new int[n + 1];
        int[] w = new int[n + 1];
        int[] neg = new int[n + 1];
        long[] W = new long[n + 1];
        for (int i = 1; i <= n; ++i) {
            p[i] = boxes[i - 1][0];
            w[i] = boxes[i - 1][1];
            if (i > 1) {
                neg[i] = neg[i - 1] + (p[i - 1] != p[i] ? 1 : 0);
            }
            W[i] = W[i - 1] + w[i];
        }

        Deque<Integer> opt = new ArrayDeque<Integer>();
        opt.offerLast(0);
        int[] f = new int[n + 1];
        int[] g = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            Integer first = opt.peekFirst();
            while (i - first > maxBoxes || W[i] - W[first] > maxWeight) {
                opt.pollFirst();
            }

            f[i] = g[first] + neg[i] + 2;

            if (i != n) {
                g[i] = f[i] - neg[i + 1];
                while (!opt.isEmpty() && g[i] <= g[opt.peekLast()]) {
                    opt.pollLast();
                }
                opt.offerLast(i);
            }
        }
        return f[n];
    }

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

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int x = Arrays.stream(baseCosts).min().getAsInt();
        if (x >= target) return x;

        boolean[] can = new boolean[target + 1];
        // res - target <= target - x
        // 上限
        int upper = 2 * target - x;
        for (int b : baseCosts) {
            if (b <= target) {
                can[b] = true;
            } else {
                upper = Math.min(upper, b);
            }
        }
        for (int t : toppingCosts) {
            // 可以取两次
            for (int count = 0; count < 2; ++count) {
                for (int i = target; i > 0; --i) {
                    if (can[i] && i + t > target) {
                        upper = Math.min(upper, i + t);
                    }
                    if (i - t > 0) {
                        can[i] = can[i] | can[i - t];
                    }
                }
            }
        }
        for (int i = 0; i <= upper - target; ++i) {
            if (can[target - i]) {
                return target - i;
            }
        }
        return upper;
    }


    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int best = Integer.MAX_VALUE, bestid = -1;
        for (int i = 0; i < n; ++i) {
            int px = points[i][0], py = points[i][1];
            if (x == px) {
                int dist = Math.abs(y - py);
                if (dist < best) {
                    best = dist;
                    bestid = i;
                }
            } else if (y == py) {
                int dist = Math.abs(x - px);
                if (dist < best) {
                    best = dist;
                    bestid = i;
                }
            }
        }
        return bestid;
    }

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

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        // last2表示nums中上一个大于right的索引，last1表示nums中上一个在l和r直接的索引
        int res = 0, last2 = -1, last1 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= left && nums[i] <= right) {
                last1 = i;
            } else if (nums[i] > right) {
                last2 = i;
                last1 = -1;//需要重新记
            }
            if (last1 != -1) {
                res += last1 - last2;
            }
        }
        return res;
    }

    public int countBalls(int lowLimit, int highLimit) {
        int result = 0;
        int[] resultMap = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i, index = 0;
            while (num > 0) {
                index += num % 10;
                num = num / 10;
            }
            resultMap[index] += 1;
        }
        for (int r : resultMap) result = Math.max(result, r);
        return result;
    }


    public int sumSubseqWidths(int[] nums) {
        final int MOD = 1000000007;
        Arrays.sort(nums);
        long res = 0;
        long x = nums[0], y = 2;
        for (int j = 1; j < nums.length; j++) {
            res = (res + nums[j] * (y - 1) - x) % MOD;
            x = (x * 2 + nums[j]) % MOD;
            y = y * 2 % MOD;
        }
        return (int) ((res + MOD) % MOD);
    }


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

    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length, minSuff = nums[n - 1];
        for (int i = n - 3; i >= 0; i--) {
            if (nums[i] > minSuff) {
                return false;
            }
            minSuff = Math.min(minSuff, nums[i + 1]);
        }
        return true;
    }


    //如果 i < j 且 nums[i] > 2*nums[j]
    //[1,3,2,3,1] 2  ;3>2*1 ,
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        return getReversePairs(nums, 0, nums.length - 1);
    }

    public int getReversePairs(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = (right - left) / 2 + left;
        // 统计翻转对个数
        int count = getReversePairs(nums, left, mid) + getReversePairs(nums, mid + 1, right);
        int i = left, j = mid + 1;
        while (i <= mid) {
            while (j <= right && (long) nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += j - mid - 1;
            i++;
        }
        // 归并排序
        int[] temp = new int[right - left + 1];
        int p = left, q = mid + 1, k = 0;
        while (p <= mid && q <= right) {
            temp[k++] = nums[p] <= nums[q] ? nums[p++] : nums[q++];
        }
        while (p <= mid) temp[k++] = nums[p++];
        while (q <= right) temp[k++] = nums[q++];

        for (int c = 0; c < temp.length; ++c) {
            nums[left + c] = temp[c];
        }
        return count;
    }

    public boolean splitArraySameAverage(int[] nums) {
        if (nums.length == 1) return false;
        int n = nums.length, m = n / 2;
        int sum = 0;
        for (int num : nums) sum += num;

        //剪枝
        boolean isPossible = false;
        for (int i = 1; i <= m; i++) {
            if (sum * i % n == 0) {
                isPossible = true;
                break;
            }
        }
        if (!isPossible) return false;

        // dp[i][x] 表示当前已从数组 nums 取出 i 个元素构成的和为 x 的可能性：
        // dp[i][x]  = dp[i-1][x]+ num[i-1]
        Set<Integer>[] dp = new Set[m + 1];
        for (int i = 0; i <= m; i++) {
            dp[i] = new HashSet<>();
        }
        dp[0].add(0);
        for (int num : nums) {
            for (int i = m; i >= 1; i--) {
                for (int x : dp[i - 1]) {
                    int curr = x + num;
                    //curr/i == sum/n == avg
                    if (curr * n == sum * i) {
                        return true;
                    }
                    dp[i].add(curr);
                }
            }
        }
        return false;
    }

    public int maximalSquare(char[][] matrix) {

        return 0;
    }

    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] l = new int[n + 2][n + 2], r = new int[n + 2][n + 2];
        int[][] u = new int[n + 2][n + 2], d = new int[n + 2][n + 2];
        int[][] g = new int[n + 2][n + 2];
        for (int i = 0; i < n + 2; i++) {
            Arrays.fill(g[i], 1);
        }
        for (int[] m : mines) {
            g[m[0] + 1][m[1] + 1] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //默认为0，dp[i][j]动态处理
                if (g[i][j] == 1) {
                    l[i][j] += l[i][j - 1] + 1;
                    u[i][j] += u[i - 1][j] + 1;
                }
                //从右向左，从下向上处理
                if (g[n - i + 1][n - j + 1] == 1) {
                    r[n - i + 1][n - j + 1] += r[n - i + 1][n - j + 2] + 1;
                    d[n - i + 1][n - j + 1] += d[n - i + 2][n - j + 1] + 1;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                ans = Math.max(ans, Math.min(Math.min(l[i][j], r[i][j]), Math.min(u[i][j], d[i][j])));
            }
        }
        return ans;
    }


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

    public int reachNumber(int target) {
        int result = 0, num = 0, t = Math.abs(target); // 由于target有负数情况，为了统一计算逻辑，所以取绝对值
        // 直到num值大于等于t，并且num减t是偶数()，才结束while循环
        while (num < t || (num - t) % 2 != 0)
            num += ++result; // num=1+2+3+4+……
        return result;
    }

    public int maxRepeating(String sequence, String word) {
        int n = sequence.length(), m = word.length();
        if (n < m) {
            return 0;
        }

        int[] fail = new int[m];
        Arrays.fill(fail, -1);
        for (int i = 1; i < m; ++i) {
            int j = fail[i - 1];
            while (j != -1 && word.charAt(j + 1) != word.charAt(i)) {
                j = fail[j];
            }
            if (word.charAt(j + 1) == word.charAt(i)) {
                fail[i] = j + 1;
            }
        }

        int[] f = new int[n];
        int j = -1;
        for (int i = 0; i < n; ++i) {
            while (j != -1 && word.charAt(j + 1) != sequence.charAt(i)) {
                j = fail[j];
            }
            if (word.charAt(j + 1) == sequence.charAt(i)) {
                ++j;
                if (j == m - 1) {
                    f[i] = (i >= m ? f[i - m] : 0) + 1;
                    j = fail[j];
                }
            }
        }

        return Arrays.stream(f).max().getAsInt();
    }

    public int[] bestCoordinate(int[][] towers, int radius) {
        int xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;
        for (int[] tower : towers) {
            int x = tower[0], y = tower[1];
            xMax = Math.max(xMax, x);
            yMax = Math.max(yMax, y);
        }
        int cx = 0, cy = 0;
        int maxQuality = 0;
        for (int x = 0; x <= xMax; x++) {
            for (int y = 0; y <= yMax; y++) {
                int[] coordinate = {x, y};
                int quality = 0;
                for (int[] tower : towers) {
                    int squaredDistance = getSquaredDistance(coordinate, tower);
                    if (squaredDistance <= radius * radius) {
                        double distance = Math.sqrt(squaredDistance);
                        quality += (int) Math.floor(tower[2] / (1 + distance));
                    }
                }
                if (quality > maxQuality) {
                    cx = x;
                    cy = y;
                    maxQuality = quality;
                }
            }
        }
        return new int[]{cx, cy};
    }

    public int getSquaredDistance(int[] coordinate, int[] tower) {
        return (tower[0] - coordinate[0]) * (tower[0] - coordinate[0]) +
                (tower[1] - coordinate[1]) * (tower[1] - coordinate[1]);
    }

    public int magicalString(int n) {
        int[] magic = new int[n + 1];
        magic[0] = 1;
        //初始化第二组起始数据
        int tail = 1, group = 2, value = 2, count = 2, result = 1;
        while (tail < n) {
            while (count-- > 0 && tail < n) { // 循环创建第"p"组内的"count"个元素，每个元素的值都是"value"
                magic[tail++] = value;
                if (value == 1) result++;
            }
            //确定下一组的value和count
            value = value ^ 3; // 确定第"p"组内元素的值"value"是多少。(通过与3异或，可以将1和2互换)
            count = magic[group++]; // 创建完第"p"组所有元素之后，获得下一组(即："p+1")需要创建的数字个数"count"
        }
        return result;
    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum = 0, index = "type".equals(ruleKey) ? 0 : "color".equals(ruleKey) ? 1 : 2;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(index))) sum++;
        }
        return sum;
    }

    /**
     * 输入：arr = [3,2,1,3,4,2]
     * 3
     * 2+2
     * 1+1+1
     * 3+1+1+1
     * 4+3+1+1+1
     * 2+2+2+1+1+1
     */
    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        final int MOD = 1000000007;
        //递增的栈
        Deque<Integer> monoStack = new ArrayDeque<Integer>();
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!monoStack.isEmpty() && arr[monoStack.peek()] > arr[i]) {
                monoStack.pop();
            }

            int k = monoStack.isEmpty() ? (i + 1) : (i - monoStack.peek());
            dp[i] = k * arr[i] + (monoStack.isEmpty() ? 0 : dp[i - k]);
            ans = (ans + dp[i]) % MOD;
            monoStack.push(i);
        }
        return (int) ans;
    }

    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        //前缀和
        long[] preSumArr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSumArr[i + 1] = preSumArr[i] + nums[i];
        }
        int res = n + 1;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i <= n; i++) {
            long curSum = preSumArr[i];
            //前缀和递增
            while (!queue.isEmpty() && curSum - preSumArr[queue.peekFirst()] >= k) {
                res = Math.min(res, i - queue.pollFirst());
            }
            while (!queue.isEmpty() && preSumArr[queue.peekLast()] >= curSum) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        return res < n + 1 ? res : -1;
    }

    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        List<int[]> island = new ArrayList<int[]>();
        Queue<int[]> queue = new ArrayDeque<int[]>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    grid[i][j] = -1;
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int x = cell[0], y = cell[1];
                        island.add(cell);
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dirs[k][0];
                            int ny = y + dirs[k][1];
                            if (nx >= 0 && ny >= 0 && nx < n && ny < n && grid[nx][ny] == 1) {
                                queue.offer(new int[]{nx, ny});
                                grid[nx][ny] = -1;
                            }
                        }
                    }
                    // 已经找到第一个小岛的所有坐标
                    for (int[] cell : island) {
                        queue.offer(cell);
                    }
                    int step = 0;
                    // 广度遍历知道遇到下一个小岛
                    while (!queue.isEmpty()) {
                        int sz = queue.size();
                        for (int k = 0; k < sz; k++) {
                            int[] cell = queue.poll();
                            int x = cell[0], y = cell[1];
                            for (int d = 0; d < 4; d++) {
                                int nx = x + dirs[d][0];
                                int ny = y + dirs[d][1];
                                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                    if (grid[nx][ny] == 0) {
                                        queue.offer(new int[]{nx, ny});
                                        grid[nx][ny] = -1;
                                    } else if (grid[nx][ny] == 1) {
                                        return step;
                                    }
                                }
                            }
                        }
                        step++;
                    }
                }
            }
        }
        return 0;
    }

    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        int maxLeft = 0;
        for (int i = 0; i < n - 1; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            if (maxLeft <= minRight[i + 1]) {
                return i + 1;
            }
        }
        return n - 1;
    }

    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];
        for (int student : students) {
            cnt[student]++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (--cnt[sandwiches[i]] == -1) return sandwiches.length - i;
        }
        return 0;
    }

    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s = Integer.toString(n);
        int m = digits.length, k = s.length();
        //n从前往后（从高位开始）开始遍历
        // dp[i][0] n的前i位小于s[i]的个数
        // dp[i][1] n的前i位等于是s[i]的个数，为0或1
        int[][] dp = new int[k + 1][2];
        dp[0][1] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < m; j++) {
                if (digits[j].charAt(0) == s.charAt(i - 1)) {
                    dp[i][1] = dp[i - 1][1];
                } else if (digits[j].charAt(0) < s.charAt(i - 1)) {
                    //digits中小于s[i]的个数
                    dp[i][0] += dp[i - 1][1];
                } else {
                    break;
                }
            }
            if (i > 1) {
                //前边位数相等后边位数小于s[i]的个数 + 一位数的个数 + 前边小于的个数（乘digits个数）后边digits任意都满足
                dp[i][0] += m + dp[i - 1][0] * m;
            }
        }
        return dp[k][0] + dp[k][1];
    }

    public int totalFruit(int[] fruits) {
        int n = fruits.length, ans = 0;
        int[] cnts = new int[n];
        for (int i = 0, j = 0, tot = 0; i < n; i++) {
            if (++cnts[fruits[i]] == 1) tot++;
            while (tot > 2) {
                if (--cnts[fruits[j++]] == 0) tot--;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }


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

    public int maxChunksToSorted(int[] arr) {
        int ans = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                max = Math.max(arr[i], max);
            } else if (arr[i] < i) {

            } else {
                ans++;
            }
        }
        return 0;
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public int getKthMagicNumber(int k) {
        int[] ans = new int[k + 1];
        ans[1] = 1;
        for (int i3 = 1, i5 = 1, i7 = 1, idx = 2; idx <= k; idx++) {
            int a = ans[i3] * 3, b = ans[i5] * 5, c = ans[i7] * 7;
            int min = Math.min(a, Math.min(b, c));
            if (min == a) i3++;
            if (min == b) i5++;
            if (min == c) i7++;
            ans[idx] = min;
        }
        return ans[k];
    }

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

    public int[] missingTwo(int[] nums) {
        //cur为理论上 1 到 N 的和
        int n = nums.length + 2, cur = n * (1 + n) / 2;
        for (int x : nums) cur -= x;
        // sum为缺失的两个数字和
        int sum = cur, t = cur / 2;
        // cur为理论上1到t的和，减去num数组中实际的和得到第一个数字
        cur = t * (1 + t) / 2;
        for (int x : nums) {
            if (x <= t) cur -= x;
        }
        return new int[]{cur, sum - cur};
    }

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

    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int i = 0; i < arr.length; i++) {
            boolean change = false;
            for (int[] piece : pieces) {
                int temp = i;
                for (int j = 0; j < piece.length && temp < arr.length; j++, temp++) {
                    if (arr[temp] == piece[j]) {
                        if (j == piece.length - 1) {
                            change = true;
                            if (temp != i) i = temp;
                            break;
                        }
                        continue;
                    } else if (temp == i) {
                        break;
                    }
                }
                if (change) break;
            }
            if (!change)
                return false;
        }
        return true;
    }

    /**
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

    public String swap(String cur, int i, int j) {
        char[] arr = cur.toCharArray();
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        return new String(arr);
    }

    /**
     * 698. 划分为k个相等的子集
     * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
     */
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) return false;
        Arrays.sort(nums);
        int s = sum / k;
        int[] bucket = new int[k];
        Arrays.fill(bucket, s);
        return dfs(nums, bucket, k, nums.length - 1);
    }

    private boolean dfs(int[] nums, int[] bucket, int k, int cur) {
        if (cur < 0) return true;
        for (int i = 0; i < k; i++) {
            if (bucket[i] == nums[cur] || bucket[i] - nums[cur] >= nums[0]) {
                bucket[i] -= nums[cur];
                if (dfs(nums, bucket, k, cur - 1)) return true;
                bucket[i] += nums[cur];
            }
        }
        return false;
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int cnt1 = numCountMap.get(a), cnt2 = numCountMap.get(b);
            return cnt1 != cnt2 ? cnt1 - cnt2 : b - a;
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 我们给出了一个（轴对齐的）二维矩形列表 rectangles 。 对于 rectangle[i] = [x1, y1, x2, y2]，其中（x1，y1）是矩形 i 左下角的坐标， 
     * (xi1, yi1) 是该矩形 左下角 的坐标， (xi2, yi2) 是该矩形 右上角 的坐标。
     * <p>
     * 计算平面中所有 rectangles 所覆盖的总面积 。任何被两个或多个矩形覆盖的区域应只计算 一次 。
     * <p>
     * 返回 总面积 。因为答案可能太大，返回 109 + 7 的 模 。
     */
    public int rectangleArea(int[][] rectangles) {
        final int MOD = 1000000007;
        List<Integer> list = new ArrayList<>();
        //获取矩形左右坐标对
        for (int[] info : rectangles) {
            list.add(info[0]);
            list.add(info[2]);
        }
        Collections.sort(list);
        long ans = 0;
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i - 1), b = list.get(i), len = b - a;
            if (len == 0) continue;
            List<int[]> lines = new ArrayList<>();
            //获取该左右坐标对范围内所有的上下坐标对
            for (int[] info : rectangles) {
                if (info[0] <= a && b <= info[2]) lines.add(new int[]{info[1], info[3]});
            }
            Collections.sort(lines, (l1, l2) -> {
                return l1[0] != l2[0] ? l1[0] - l2[0] : l1[1] - l2[1];
            });
            //获取上下坐标的不重叠和
            long tot = 0, l = -1, r = -1;
            for (int[] cur : lines) {
                if (cur[0] > r) {
                    tot += r - l;
                    l = cur[0];
                    r = cur[1];
                } else if (cur[1] > r) {
                    r = cur[1];
                }
            }
            tot += r - l;
            ans += tot * len;
            ans %= MOD;
        }
        return (int) ans;
    }

    /**
     * 1. 000 -> 111
     * 2. 000 -> 010
     * 3. 000 -> 101
     * 4. 000 -> 100
     */
    public int flipLights(int n, int presses) {
        if (presses == 0) return 1;
        if (n == 1) return 2;
        if (n == 2) return (presses == 1) ? 3 : 4;
        //n>2后
        return (presses > 2) ? 8 : (presses == 1) ? 4 : 7;
    }

    /**
     * 670. 最大交换
     * 非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值
     */
    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int size = charArray.length;
        int i = 0, maxIndex = 0, temp = 0;
        boolean change = false;
        for (; i < size; i++) {
            temp = charArray[i];
            for (int j = i + 1; j < size; j++) {
                if (charArray[i] < charArray[j] && temp <= charArray[j]) {
                    maxIndex = j;
                    temp = charArray[j];
                    change = true;
                }
            }
            if (change) break;
        }
        if (!change) return num;
        char toChangeV = charArray[i];
        charArray[i] = charArray[maxIndex];
        charArray[maxIndex] = toChangeV;
        return Integer.parseInt(new String(charArray));
    }

    public int minOperations(String[] logs) {
        int ans = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    break;
                case "../":
                    ans--;
                    if (ans < 0) ans = 0;
                    break;
                default:
                    ans++;
                    break;
            }
        }
        return ans;
    }


    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i < n - k; i++, index++) {
            ans[index] = i;
        }
        // 列表的前半部分相邻差均为 1，后半部分相邻差从 k 开始逐渐递减到 1
        for (int i = n - k, j = n; i <= j; i++, j--) {
            ans[index] = i;
            index++;
            if (i != j) {
                ans[index] = j;
                index++;
            }
        }
        return ans;
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

    //1475. 商品折扣后的最终价格
    public int[] finalPrices(int[] prices) {
        int length = prices.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            int j = i + 1;
            for (; j < length; j++) if (prices[j] <= prices[i]) break;

            if (j < prices.length) res[i] = prices[i] - prices[j];
            else res[i] = prices[i];
        }
        return res;
    }


    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int poppedIndex = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            for (; poppedIndex < popped.length; poppedIndex++) {
                if (!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        return stack.isEmpty();
    }

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int index = 0;
        for (int l = 0, r = n; l < n; l++, r++) {
            res[index++] = nums[l];
            res[index++] = nums[r];
        }
        return res;
    }

    public int lengthOfLIS(int[] nums) {
        int piles = 0;
        int[] top = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = piles;
            int poker = nums[i];
            while (left < right) {
                int mid = left + ((right - left) >> 1);
                if (top[mid] >= poker) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == piles) piles++;
            top[left] = poker;
        }
        System.out.println(Arrays.toString(top));
        return piles;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(dp[i - j * j], min);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static int maxProduct1(int[] nums) {
        int length = nums.length;
        int[] maxRes = new int[length], minRes = new int[length];
        maxRes[0] = nums[0];
        minRes[0] = nums[0];
        for (int i = 1; i < length; i++) {
            int max = maxRes[i - 1] * nums[i];
            int min = minRes[i - 1] * nums[i];
            maxRes[i] = Math.max(Math.max(max, min), nums[i]);
            minRes[i] = Math.min(Math.min(max, min), nums[i]);
        }
        int max = maxRes[0];
        for (int i = 1; i < length; i++) {
            if (maxRes[i] > max) max = maxRes[i];
        }
        return max;
    }

    //3,4,5,2
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length - 1;
        return Math.max((nums[0] - 1) * (nums[1] - 1), (nums[index] - 1) * (nums[index - 1] - 1));
    }

    // 最接近x的k个数字
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = arr.length - 1;

        for (int i = 0; i < arr.length - k; i++) {
            if (Math.abs(x - arr[l]) <= Math.abs(arr[r] - x)) r--;
            else l++;
        }
        for (int i = l; i <= r; i++) {
            res.add(arr[i]);
        }
        return res;
    }


    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 1, dp.length, Integer.MAX_VALUE);
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        if (dp[amount] != Integer.MAX_VALUE) return dp[amount];
        return -1;
    }

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


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.containsKey(another)) {
                return new int[]{map.get(another), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;
        int sumLen = length1 + length2, indexMin1 = sumLen / 2, indexMin2 = indexMin1;
        int index1 = 0, index2 = 0, cur = 0, midSum = 0, minTemp = 0;
        if (sumLen % 2 == 0) {
            indexMin1--;
        } else {
            indexMin1 = -1;
        }
        while ((index1 < length1 || index2 < length2) && cur <= indexMin2) {
            int a = index1 == length1 ? Integer.MAX_VALUE : nums1[index1];
            int b = index2 == length2 ? Integer.MAX_VALUE : nums2[index2];
            if (a < b) {
                minTemp = a;
                index1++;
            } else {
                minTemp = b;
                index2++;
            }
            if (cur == indexMin2 || cur == indexMin1) {
                midSum += minTemp;
            }
            cur++;
        }
        return indexMin1 == -1 ? midSum : midSum / 2.0;
    }

    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans += islandPerimeterDfs(i, j, grid);
                }
            }
        }
        return ans;
    }

    private int islandPerimeterDfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 1;
        if (grid[i][j] == 2) return 0;
        grid[i][j] = 2;
        return islandPerimeterDfs(i, j + 1, grid) +
                islandPerimeterDfs(i + 1, j, grid) +
                islandPerimeterDfs(i - 1, j, grid) +
                islandPerimeterDfs(i, j - 1, grid)
                ;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, maxAreaOfIslandDfs(i, j, grid));
                }
            }
        }
        return ans;
    }

    private int maxAreaOfIslandDfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + maxAreaOfIslandDfs(i, j + 1, grid) +
                maxAreaOfIslandDfs(i + 1, j, grid) +
                maxAreaOfIslandDfs(i - 1, j, grid) +
                maxAreaOfIslandDfs(i, j - 1, grid)
                ;
    }

    public double[] calcEquation1(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int nodeCount = 0;
        Map<String, Integer> variables = new HashMap<>();
        for (List<String> equation : equations) {
            variables.putIfAbsent(equation.get(0), nodeCount++);
            variables.putIfAbsent(equation.get(1), nodeCount++);
        }

        List<NodeIV>[] edge = new List[nodeCount];

        for (double value : values) {

        }
        return null;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        //为每个节点赋值一个唯一的key
        int nvars = 0;
        Map<String, Integer> variables = new HashMap<>();
        for (List<String> equation : equations) {
            if (!variables.containsKey(equation.get(0)))
                variables.put(equation.get(0), nvars++);
            if (!variables.containsKey(equation.get(1)))
                variables.put(equation.get(1), nvars++);
        }
        List<NodeIV>[] edges = new List[nvars];
        for (int i = 0; i < nvars; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < values.length; i++) {
            List<String> stringList = equations.get(i);
            Integer key0 = variables.get(stringList.get(0));
            Integer key1 = variables.get(stringList.get(1));
            edges[key0].add(new NodeIV(key1, values[i]));
            edges[key1].add(new NodeIV(key0, 1.0 / values[i]));
        }
        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String query0 = queries.get(i).get(0);
            String query1 = queries.get(i).get(1);
            if (!variables.containsKey(query0) || !variables.containsKey(query1)) {
                ans[i] = -1;
                continue;
            }
            int key0 = variables.get(query0);
            int key1 = variables.get(query1);
            if (key0 == key1) {
                ans[i] = 1.0;
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(key0);
            double[] ratios = new double[nvars];
            Arrays.fill(ratios, -1.0);
            ratios[key0] = 1.0;
            while (!queue.isEmpty() && ratios[key1] < 0) {
                Integer key = queue.poll();
                for (NodeIV pair1 : edges[key]) {
                    if (ratios[pair1.index] < 0) {
                        ratios[pair1.index] = ratios[key] * pair1.value;
                        queue.offer(pair1.index);
                    }
                }
            }
            ans[i] = ratios[key1];
        }
        return ans;
    }

    class NodeIV {
        int index;
        double value;

        public NodeIV(int index, double value) {
            this.index = index;
            this.value = value;
        }
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

    public static void recursion(int[] nums, int i, List<List<Integer>> res) {
        if (i >= nums.length) return;
        int size = res.size();
        for (int j = 0; j < size; j++) {
            List<Integer> newSub = new ArrayList<Integer>(res.get(j));
            newSub.add(nums[i]);
            res.add(newSub);
        }
        recursion(nums, i + 1, res);
    }


    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int p) {
        if (p >= word.length()) return true;
        if (i < 0 || i >= board.length ||
                j < 0 || j >= board[0].length ||
                word.charAt(p) != board[i][j]) return false;
        board[i][j] += 27;
        boolean ans = dfs(board, i + 1, j, word, p + 1) ||
                dfs(board, i, j + 1, word, p + 1) ||
                dfs(board, i - 1, j, word, p + 1) ||
                dfs(board, i, j - 1, word, p + 1);
        board[i][j] -= 27;
        return ans;
    }



}


