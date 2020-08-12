package designPattern.prototypePattern.shape;

/**
 * @Description:
 * @PackageName: designPattern.prototypePattern.shape
 * @Author: csc
 * @Create: 2020-08-12 17:36
 * @Version: 1.0
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
