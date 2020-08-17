package designPattern.bridgePattern;

import designPattern.bridgePattern.DrawApi.Green;
import designPattern.bridgePattern.DrawApi.Red;
import designPattern.bridgePattern.Shape.Circle;
import designPattern.bridgePattern.Shape.Shape;

/**
 * @Description:
 * @PackageName: designPattern.bridgePattern
 * @Author: csc
 * @Create: 2020-08-17 10:22
 * @Version: 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(1, new Red());
        Shape greenCircle = new Circle(11, new Green());

        redCircle.draw();
        greenCircle.draw();

    }
}
