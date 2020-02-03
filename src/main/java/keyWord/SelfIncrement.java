package keyWord;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/30 17:18
 */
public class SelfIncrement {

    public static void main(String[] args) {
        test1();
    }

    /*
1、i++有三项操作，将值赋给中间变量int temp=i;i=i+1;return i;
2、i=i++有四项操作，将值赋给中间变量int temp=i;i=i+1;i=temp；return i;
 */
    public static void test0() {
        int i = 0;
        i = i++;
        System.out.println(i);
    }

    public static void test1() {
        int i = 0;
        i = ++i;
        System.out.println(i);
    }

    public static void test2() {
        int i = 0;
        i++;
        System.out.println(i);
    }

    public static void test3() {
        int i = 0;
        ++i;
        System.out.println(i);
    }

}
