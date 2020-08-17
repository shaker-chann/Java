package keyWord;

/**
 * @Description Abstract demo
 * @Author csc
 * @Date 2019/9/3 15:45
 * @Version 1.0
 **/
public abstract class AbstractClass {
    public static final int a = 0;
    public int b = 0;
    protected int c = 0;
    private int d = 0;

    private void say1() {
    }

    //抽象方法必须为public或者protected
    public abstract void say2();

    protected abstract void say3();


}
