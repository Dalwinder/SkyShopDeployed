package com.springapp.controller.model;

import java.util.Date;
import java.util.Map;

/**
 * Created by Jo on 27/09/2015.
 */
public interface Order {

    //****customer order and purchase order*****

    void addProduct(ProductImpl name, Integer quantity);

    //return a map of products & quantities on this order
    Map<ProductImpl, Integer> getProducts();

    Double getTotalPrice();

    //returns the customer who placed the order
    String getCustomer();

    Date getDateOrderPlaced();

    void productDispatched(ProductImpl product, Integer quantity);

    //check products already dispatched from this order and the date they were dispatched and the quantity dispatched
    Map<ProductImpl, Map<Date, Integer>> getDispatchedProducts();

    void productDelivered(ProductImpl product, Integer quantity);

    //check products already delivered from this order, the date they were delivered and the quantity delivered
    Map<ProductImpl, Map<Date, Integer>> getDeliveredProducts();

}
