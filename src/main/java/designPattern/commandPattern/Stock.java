package designPattern.commandPattern;

/**
 * @Description:
 * @PackageName: designPattern.commandPattern
 * @Author: csc
 * @Create: 2020-10-09 15:41
 * @Version: 1.0
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("stock bought " + name + quantity);
    }

    public void sell() {
        System.out.println("stack sell " + name + quantity);
    }
}
