package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (InputStream is = new FileInputStream("F:/file/t1.txt")) {
			byte[] buf = new byte[4096];
			int len, count = 0;
			while ((len = is.read(buf)) > 0) {
				for (int i = 0; i < len; i++)
					if (buf[i] == 97)
						count++;
			}
			System.out.println("'a's seen: " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("F:/file/t1.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();
 
            InputStream is = new FileInputStream("F:/file/t1.txt");
            int size = is.available();
 
            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            System.out.println("success");
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }

	}

}
