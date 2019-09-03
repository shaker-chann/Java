package IO;

//FileOutputStream往数据源以字节为单位写入数据

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立一个从键盘接收数据的扫描器
		Scanner scanner=new Scanner(System.in);
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("F:\\file\\t1.txt");
			System.out.println("请输入内容：");
			String string=scanner.nextLine();
			//将数据写入文件中
			fos.write(string.getBytes());
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
