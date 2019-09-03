package IO;

//Reader是字符输入流，从数据源以字符为单位进行读取数据

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader(
				"F:\\file\\t1.txt"));
		String result=null;
		while((result=br.readLine())!=null)
			System.out.println(result);
		br.close();
	}

}
