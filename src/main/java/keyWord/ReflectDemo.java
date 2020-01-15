package keyWord;

import java.lang.reflect.*;

import static java.lang.System.out;


/**
 * @description:
 * @author: csc
 * @create: 2020/1/15 15:27
 */
public class ReflectDemo {
    private static final String fmt = "%14s: %s%n";

    public static void main(String[] args) throws ClassNotFoundException {
        // 1、通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object
        // 类型的对象，而我不知道你具体是什么类，用这种方法
        User p1 = new User();
        Class c1 = p1.getClass();

//        // 2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
//        // 这说明任何一个类都有一个隐含的静态成员变量 class
//        Class c2 = User.class;
//
//        // 3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
//        // 但可能抛出 ClassNotFoundException 异常
//        Class c3 = Class.forName("keyWord.User");

//        //获取父类私有属性值
//        System.out.println(getFieldValue(c1.newInstance(),"privateField"));

        System.out.println("类名：");
        System.out.println(c1.getSimpleName());

        System.out.println("属性：");
        Field[] fields = c1.getFields();
        for (Field field : fields){
            System.out.print(Modifier.toString(field.getModifiers()));
            System.out.print("  ");
            System.out.print(field.getType());
            System.out.print("  ");
            System.out.println(field.getName());
        }

        System.out.println("方法：");
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method method : declaredMethods){
            System.out.print(Modifier.toString(method.getModifiers()));
            System.out.print("  ");
            System.out.print(method.getReturnType());
            System.out.print("  ");
            System.out.println(method.getName());
        }

        System.out.println("构造函数：");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor :constructors){
            System.out.print(Modifier.toString(constructor.getModifiers()));
            System.out.print("  ");
            System.out.println(constructor.getName());
            Class<?>[] pType = constructor.getParameterTypes();
            Type[] gpType  = constructor.getGenericParameterTypes();
            for (int i = 0; i < pType.length; i++) {
                out.format(fmt, "ParameterType", pType[i]);
                out.format(fmt, "GenericParameterType", gpType[i]);
            }
            System.out.println(constructor.getParameterCount());
        }



    }
}
