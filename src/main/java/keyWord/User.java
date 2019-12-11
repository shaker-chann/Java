package keyWord;

/**
 * @description: 公用的一个对象
 * @author: csc
 * @create: 2019/12/11 18:01
 */
public class User {
    public String id;
    public String name;
    public int age;

    public User(){}

    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return name + "_____" + age;
    }
}
