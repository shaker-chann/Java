package keyWord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @description: Comparator的使用，外比较器
 * @author: csc
 * @create: 2019/12/11 17:52
 */
public class ComparatorDemo implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {
        if(o1.age-o2.age==0) {
            return o1.name.compareTo(o2.name) ;
        }
        return o1.age-o2.age;
    }

    public static void main(String[] args) {
        //创建一个集合
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("哼哼", 22));
        arrayList.add(new User("小哈", 22));
        arrayList.add(new User("哼哼的博客", 25));
        arrayList.add(new User("哼哼", 23));
        arrayList.add(new User("奋斗的哼哼", 30));
        System.out.println("排序之前********************");
        for (User people : arrayList) {
            System.out.println(people);
        }
        //调用排序的方法
        Collections.sort(arrayList,new ComparatorDemo());
        System.out.println("排序之后*******************");
        for (User people : arrayList) {
            System.out.println(people);
        }

    }
}
