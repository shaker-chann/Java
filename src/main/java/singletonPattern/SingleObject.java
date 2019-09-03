package singletonPattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/12 16:29
 * @Version 1.0
 **/
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){};
    public static SingleObject getInstance(){
        return instance;
    }

    public void show(){}
}
