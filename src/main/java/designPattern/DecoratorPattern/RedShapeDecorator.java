package designPattern.DecoratorPattern;

/**
 * @Description:
 * @PackageName: designPattern.DecoratorPattern
 * @Author: csc
 * @Create: 2020-08-31 11:07
 * @Version: 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        DecoratorMethod(decoratorShape);
    }

    private void DecoratorMethod(Shape decoratorShape) {
        System.out.println("border color red");
    }
}
