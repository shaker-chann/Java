package designPattern.FlyweightPattern;

import java.util.HashMap;

/**
 * @Description:
 * @PackageName: designPattern.FlyweightPattern
 * @Author: csc
 * @Create: 2020-09-25 15:53
 * @Version: 1.0
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("create");
        }
        return circle;
    }
}
