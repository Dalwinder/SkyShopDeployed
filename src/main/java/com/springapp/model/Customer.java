package com.springapp.model;

import java.util.List;

public interface Customer {

    //logged in
    //guest

    //returns a list of the customers orders
    List<Order> getOrders();

    void addOrder(Order order);

    String getTitleAndFullName();
}
