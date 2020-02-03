package accessModifier;

/*
不可以有默认的方法实现；不可以有构造器；不能实例化；
类修饰符只能 public、或不写（不能写default）
抽象方法 public、protected、或不写；
具有方法体的方法只能 public、default；
 */
public interface InterfaceDemo {
    int b = 0;
    public static final int a = 0;


    public void publicM();

    public static void staticM() {

    }

    // default 必须有方法体
    default void defaultM() {

    }
    // 不能有 private 和 protect 方法
    void privateM();
    void protect();
}
