package zxing;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.imageio.ImageIO;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.apache.commons.lang3.StringUtils;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 * 画制定logo和制定描述的二维码
 *
 * @author csc
 */
public class ZXingCode {
    private static final int QRCOLOR = 0xFF000000; // 默认是黑色
    private static final int BGWHITE = 0xFFFFFFFF; // 背景颜色
    private static final int WIDTH = 400; // 二维码宽
    private static final int HEIGHT = 400; // 二维码高

    // 用于设置QR二维码参数
    private static Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>() {{
        put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);// 设置QR二维码的纠错级别（H为最高级别）具体级别信息
        put(EncodeHintType.CHARACTER_SET, "utf-8");// 设置编码方式
        put(EncodeHintType.MARGIN, 1);
    }};

    public static void main(String[] args) {
        File logoFile = new File("D:\\project\\CSC\\Java\\QrCode\\logo.png");
        File QrCodeFile = new File("D:\\project\\CSC\\Java\\QrCode/05.png");
        String url = "https://www.baidu.com/";
        String note = "123456789123456789";
        drawLogoQRCode(logoFile, QrCodeFile, url, note);
        Result result = readQrCode("D:\\project\\CSC\\Java\\QrCode/05.png");
        System.out.println(result.getText());
    }

    public static Result readQrCode(String path) {
        Result result = null;
        try {
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            File file = new File(path);
            BufferedImage image = ImageIO.read(file);
            // 定义二维码参数
            Map hints = new HashMap(1);
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            // 获取读取二维码结果
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
            result = multiFormatReader.decode(binaryBitmap, hints);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void easyDraw(File logoFile, File codeFile, String qrUrl, String note) {
        try {
            // 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
            BitMatrix bitMatrix = new MultiFormatWriter().encode(qrUrl, BarcodeFormat.QR_CODE, WIDTH, HEIGHT, hints);
            BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

            // 开始利用二维码数据创建Bitmap图片，分别设为黑（0xFFFFFFFF）白（0xFF000000）两色
            for (int x = 0; x < WIDTH; x++) {
                for (int y = 0; y < HEIGHT; y++) {
                    image.setRGB(x, y, bitMatrix.get(x, y) ? QRCOLOR : BGWHITE);
                }
            }

            // 处理logo
            Graphics2D graphics2D = image.createGraphics();
            BufferedImage logo = ImageIO.read(logoFile);
            graphics2D.drawImage(logo, WIDTH * 2 / 5, HEIGHT * 2 / 5, WIDTH * 2 / 10, HEIGHT * 2 / 10, null);
            graphics2D.dispose();
            logo.flush();

            // 自定义文本描述
            graphics2D.setFont(new Font("楷体", Font.BOLD, 30)); // 字体、字型、字号
            int strWidth = graphics2D.getFontMetrics().stringWidth(note);
            graphics2D.setColor(Color.BLACK);
            graphics2D.drawString(note, 200 - strWidth / 2, image.getHeight()); // 画文字

            image.flush();
            ImageIO.write(image, "png", codeFile); // TODO
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @Description: 生成带logo的二维码图片，logo不存在时就没有
     * @param: logoFile logo
     * @param: codeFile 生成的二维码文件
     * @param: qrUrl 二维码的内容：url or text
     * @param: note 二维码下方显示的文字
     * @return:
     **/
    public static void drawLogoQRCode(File logoFile, File codeFile, String qrUrl, String note) {
        try {
            // 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
            BitMatrix bitMatrix = new MultiFormatWriter().encode(qrUrl, BarcodeFormat.QR_CODE, WIDTH, HEIGHT, hints);
            BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

            // 开始利用二维码数据创建Bitmap图片，分别设为黑（0xFFFFFFFF）白（0xFF000000）两色
            for (int x = 0; x < WIDTH; x++) {
                for (int y = 0; y < HEIGHT; y++) {
                    image.setRGB(x, y, bitMatrix.get(x, y) ? QRCOLOR : BGWHITE);
                }
            }

            if (Objects.nonNull(logoFile) && logoFile.exists()) {
                // 构建绘图对象
                Graphics2D g = image.createGraphics();
                BufferedImage logo = ImageIO.read(logoFile);
                g.drawImage(logo, WIDTH * 2 / 5, HEIGHT * 2 / 5, WIDTH * 2 / 10, HEIGHT * 2 / 10, null);
                g.dispose();
                logo.flush();
            }
            image = dealNote(note, image);

            image.flush();
            ImageIO.write(image, "png", codeFile); // TODO
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage dealNote(String note, BufferedImage image) {
        // 自定义文本描述
        if (StringUtils.isNotEmpty(note)) {
            // 新的图片，把带logo的二维码下面加上文字
            BufferedImage outImage = new BufferedImage(WIDTH, 445, BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D outg = outImage.createGraphics();
            // 画二维码到新的面板
            outg.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
            // 画文字到新的面板
            outg.setColor(Color.BLACK);
            outg.setFont(new Font("楷体", Font.BOLD, 30)); // 字体、字型、字号
            int strWidth = outg.getFontMetrics().stringWidth(note);
            if (strWidth > 399) {
                // 长度过长就截取前面部分,并换行
                String note1 = note.substring(0, note.length() / 2);
                String note2 = note.substring(note.length() / 2, note.length());
                int strWidth1 = outg.getFontMetrics().stringWidth(note1);
                int strWidth2 = outg.getFontMetrics().stringWidth(note2);
                outg.drawString(note1, 200 - strWidth1 / 2, HEIGHT + (outImage.getHeight() - HEIGHT) / 2 + 12);
                BufferedImage outImage2 = new BufferedImage(400, 485, BufferedImage.TYPE_4BYTE_ABGR);
                Graphics2D outg2 = outImage2.createGraphics();
                outg2.drawImage(outImage, 0, 0, outImage.getWidth(), outImage.getHeight(), null);
                outg2.setColor(Color.BLACK);
                outg2.setFont(new Font("宋体", Font.BOLD, 30)); // 字体、字型、字号
                outg2.drawString(note2, 200 - strWidth2 / 2, outImage.getHeight() + (outImage2.getHeight() - outImage.getHeight()) / 2 + 5);
                outg2.dispose();
                outImage2.flush();
                outImage = outImage2;
            } else {
                outg.drawString(note, 200 - strWidth / 2, HEIGHT + (outImage.getHeight() - HEIGHT) / 2 + 12); // 画文字
            }
            outg.dispose();
            outImage.flush();
            image = outImage;
        }
        return image;
    }

}
