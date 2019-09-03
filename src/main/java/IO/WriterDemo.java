package IO;

//Writer是字符输出流，以字符为单位

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立一个从键盘接收数据的扫描器
				Scanner scanner=new Scanner(System.in);
				FileWriter fw=null;
				try {
					fw=new FileWriter("F:\\file\\t1.txt");
					System.out.println("请输入内容：");
					String string=scanner.nextLine();
					//将数据写入文件中
					fw.write(string);
					System.out.println("success");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fw.close();
						scanner.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

	}

}
