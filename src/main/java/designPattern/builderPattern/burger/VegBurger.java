package designPattern.builderPattern.burger;

import designPattern.builderPattern.burger.Burger;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:44
 * @Version: 1.0
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
