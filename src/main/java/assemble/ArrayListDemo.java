package assemble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(0, "b");
        list.add("c");
        list.add("d");

        System.out.println("list.get(1)" + list.get(1));
        list.remove(2);
        System.out.println("list.contains(\"c\") " + list.contains("c"));
        list.remove("d");
        list.set(0, "e");
        System.out.println("list.indexOf(\"a\") " + list.indexOf("a"));
        System.out.println("list.lastIndexOf(\"b\") " + list.lastIndexOf("b"));

        System.out.println("list的for遍历1：");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("list的for-each遍历2：");
        /**
         * for-each语法糖本质是通过Iterator遍历（基本数据类型没有Iterator为普通for通过索引遍历）;
         * list.remove删除倒数第二个元素是不会报错,删除其他元素时都会报错;
         *      因为删除倒数第二个后，再次调用hasNext()方法时（size为实时的大小）返回false
         *      恰好结束循环，但是最后一个元素不能打印了
         */
        for (String string : list) {
//            if (string.equals("e")) list.remove(string);
            System.out.println(string);
        }

        System.out.println("list的iterator 遍历：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
