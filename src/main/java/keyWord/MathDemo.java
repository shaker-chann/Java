package keyWord;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/28 11:18
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.exp(3));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.random());// 输出[0,1)间的随机数
        System.out.println(Math.random() * 100);
        // Math.max(7,15);        // Math.min(7,15)


        System.out.println(Math.rint(1.5)); // 四舍五入
        System.out.println(Math.ceil(1.2)); // ceil 天花板
        floor();
        round();
        System.out.println(Math.toRadians(60));

    }

    public static void floor() {
        System.out.println(Math.floor(1.2)); // 1.0
        System.out.println(Math.floor(1.5)); // 1.0
        System.out.println(Math.floor(1.6)); // 1.0
        System.out.println(Math.floor(1)); // 1.0
    }

    public static void round() {
        // Math.round(x) = Math.floor(x + 0.5)
        System.out.println(Math.round(0.60)); // 1
        System.out.println(Math.round(0.50)); // 1
        System.out.println(Math.round(0.49)); // 0
        System.out.println(Math.round(-4.40)); // -4
        System.out.println(Math.round(-4.50)); // -4
        System.out.println(Math.round(-4.60)); // -5
    }
}
