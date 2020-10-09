package designPattern.commandPattern;

/**
 * @Description:
 * @PackageName: designPattern.commandPattern
 * @Author: csc
 * @Create: 2020-10-09 15:54
 * @Version: 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}
