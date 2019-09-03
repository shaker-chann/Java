package singletonPattern;

/**
 * @Description 懒汉
 * @Author shichao.chen
 * @Date 2019/8/12 16:36
 * @Version 1.0
 **/
public class SingletonLazySecurity {
    private static SingletonLazySecurity instance;
    private SingletonLazySecurity(){}
    public static synchronized SingletonLazySecurity getInstance(){
        if (instance==null)instance=new SingletonLazySecurity();
        return instance;
    }
}
