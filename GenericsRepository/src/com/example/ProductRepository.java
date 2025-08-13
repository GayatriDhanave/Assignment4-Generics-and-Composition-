package com.example;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements Repository<Product, Long> {
    Map<Long, Product> products= new HashMap<>();


    @Override
    public void save (Product product) {
        products.put(product.getId(), product);
        System.out.println("Product saved");

    }

    @Override
    public Product findById (Long id) {
        return products.containsKey(id) ? products.get(id) : null;
    }
}
