package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/22 10:03
 * @Version 1.0
 **/
public class DynamicProxy implements InvocationHandler {
    //代理的真实对象
    public Object object;

    public  DynamicProxy (Object object){
        this.object=object;
    }

    /*
    动态代理类会在代理的类的方法执行前后执行需要代理的东西（方法等）
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before rent house");

        System.out.println("Method:" + method);
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(object,args);

        //在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after rent house");

        return null;
    }
}
