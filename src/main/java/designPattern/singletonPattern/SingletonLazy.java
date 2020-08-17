package designPattern.singletonPattern;

/**
 * @Description 懒汉式
 * @Author csc
 * @Date 2019/8/12 16:33
 * @Version 1.0
 **/
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) instance = new SingletonLazy();
        return instance;
    }
}
