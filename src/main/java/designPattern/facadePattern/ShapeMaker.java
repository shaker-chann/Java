package designPattern.facadePattern;

/**
 * @Description:
 * @PackageName: designPattern.facadePattern
 * @Author: csc
 * @Create: 2020-09-04 16:21
 * @Version: 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
