package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 77 组合
 * @author: csc
 * @create: 2020/2/4 20:52
 */
public class Combine {
    private List<List<Integer>> ans = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    int n, k;

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || k > n) return ans;
        this.n = n;
        this.k = k;
        dfs(1, 1);
        return ans;
    }

    // 回溯
    private void dfs(int start, int level) {
        if (level > k) {
            ans.add((List<Integer>) list.clone());
            return;
        }
        for (int i = start; i < n - (k - level); i++) {
            list.add(i);
            dfs(i+1,level+1);
            list.remove(list.size()-1);
        }
    }
}
