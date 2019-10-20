package assemble;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add(0,"b");
        list.add("c");
        list.add("d");

        System.out.println("list.get(1)"+list.get(1));
        list.remove(2);
        System.out.println("list.contains(\"c\") "+list.contains("c"));
        list.remove("d");
        list.set(0,"e");
        System.out.println("list.indexOf(\"a\") "+list.indexOf("a"));
        System.out.println("list.lastIndexOf(\"b\") "+list.lastIndexOf("b"));

        System.out.println("list的for遍历1：");
        for (int i = 0 ;i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println("list的for遍历2：");
        for (String string : list)
            System.out.println(string);

        System.out.println("list的iterator 遍历：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
