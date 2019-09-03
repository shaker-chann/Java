package keyWord;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/9/3 16:05
 * @Version 1.0
 **/
public class InnerClassDemo {
}

//成员内部类
class Circle {
    private double radius = 0;
    public static int count =1;
    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw {
        public void drawSahpe() {
            System.out.println(radius);  //外部类的private成员
            System.out.println(count);   //外部类的静态成员
        }
    }
}

//局部内部类
class People{
    public People() {

    }
}
class Man{
    public Man(){

    }

    public People getWoman(){
        class Woman extends People{   //局部内部类
            int age =0;
        }
        return new Woman();
    }
}

//匿名内部类;事件监听
abstract class Person {
    public abstract void eat();
}
class Demo {
    public static void main(String[] args) {
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}

//静态内部类
class Outter {
    public Outter() {

    }

    static class Inner {
        public Inner() {

        }
    }
}