package designPattern.proxyPattern;

/**
 * @Description:
 * @PackageName: designPattern.proxyPattern
 * @Author: csc
 * @Create: 2020-09-29 16:56
 * @Version: 1.0
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("init");
    }

    @Override
    public void display() {
        System.out.println("real deal");
    }
}
