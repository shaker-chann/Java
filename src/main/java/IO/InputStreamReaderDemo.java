package IO;

/*
 * InputStreamReader——将字节输入流转换成字符输入流
 * OutputStreamReader——将字节输出流转换成字符输出流
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		String line=null;
		while((line=br.readLine())!=null) {
			if(line.equals("exit"))
				System.exit(1);
			System.out.println("输出内容为："+line);
		}

	}

}
