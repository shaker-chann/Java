package keyWord;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/15 15:12
 */
public class StaticDemo {
    /*
静态变量：又称为类变量，也就是说这个变量属于类的，类所有的实例都共享静态变量，可以直接通过类名来访问它。
静态变量在内存中只存在一份。
实例变量：每创建一个实例就会产生一个实例变量，它与该实例同生共死。

静态方法在类加载的时候就存在了，它不依赖于任何实例。所以静态方法必须有实现，也就是说它不能是抽象方法。

静态语句块在类初始化时运行一次。

非静态内部类依赖于外部类的实例，而静态内部类不需要。
静态内部类不能访问外部类的非静态的变量和方法。

静态变量和静态语句块优先于实例变量和普通语句块，静态变量和静态语句块的初始化顺序取决于它们在代码中的顺序
     */
}

class OuterClass {
    class InnerClass {
    }

    static class StaticInnerClass {
    }

    public static void main(String[] args) {
        // 'OuterClass.this' cannot be referenced from a static context
//        InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
