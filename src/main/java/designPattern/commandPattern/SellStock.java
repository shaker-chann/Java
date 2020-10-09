package designPattern.commandPattern;

/**
 * @Description:
 * @PackageName: designPattern.commandPattern
 * @Author: csc
 * @Create: 2020-10-09 15:47
 * @Version: 1.0
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
