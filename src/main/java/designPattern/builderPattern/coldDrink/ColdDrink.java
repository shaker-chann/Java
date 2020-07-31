package designPattern.builderPattern.coldDrink;

import designPattern.builderPattern.packing.Bottle;
import designPattern.builderPattern.Item;
import designPattern.builderPattern.packing.Packing;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:43
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
