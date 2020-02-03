package accessModifier;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/30 17:03
 */
public class ExtendsDemo extends AbstractDemo {
    public static void main(String[] args) {
        AbstractDemo abstractDemo = new ExtendsDemo();
    }
    @Override
    public void publicM1() {

    }

    @Override
    void defaultM1() {

    }

    @Override
    protected void protect1() {

    }
}
