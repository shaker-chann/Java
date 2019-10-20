package keyWord;

import java.util.HashSet;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/9/3 15:49
 * @Version 1.0
 **/
public class FinalDemo {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");

    }
}
