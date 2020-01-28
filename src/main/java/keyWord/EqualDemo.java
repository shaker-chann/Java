package keyWord;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/28 11:09
 */
public class EqualDemo {
    public static void main(String[] args) {
        int i = -1288;
        int j = -1288;
        System.out.println(i == j);//true，只要两个数字相等，就是true
        test1();
    }
    public static void test1(){
        Integer i = -1271;
        Integer j = -1271;
        System.out.print(i == j);//-128~127内为true；其他的为false;因为缓存就是-128~127（1byt）
        System.out.println(i.equals(j));//true：比较的是i的内容与j的内容
    }
    public static void test2(){
        int x=2;
        Integer y=2;
        Integer m=Integer.valueOf(2);
        Integer n=new Integer(2);
        System.out.println(x==y);//true
        System.out.println(x==m);//true
        System.out.println(x==n);//true

        System.out.println(y==m);//true
        System.out.println(y==n);//false

        System.out.println(m==n);//false
    }
}
