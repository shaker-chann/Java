package designPattern.builderPattern.packing;

import designPattern.builderPattern.packing.Packing;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:41
 * @Version: 1.0
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
