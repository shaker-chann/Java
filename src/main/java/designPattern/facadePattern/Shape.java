package designPattern.facadePattern;

/**
 * @Description:
 * @PackageName: designPattern.facadePattern
 * @Author: csc
 * @Create: 2020-09-04 16:18
 * @Version: 1.0
 */
public interface Shape {
    void draw();
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}