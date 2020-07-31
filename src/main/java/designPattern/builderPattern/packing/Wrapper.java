package designPattern.builderPattern.packing;

import designPattern.builderPattern.packing.Packing;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:40
 * @Version: 1.0
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
