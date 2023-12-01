package error.oom;

/**
 * @Description:
 * @PackageName: com.csc.demo1.other
 * @Author: csc
 * @Create: 2020-09-30 14:24
 * @Version: 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapOver {

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<Person, Integer>();
        try {
            Thread.sleep(10000);//给打开visualvm时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //循环添加对象到缓存
        for (int i = 0; i < 4000000; i++) {
            TestMemory t = new TestMemory();

            Person p = new Person("name" + i, i);
            map.put(p, i);
            p.setName(i + "lisi");
            map.remove(p);
        }
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("qqqq");
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 123;
    }
}
