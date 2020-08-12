package designPattern.prototypePattern;

import designPattern.prototypePattern.shape.Shape;

/**
 * @Description:
 * @PackageName: designPattern.prototypePattern
 * @Author: csc
 * @Create: 2020-08-12 17:53
 * @Version: 1.0
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
