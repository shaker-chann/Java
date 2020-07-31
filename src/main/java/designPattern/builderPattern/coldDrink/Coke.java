package designPattern.builderPattern.coldDrink;

import designPattern.builderPattern.coldDrink.ColdDrink;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:46
 * @Version: 1.0
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
