package designPattern.FlyweightPattern;

/**
 * @Description:
 * @PackageName: designPattern.FlyweightPattern
 * @Author: csc
 * @Create: 2020-09-25 15:57
 * @Version: 1.0
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
