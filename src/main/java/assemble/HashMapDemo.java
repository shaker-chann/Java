package assemble;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");

        //iterator
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("("+entry.getKey()+","+entry.getValue()+")");
        }

        System.out.println("map.get(\"b\") "+map.get("b"));
        map.remove("c");
        System.out.println("map.containsKey(\"c\") "+map.containsKey("c"));
        System.out.println("map.containsValue(\"1\") "+map.containsValue("1"));
        System.out.println("map.size() "+map.size());

        //普遍的方式，二次遍历
        for (String key : map.keySet())
            System.out.println("key="+key+",value"+map.get(key));

        //推荐，容量大时
        for (Map.Entry<String,String>entry:map.entrySet())
            System.out.println("("+entry.getKey()+","+entry.getValue()+")");
        //遍历value
        for (String value : map.values())
            System.out.println(value);

        map.clear();
        System.out.println(map.isEmpty());

        Map<String,String> map1=new HashMap(map);
        System.out.println("map1.size() "+map1.size());
    }
}
