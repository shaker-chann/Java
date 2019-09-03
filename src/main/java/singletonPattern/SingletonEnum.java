package singletonPattern;

public enum SingletonEnum {
    INSTANCE;
    private SingletonEnum(){
        System.out.println("构造方法执行--");
    }
    public SingletonEnum getInstance(){
        return INSTANCE;
    }
}
