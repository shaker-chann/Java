package designPattern.bridgePattern.DrawApi;

/**
 * @Description:
 * @PackageName: designPattern.bridgePattern
 * @Author: csc
 * @Create: 2020-08-17 10:05
 * @Version: 1.0
 */
public class Green implements DrawApi {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Green radius " + radius);
    }
}
