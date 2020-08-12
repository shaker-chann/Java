package designPattern.prototypePattern.shape;

/**
 * @Description:
 * @PackageName: designPattern.prototypePattern.shape
 * @Author: csc
 * @Create: 2020-08-12 17:38
 * @Version: 1.0
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
