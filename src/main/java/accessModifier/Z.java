package accessModifier;

class X{
    Y y = new Y();
    X(){
        System.out.print("X");
    }
}
class Y{
    Y(){
        System.out.print("Y");
    }
}
public class Z extends X{

    X x = new X();
    Z(){
        System.out.print("Z");
    }
    Y y = new Y();


    public static void main(String[] args) {
        new Z();
    }
}
