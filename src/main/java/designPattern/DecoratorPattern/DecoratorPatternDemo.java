package designPattern.DecoratorPattern;

/**
 * @Description:
 * @PackageName: designPattern.DecoratorPattern
 * @Author: csc
 * @Create: 2020-08-31 11:10
 * @Version: 1.0
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        System.out.println("circle normal");
        circle.draw();
        System.out.println("circle red");
        redCircle.draw();
    }
}
