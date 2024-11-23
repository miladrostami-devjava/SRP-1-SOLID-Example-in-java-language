package com.test.resturantorderapp.ordermanager;

import com.test.resturantorderapp.notification.OrderNotification;
import com.test.resturantorderapp.order.Order;
import com.test.resturantorderapp.taxcalculate.TaxCalculate;

import java.util.List;

public class OrderManagementImpl2 implements OrderManagement{
    private final Order order;
    private final TaxCalculate taxCalculate;
    private final OrderNotification orderNotification;

    public OrderManagementImpl2(Order order, TaxCalculate taxCalculate, OrderNotification orderNotification) {
        this.order = order;
        this.taxCalculate = taxCalculate;
        this.orderNotification = orderNotification;
    }

    @Override
    public void processorOrder(String orderId,double totalAmount,String notificationMessage,
    List<String> itemsToAdd,List<String> itemsToRemove) {
        System.out.println("order id for processor order :" + orderId);

        System.out.println("order item for processor order :" );
        System.out.println(order.getOrderItems());

        double totalCostWithTax = taxCalculate.calculationTotalTax(totalAmount);
        System.out.println("calculate tax for processor order :" + totalCostWithTax );

        System.out.println("notification for processor order :"   );
        orderNotification.orderNotification(notificationMessage);

        System.out.println("new order to items :" );
       for (String item: itemsToAdd){
           order.addOrderItems(item);
           System.out.println(item);
       }

        System.out.println("order item remove from items :" );
      for (String item:itemsToRemove){
          order.removeOrderItems(item);
          System.out.println(item);
      }

        System.out.println("clear all order items:");
        order.clearOrderItems();

        System.out.println("process for order successfully!!!!");
    }

    @Override
    public List<String> getOrderItems() {
        return order.getOrderItems();
    }

    @Override
    public void addOrderItems(String item) {
        order.addOrderItems(item);

    }

    @Override
    public void removeOrderItems(String item) {
order.removeOrderItems(item);
    }

    @Override
    public void clearOrderItems() {
order.clearOrderItems();
    }
}
