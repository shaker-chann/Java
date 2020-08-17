package proxy;

/**
 * @Description
 * @Author csc
 * @Date 2019/8/22 10:01
 * @Version 1.0
 **/
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("rent house");
    }

    @Override
    public void hello(String string) {
        System.out.println("hello + "+ string);
    }
}
