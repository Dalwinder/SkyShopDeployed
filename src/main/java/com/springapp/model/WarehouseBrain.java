package com.springapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 28/09/2015.
 */
public class WarehouseBrain {
    private static WarehouseBrain warehouseBrain = new WarehouseBrain();
    List<WarehouseOrder> warehouseOrders = new ArrayList<WarehouseOrder>();
    List<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();

    private WarehouseBrain(){

    }

    public static WarehouseBrain getWarehouseBrain(){
        return warehouseBrain;
    }

    public List<WarehouseOrder> getWarehouseOrders() {
        return warehouseOrders;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public List<CustomerOrder> getAndRemoveCustomerOrders(int numOfOrders){
        //*****NEED TO MAKE SURE THERE ARE 6 ORDERS******
        List<CustomerOrder> listToReturn = customerOrders.subList(0, 6);
        for(int i = 0; i < numOfOrders; i++){
            customerOrders.remove(i);
        }
        return listToReturn;
    }

    //adds a product order to the list
    public void addProductOrder(WarehouseOrder warehouseOrder){
        warehouseOrders.add(warehouseOrder);
    }

    //adds a customer order to the list
    public void addCustomerOrder(CustomerOrder customerOrder){
        customerOrders.add(customerOrder);
    }
}
