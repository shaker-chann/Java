package designPattern.FlyweightPattern;

/**
 * @Description:
 * @PackageName: designPattern.FlyweightPattern
 * @Author: csc
 * @Create: 2020-09-25 15:51
 * @Version: 1.0
 */
public class Circle implements Shape {
    private String color;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(color + "---" + radius);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
