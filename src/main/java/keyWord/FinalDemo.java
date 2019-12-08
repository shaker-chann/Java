package keyWord;

import java.util.HashSet;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/9/3 15:49
 * @Version 1.0
 **/

final class A {
    public int a = 0;

    public void show() {
        System.out.println("A show");
    }
}

//继承类A报错
class B {
    public final void show() {
        System.out.println("B show");
    }
}

public class FinalDemo extends B {

    private static final int h = 0;
    private static final String string = "string";

    //重写final show报错
//    public void show(){
//
//    }
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
//        b = "a";//报错，final变量不能修改
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        System.out.println(hashSet);

//        h = 1;
//        string = "a";
        final A a1 = new A();
        a1.a = 1;
    }
}