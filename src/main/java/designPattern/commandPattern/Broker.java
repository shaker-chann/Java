package designPattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @PackageName: designPattern.commandPattern
 * @Author: csc
 * @Create: 2020-10-09 15:51
 * @Version: 1.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();
    public void takeOrder(Order order){
        orderList.add(order);

    }

    public void placeOrders(){
        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
