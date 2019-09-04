package keyWord;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/9/3 16:31
 * @Version 1.0
 **/
public class ExtendDemo {
    public static void main(String[] args) {
        Shape shape = new Circle1();
        System.out.println(shape.name);
        shape.printType();
        shape.printName();
    }
}
class Shape {
    public String name = "shape";

    public Shape(){
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class Circle1 extends Shape {
    public String name = "circle";

    public Circle1() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}