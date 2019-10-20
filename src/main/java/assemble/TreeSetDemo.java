package assemble;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet tree= new TreeSet(new MyComparator());
        tree.add(new Persion("zhangran"));
        tree.add(new Persion("zhang"));
        System.out.println(tree);

    }
}
class Persion implements Comparator
{
    String name;
    Persion(String name)
    {
        this.name = name;

    }
    public    String toString()
    {
        return this.name;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Persion p1 = (Persion)o1;
        Persion p2 = (Persion)o2;
        return p1.name.compareTo(p2.name);
    }
}

class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Persion p1 = (Persion)o1;
        Persion p2 = (Persion)o2;
        return p1.name.compareTo(p2.name);
    }

}
