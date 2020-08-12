package designPattern.prototypePattern;

import designPattern.prototypePattern.shape.Circle;
import designPattern.prototypePattern.shape.Rectangle;
import designPattern.prototypePattern.shape.Shape;

import java.util.Hashtable;

/**
 * @Description:
 * @PackageName: designPattern.prototypePattern.shape
 * @Author: csc
 * @Create: 2020-08-12 17:40
 * @Version: 1.0
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
