package designPattern.bridgePattern.Shape;

import designPattern.bridgePattern.DrawApi.DrawApi;

/**
 * @Description:
 * @PackageName: designPattern.bridgePattern
 * @Author: csc
 * @Create: 2020-08-17 10:08
 * @Version: 1.0
 */
public class Circle extends Shape {
    int radius;

    public Circle(int radius, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius);
    }
}
