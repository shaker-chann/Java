package accessModifier;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/30 14:30
 */
/*
它可以有默认的方法实现；可以有构造器；不能实例化；
类修饰符只能 public、或不写（不能写default）
抽象方法 public、protected、或不写；
具有方法体的方法只能 public；
 */
public abstract class AbstractDemo {
    int b = 0;
    private static final int a = 0;

    public AbstractDemo(){}

    public static void main(String[] args) {

    }

    public abstract void publicM1() ;
    abstract void defaultM1();
    protected abstract void protect1();
//    private abstract void privateM1();

    public void publicM() {}

    //不能有 default 方法
//    default void defaultM();
    // 不能有 private 和 protect 方法
    void privateM() {}
    void protect() {}
}

