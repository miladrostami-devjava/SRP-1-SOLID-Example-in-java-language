package com.test.resturantorderapp.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public  interface Order {
    List<String>  getOrderItems();
    void addOrderItems(String item);
    void removeOrderItems(String item);
    void clearOrderItems();

}
