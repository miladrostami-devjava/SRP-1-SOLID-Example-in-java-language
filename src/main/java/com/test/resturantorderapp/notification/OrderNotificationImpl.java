package com.test.resturantorderapp.notification;

public class OrderNotificationImpl implements OrderNotification{
    @Override
    public void orderNotification(String notification) {
        System.out.println("Order Notification: " + notification);
    }
}
