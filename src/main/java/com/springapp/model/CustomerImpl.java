package com.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerImpl implements Customer{


    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }
}

