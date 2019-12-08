package LeetCode;/**
 * @author csc
 * @date 2019/12/6 10:15
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java
 * @description: 22. 括号生成
 * @author: liu yan
 * @create: 2019/12/6 10:15
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        DFS(list, 0, 0, n, new StringBuilder());
        return list;
    }

    private void DFS(List<String> list, int left, int right, int n, StringBuilder stringBuilder) {
        if (left > n || right > n) return;
        if (left == n && right == n) list.add(stringBuilder.toString());
        if (left >= right) {
            DFS(list, left + 1, right, n, stringBuilder.append('('));
            //StringBuilder 为对象
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            DFS(list, left, right + 1, n, stringBuilder.append(')'));
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
