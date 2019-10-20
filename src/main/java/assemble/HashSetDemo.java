package assemble;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("hashSet.size() "+hashSet.size());
        hashSet.remove(1);
        System.out.println("hashSet.contains(1) "+hashSet.contains(1));
        Iterator iterator = hashSet.iterator();
        for (Integer i : hashSet)
            System.out.println(i);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
