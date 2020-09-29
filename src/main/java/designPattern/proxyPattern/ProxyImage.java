package designPattern.proxyPattern;

/**
 * @Description:
 * @PackageName: designPattern.proxyPattern
 * @Author: csc
 * @Create: 2020-09-29 16:57
 * @Version: 1.0
 */
public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
