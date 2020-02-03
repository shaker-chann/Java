package accessModifier;

import java.io.Serializable;

/**
 * @description:
 * @author: csc
 * @create: 2020/1/30 17:04
 */
public class ImplementDemo implements InterfaceDemo, Serializable {
    public static void main(String[] args) {
        System.out.println(a);
    }
    @Override
    public void publicM() {

    }

    @Override
    public void privateM() {

    }

    @Override
    public void protect() {

    }
}
