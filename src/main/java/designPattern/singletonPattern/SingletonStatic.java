package singletonPattern;

/**
 * @Description 静态内部类实现
 * @Author shichao.chen
 * @Date 2019/8/12 16:50
 * @Version 1.0
 **/
public class SingletonStatic {
    private static class SingletonHolder{
        private static final SingletonStatic instance=new SingletonStatic();
    }
    private SingletonStatic(){}
    public static SingletonStatic getInstance(){
        return SingletonHolder.instance;
    }
}
