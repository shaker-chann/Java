package designPattern.singletonPattern;

/**
 * @Description 饿汉
 * @Author csc
 * @Date 2019/8/12 16:39
 * @Version 1.0
 **/
public class SingletonHungary {
    private static SingletonHungary instance = new SingletonHungary();

    private SingletonHungary() {
    }

    public static SingletonHungary getInstance() {
        return instance;
    }
}
