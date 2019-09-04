package keyWord;

public interface InterfaceDemo {
    //变量不能使用protected，privated,只能是public static final变量
    public static final int a = 0;
    public int c = 0;
    int b = 0;

    //方法不能使用protected，privated,方法且只能是public abstract
    public abstract void say1();
//    protected  void say2();
//    privated void say3();

    //抽象方法
    double calculate(int a);

    //默认方法
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    //静态方法
    static String msg() {
        return "静态方法";
    }

}
