package designPattern.DecoratorPattern;

/**
 * @Description:
 * @PackageName: designPattern.DecoratorPattern
 * @Author: csc
 * @Create: 2020-08-31 11:02
 * @Version: 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
