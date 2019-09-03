package IO;

//过滤输出输入流

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bi=null;
		bi=new BufferedInputStream(new FileInputStream(
				"F:\\file\\t1.txt"));
		int result=0;
		while((result=bi.read())!=-1)
			System.out.print((char)result);
		bi.close();

		
		PrintStream ps=new PrintStream(new FileOutputStream(
				"F:\\file\\t1.txt"));
		ps.println("这是PrintStream打印流文件中写数据");
		
		
	}

}
