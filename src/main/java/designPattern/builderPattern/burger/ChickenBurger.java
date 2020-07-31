package designPattern.builderPattern.burger;

import designPattern.builderPattern.burger.Burger;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:45
 * @Version: 1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
