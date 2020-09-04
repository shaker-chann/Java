package designPattern.facadePattern;

/**
 * @Description:
 * @PackageName: designPattern.facadePattern
 * @Author: csc
 * @Create: 2020-09-04 16:23
 * @Version: 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
