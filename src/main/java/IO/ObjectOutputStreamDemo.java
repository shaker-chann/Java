package IO;

/*
 * 对象的序列化是将对象数据写到一个输出流的过程-ObjectOutputStream
 * 对象的反序列化是指从一个输入流中读取一个对象
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectOutputStream obs=new ObjectOutputStream(
				new FileOutputStream("F:\\file\\t1.txt"));
		Person person=new Person("zhangsan",18,"henan");
		obs.writeObject(person);
		obs.flush();
		System.out.println("success");
		
		ObjectInputStream ois=new ObjectInputStream(
				new FileInputStream("F:\\file\\t1.txt"));
		person=(Person)ois.readObject();
		System.out.println(person);

	}

}
