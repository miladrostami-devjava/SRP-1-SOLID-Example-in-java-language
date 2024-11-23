package com.test.resturantorderapp.ordermanager;

import com.test.resturantorderapp.order.Order;

import java.util.List;

//composition style replace inheritance method
public interface OrderManagement extends Order {
void processorOrder(String  orderId, double totalAmount, String notificationMessage, List<String> itemsToAdd, List<String> itemsToRemove);
}
