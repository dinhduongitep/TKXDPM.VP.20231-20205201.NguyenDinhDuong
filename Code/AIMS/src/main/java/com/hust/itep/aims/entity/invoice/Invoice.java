package com.hust.itep.aims.entity.invoice;

import com.hust.itep.aims.entity.order.Order;

public class Invoice {

    private int id;
    private int totalAmount;
    private Order order;

    public Invoice(int id, int totalAmount, Order order) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.order = order;
    }

    public Invoice() {};

    public Invoice(Order order){
        this.order = order;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
