package sophisticatedApplications;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;


public class ClassDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.out.println("String类的Class类对象");
		Class strClass=Class.forName("java.lang.String");
		System.out.println(strClass);
		
		System.out.println("Float的Class类对象");
		Class fClass=Float.class;
		System.out.println(fClass);
		
		System.out.println("Date");
		Date nowTime=new Date();
		Class dateClass=nowTime.getClass();
		System.out.println(dateClass);
		System.out.println("date类的父类"+dateClass.getSuperclass());
		
		//构造方法
		Constructor[]  ctors=dateClass.getDeclaredConstructors();
		for(Constructor c:ctors) {
			int mod=c.getModifiers();
			System.out.print(Modifier.toString(mod));
			System.out.print(" "+c.getName()+"(");
			Class[] paramTypes=c.getParameterTypes();
			for(int i=0;i<paramTypes.length;i++) {
				if(i>0)
					System.out.print(",");
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		
		//public方法
		Method[] mtds=dateClass.getMethods();
		//所有方法
		Method[] methods=strClass.getMethods();
		for(Method m:mtds) {
			//获取方法修饰符
			int mod=m.getModifiers();
			System.out.print(Modifier.toString(mod));
			//使用Modifier工具类的方法获得真实的修饰符并输出
			Class retType=m.getReturnType();
			System.out.print(" "+retType.getName());
			//方法名称
			System.out.print(" "+m.getName()+"(");
			//方法的参数类型
			Class[] paramTypes=m.getParameterTypes();
			for(int i=0;i<paramTypes.length;i++) {
				if(i>0)
					System.out.print(",");
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		//构造一个实例对象，构造类中必须提供相应的缺省构造方法
		Object object=dateClass.newInstance();
		System.out.println(object);
		
	}

}
