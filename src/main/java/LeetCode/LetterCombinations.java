package LeetCode;/**
 * @author csc
 * @date 2019/12/6 0:11
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java
 * @description: 17. 电话号码的字母组合
 * @author: liu yan
 * @create: 2019/12/6 0:11
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        int len = digits.length();
        if (len == 0) return list;
        String[] strings = new String[len];
        for (int i = 0; i < len; i++) {
            switch (digits.charAt(i)) {
                case '2':
                    strings[i] = "abc";
                    break;
                case '3':
                    strings[i] = "def";
                    break;
                case '4':
                    strings[i] = "ghi";
                    break;
                case '5':
                    strings[i] = "jkl";
                    break;
                case '6':
                    strings[i] = "mno";
                    break;
                case '7':
                    strings[i] = "pqrs";
                    break;
                case '8':
                    strings[i] = "tuv";
                    break;
                case '9':
                    strings[i] = "wxyz";
                    break;
            }
        }
        list = getList(strings, 0, list, "");
        return list;
    }

    private List<String> getList(String[] strings, int i, List<String> list, String temp) {
        if (i < strings.length - 1) {
            for (int j = 0; j < strings[i].length(); j++) {
                list = getList(strings, i + 1, list, temp + strings[i].charAt(j));
            }
        } else {
            for (int j = 0; j < strings[i].length(); j++) {
                list.add(temp + strings[i].charAt(j));
            }
        }
        return list;
    }
}
