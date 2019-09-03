package IO;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream从数据源以字节为单位进行读取数据

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明文件字节输入流
		FileInputStream fis=null;
		try {
			//实例化
			fis=new FileInputStream(
					"src\\IO\\FileInputStreamDemo.java");
			//创建一个长度为1024的字节数组作为缓冲区
			byte[] bbuf=new byte[1024];
			int hasRead=0;
			while((hasRead=fis.read(bbuf))>0)
				//将缓冲区中的数据转换成字符输出
				System.out.println(new String(bbuf,0,hasRead));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
