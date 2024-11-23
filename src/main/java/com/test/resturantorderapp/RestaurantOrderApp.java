package com.test.resturantorderapp;

import com.test.resturantorderapp.notification.OrderNotificationImpl;
import com.test.resturantorderapp.ordermanager.OrderImpl;
import com.test.resturantorderapp.ordermanager.OrderManagementImpl;
import com.test.resturantorderapp.ordermanager.OrderManagementImpl2;
import com.test.resturantorderapp.taxcalculate.TaxCalculateImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class RestaurantOrderApp
{
    public static void main( String[] args )
    {
        OrderImpl order = new OrderImpl();
        OrderNotificationImpl orderNotification = new OrderNotificationImpl();
        TaxCalculateImpl taxCalculate = new TaxCalculateImpl();

        //region with OrderManagementImpl


       // OrderManagementImpl orderManagement = new OrderManagementImpl(order);

//        orderManagement.addOrderItems("java 8 book ");
//        orderManagement.addOrderItems("spring security 6 book ");
//        orderManagement.addOrderItems("micro services with spring and jakarta ee  book ");
//        orderManagement.addOrderItems("https and web book ");
//        orderManagement.addOrderItems("design patterns book ");

//        System.out.println("show all order:");
//        orderManagement.getOrderItems();

//        System.out.println("add new order item:");
//        orderManagement.addOrderItems("post man book and guide");

//        System.out.println("show all order : next add new order item :");
//        orderManagement.getOrderItems();
//
//        System.out.println("remove order item : 3 number item");
//        orderManagement.removeOrderItems("https and web book ");


//        System.out.println("show all order next remove order 3 number:");
//        orderManagement.getOrderItems();
//
//
//        System.out.println("show next clear all items");
//        orderManagement.clearOrderItems();
        //endregion





        //region with OrderManagementImpl2

        OrderManagementImpl2 orderManagementImpl2 = new OrderManagementImpl2(order,taxCalculate,orderNotification);

orderManagementImpl2.addOrderItems("car6");
orderManagementImpl2.addOrderItems("car7");
orderManagementImpl2.addOrderItems("car8");
        List<String> itemsToAdd = List.of("car1","car2","car3","car4","car5");
        List<String> itemToRemove = List.of("car4");
        double totalAmount = 10000.5000;
        String notificationMessage = "order process for customers in restaurant at north area";

        orderManagementImpl2.processorOrder("RET342332",totalAmount,notificationMessage,itemsToAdd,itemToRemove);


        //endregion

    }
}
