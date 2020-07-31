package designPattern.builderPattern;

import designPattern.builderPattern.packing.Packing;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:38
 * @Version: 1.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
