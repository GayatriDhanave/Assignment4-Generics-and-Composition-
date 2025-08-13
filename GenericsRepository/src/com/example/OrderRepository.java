package com.example;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository implements Repository<Order, Integer> {
    Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void save (Order order) {
        orders.put(order.getId(), order);
        System.out.println("Order saved");

    }

    @Override
    public Order findById (Integer integer) {
        return orders.containsKey(integer) ? orders.get(integer) : null;
    }
}
