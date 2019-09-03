package sophisticatedApplications;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.List;

class MyClass{
	public void setName(String name) {
		
	}
	public void display(String str,List<String> list) {
		
	}
}

public class MethodParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<MyClass> clazz=MyClass.class;
		Method[] mtds=clazz.getMethods();
		for(Method m:mtds) {
			//方法名称
			System.out.print(m.getName());
			System.out.println("参数个数："+m.getParameterCount());
			//方法的参数类型
			Parameter[] parameters=m.getParameters();
			int index=0;
			for(Parameter p:parameters) {
				if(p.isNamePresent()) {
					System.out.println(index+"个参数信息");
					System.out.println("参数名"+p.getName());
					System.out.println("形参类型"+p.getType());
					System.out.println("泛型类型"+p.getParameterizedType());
				}
			}
			System.out.println("-------");
			//输出结果中的wait()和equals方法是从object类中继承过来的	
		}

	}

}
