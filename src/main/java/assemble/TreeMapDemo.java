package assemble;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "c");
        treeMap.put(2, "b");
        treeMap.put(4, "d"); // treeMap: {1=a, 2=b, 3=c, 4=d}
        treeMap.put(1, "a");

        treeMap.remove(4); // treeMap: {1=a, 2=b, 3=c}
        int sizeOfTreeMap = treeMap.size(); // sizeOfTreeMap: 3

        treeMap.replace(2, "e"); // treeMap: {1=a, 2=e, 3=c}

        Map.Entry entry = treeMap.firstEntry(); // entry: 1 -> a
        Integer key = treeMap.firstKey(); // key: 1
        entry = treeMap.lastEntry(); // entry: 3 -> c
        key = treeMap.lastKey(); // key: 3
        String value = treeMap.get(3); // value: c
        SortedMap sortedMap = treeMap.headMap(2); // sortedMap: {1=a}
        sortedMap = treeMap.subMap(1, 3); // sortedMap: {1=a, 2=e}

        Set setOfEntry = treeMap.entrySet(); // setOfEntry: [1=a, 2=e, 3=c]
        Collection<String> values = treeMap.values(); // values: [a, e, c]
        treeMap.forEach((integer, s) -> System.out.println(integer + "->" + s));
// output：
// 1 -> a
// 2 -> e
// 3 -> c
    }
}
