package designPattern.builderPattern.burger;

import designPattern.builderPattern.Item;
import designPattern.builderPattern.packing.Packing;
import designPattern.builderPattern.packing.Wrapper;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:41
 * @Version: 1.0
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
