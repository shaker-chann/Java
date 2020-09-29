package designPattern.proxyPattern;

/**
 * @Description:
 * @PackageName: designPattern.proxyPattern
 * @Author: csc
 * @Create: 2020-09-29 17:00
 * @Version: 1.0
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("demo");
        image.display();

        image.display();
    }
}
