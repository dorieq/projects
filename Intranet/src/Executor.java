//package realization;

import java.util.ArrayList;

public class Executor {
    private ArrayList<Order> orders;

    public void setOrders(ArrayList<Order> orders){
        this.orders = orders;
    }
    public void manageOrders(){
        for(Order order: orders){
            orderType type = orderType.NEW;
            order.setType(type);
        }
        //orders.sort();
    }
}
