package designPattern.singletonPattern;

/**
 * @Description 双重校验锁
 * @Author csc
 * @Date 2019/8/12 16:41
 * @Version 1.0
 **/
public class SingletonDCL {
    private static SingletonDCL instance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) instance = new SingletonDCL();
            }
        }
        return instance;
    }
}
