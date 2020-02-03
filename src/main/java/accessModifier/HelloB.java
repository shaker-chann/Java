package accessModifier;

/**
 * @description:
 * @author: csc
 * @create: 2020/2/3 14:08
 */
public class HelloB extends HelloA
{
    public HelloB()
    {
        System.out.println("constructor B");
    }
    {
        System.out.println("I’m B class");
    }
    static
    {
        System.out.println("static B");
    }
    public static void main(String[] args)
    {
        new HelloB();
    }
}
class HelloA
{
    public HelloA()
    {
        System.out.println("constructor A");
    }
    {
        System.out.println("I’m A class");
    }
    static
    {
        System.out.println("static A");
    }
}
