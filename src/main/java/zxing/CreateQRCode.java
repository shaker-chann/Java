package zxing;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreateQRCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=300;
		int height=300;
		String format="png";
		String contents="https://www.baidu.com/";
		HashMap hists=new HashMap();
		hists.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hists.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		hists.put(EncodeHintType.MARGIN,2);
		
		try {
			BitMatrix bitMatrix=new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height,hists);
			Path file=new File("F:/file/img.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
