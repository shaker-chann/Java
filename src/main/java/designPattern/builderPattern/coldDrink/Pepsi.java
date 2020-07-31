package designPattern.builderPattern.coldDrink;

import designPattern.builderPattern.coldDrink.ColdDrink;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:46
 * @Version: 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
