package sophisticatedApplications;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//加载、连接和初始化三个步骤统称为类的加载

class Animal {
	public void say() {
		System.out.println("Animal类");
	}
}

public class MyClassLoader extends ClassLoader {
	public Class<?> findClass(String className) {
		byte[] data = loadClassData(className);
		return this.defineClass(className, data, 0, data.length);
	}

	public byte[] loadClassData(String className) {
		try {
			String path = this.getClass().getResource("/").getPath();
			path = path.substring(1);
			className = className.replace(".", "/");
			File classfile = new File(path + className + ".class");
			long len = classfile.length();
			byte[] raw = new byte[(int) len];
			FileInputStream fin = new FileInputStream(classfile);
			int r;
			r = fin.read(raw);
			if (r != len) {
				System.out.println("failed");
				return null;
			} else {
				return raw;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		MyClassLoader mcl = new MyClassLoader();
		Class<?> clazz = mcl.loadClass("sophisticatedApplications.Animal");
		Animal animal = (Animal) clazz.newInstance();
		animal.say();

	}

}
