package com.example;

public class Order {
    private Integer id;
    private Integer userId;
    private Product product;
    private int quantity;
    private double price;

    public Order (Integer id, Integer userId, Product product, int quantity) {
        this.id = id;
        this.userId = userId;
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice()*quantity;
    }

    public Integer getId () {
        return id;
    }

    public Integer getUserId () {
        return userId;
    }

    public Product getProduct () {
        return product;
    }

    public int getQuantity () {
        return quantity;
    }

    public double getPrice () {
        return price;
    }

    @Override
    public String toString () {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
