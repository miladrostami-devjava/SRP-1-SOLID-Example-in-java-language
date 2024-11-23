package com.test.resturantorderapp.ordermanager;

import com.test.resturantorderapp.order.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderImpl implements Order {
    List<String> orderItems = new ArrayList<>();

    public OrderImpl() {
    }

    public OrderImpl(List<String> orderItems) {
        this.orderItems = orderItems;
    }


    @Override
    public List<String> getOrderItems() {
        return orderItems;
    }

    @Override
    public void addOrderItems(String item) {
orderItems.add(item);
    }

    @Override
    public void removeOrderItems(String item) {
orderItems.remove(item);
    }

    @Override
    public void clearOrderItems() {
orderItems.clear();
    }
}
