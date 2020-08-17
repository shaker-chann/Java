package designPattern.bridgePattern.Shape;

import designPattern.bridgePattern.DrawApi.DrawApi;

/**
 * @Description:
 * @PackageName: designPattern.bridgePattern
 * @Author: csc
 * @Create: 2020-08-17 10:06
 * @Version: 1.0
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
