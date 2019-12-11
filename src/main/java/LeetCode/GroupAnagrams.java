package LeetCode;

import java.util.*;

/**
 * @description: 49. 字母异位词分组
 * @author: csc
 * @create: 2019/12/11 13:32
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newString = String.valueOf(chars);//chars.toString();
            System.out.println(newString);
            if (map.containsKey(newString)) {
                map.get(newString).add(s);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                res.add(temp);
                map.put(newString, temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        char[] chars = new char[]{'a','b','c'};
        //String.valueOf、StringBuffer.append以及System.out.print中都对char[]数组单独处理，即进行了重载，使之可以输出内容
        System.out.println(chars);
        System.out.println(chars.toString());//chars.toString() 输出的为地址
    }
}
