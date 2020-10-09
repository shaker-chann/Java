package designPattern.commandPattern;

/**
 * @Description:
 * @PackageName: designPattern.commandPattern
 * @Author: csc
 * @Create: 2020-10-09 15:45
 * @Version: 1.0
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
