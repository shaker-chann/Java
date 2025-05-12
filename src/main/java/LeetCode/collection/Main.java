package LeetCode.collection;

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
     * 621. 任务调度器
     * AXX AXX A
     * ABX ABX AB
     * ABC ABC AB
     * ABCD ABC AB
     * 提示
     * 给你一个用字符数组 tasks 表示的 CPU 需要执行的任务列表，
     * 用字母 A 到 Z 表示，以及一个冷却时间 n。每个周期或时间间隔允许完成一项任务。
     * 任务可以按任何顺序完成，但有一个限制：两个 相同种类 的任务之间必须有长度为 n 的冷却时间。
     * <p>
     * 返回完成所有任务所需要的 最短时间间隔 。
     *
     * @param tasks
     * @param n
     * @return
     */
    //tasks = ["A","A","A","B","B","B"], n = 2
    public int leastInterval(char[] tasks, int n) {
        int[] cnts = new int[26];
        for (char c : tasks) cnts[c - 'A']++;
        //max出现最多的次数，tot出现次数和max一样的字母的个数
        int max = 0, tot = 0;
        for (int i = 0; i < 26; i++) max = Math.max(max, cnts[i]);
        for (int i = 0; i < 26; i++) tot += max == cnts[i] ? 1 : 0;
        return Math.max(tasks.length, (n + 1) * (max - 1) + tot);
    }

    /**
     * 560. 和为 K 的子数组
     * <p>
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
     * <p>
     * 子数组是数组中元素的连续非空序列
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        // 前缀和（key）的次数（value）
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

    /**
     * 448. 找到所有数组中消失的数字
     * <p>
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        //将nums[i]为index位置，将nums[index]位置的数据加n，最后nums中小于n的数字
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

    /**
     * 406. 根据身高重建队列
     * <p>
     * 假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。
     * 每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
     * <p>
     * 请你重新构造并返回输入数组 people 所表示的队列。返回的队列应该格式化为数组 queue ，
     * 其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）
     *
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
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

    /**
     * 312. 戳气球
     * <p>
     * 有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
     * <p>
     * 现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。
     * 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。
     * <p>
     * 求所能获得硬币的最大数量。
     *
     * @param nums
     * @return
     */
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

    /**
     * 188. 买卖股票的最佳时机 IV
     * <p>
     * 给你一个整数数组 prices 和一个整数 k ，其中 prices[i] 是某支给定的股票在第 i 天的价格。
     * <p>
     * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。也就是说，你最多可以买 k 次，卖 k 次。
     * <p>
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     *
     * @param k
     * @param prices
     * @return
     */
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

    /**
     * 121. 买卖股票的最佳时机
     * <p>
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * <p>
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * <p>
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     *
     * @param prices
     * @return
     */
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

    /**
     * 240. 搜索二维矩阵 II
     * <p>
     * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
     * <p>
     * 每行的元素从左到右升序排列。
     * 每列的元素从上到下升序排列。
     *
     * @param matrix
     * @param target
     * @return
     */
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

    /**
     * 239. 滑动窗口最大值
     * <p>
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * <p>
     * 返回 滑动窗口中的最大值 。
     *
     * @param nums
     * @param k
     * @return
     */
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

    /**
     * 238. 除自身以外数组的乘积
     * <p>
     * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
     * <p>
     * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
     * <p>
     * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
     *
     * @param nums
     * @return
     */
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

    /**
     * 215. 数组中的第K个最大元素
     * <p>
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     * <p>
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * <p>
     * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * @param nums
     * @param k
     * @return
     */
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
     * 207. 课程表
     * <p>
     * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
     * <p>
     * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
     * <p>
     * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
     * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
     *
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

    /**
     * 169. 多数元素
     * <p>
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * @param nums
     * @return
     */
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

    /**
     * 128. 最长连续序列
     * <p>
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * <p>
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * @param nums
     * @return
     */
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

    /**
     * 85. 最大矩形
     * <p>
     * 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
     *
     * @param matrix
     * @return
     */
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

    /**
     * 581. 最短无序连续子数组
     * <p>
     * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
     * <p>
     * 请你找出符合题意的 最短 子数组，并输出它的长度。
     *
     * @param nums
     * @return
     */
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

    /**
     * 739. 每日温度
     * <p>
     * 提示
     * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     *
     * @param temperatures
     * @return
     */
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

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
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

    public int reachNumber(int target) {
        int result = 0, num = 0, t = Math.abs(target); // 由于target有负数情况，为了统一计算逻辑，所以取绝对值
        // 直到num值大于等于t，并且num减t是偶数()，才结束while循环
        while (num < t || (num - t) % 2 != 0)
            num += ++result; // num=1+2+3+4+……
        return result;
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

    /**
     * 902. 最大为 N 的数字组合
     * 给定一个按 非递减顺序 排列的数字数组 digits 。你可以用任意次数 digits[i] 来写的数字。例如，如果 digits = ['1','3','5']，我们可以写数字，如 '13', '551', 和 '1351315'。
     * <p>
     * 返回 可以生成的小于或等于给定整数 n 的正整数的个数 。
     *
     * @param digits
     * @param n
     * @return
     */
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


