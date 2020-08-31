package designPattern.DecoratorPattern;

/**
 * @Description:
 * @PackageName: designPattern.DecoratorPattern
 * @Author: csc
 * @Create: 2020-08-31 10:59
 * @Version: 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle ");
    }
}
