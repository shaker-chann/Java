package keyWord;

import IO.Person;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: Comparable接口的测试使用，内比较器
 * @author: csc
 * @create: 2019/12/11 17:46
 */
public class ComparableDemo implements Comparable<ComparableDemo> {

    //    //implements Comparable时实现的方法参数为object
//    @Override
//    public int compareTo(Object o) {
//
//        return 0;
//    }
    private String name;
    private Integer age;

    public ComparableDemo(String name, int age) {
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString() {
        return name + "_____" + age;
    }


    public static void main(String[] args) {
        ArrayList<ComparableDemo> arrayList = new ArrayList<>();
        arrayList.add(new ComparableDemo("哼哼", 22));
        arrayList.add(new ComparableDemo("小哈", 22));
        arrayList.add(new ComparableDemo("哼哼的博客", 25));
        arrayList.add(new ComparableDemo("哼哼", 23));
        arrayList.add(new ComparableDemo("奋斗的哼哼", 30));
        System.out.println("排序之前********************");
        for (ComparableDemo people : arrayList) {
            System.out.println(people);
        }
        //继承Comparable，重写compareTo后可以直接调用 排序
        //调用排序的方法
        Collections.sort(arrayList);

        System.out.println("排序之后*******************");
        for (ComparableDemo people : arrayList) {
            System.out.println(people);
        }

    }

    @Override
    public int compareTo(ComparableDemo o) {
        if (this.age == o.age) {
            // 调用String中重写的compareTo方法来比较name的大小
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}
