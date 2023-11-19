package com.hust.itss.entity.order;

import java.math.BigInteger;

public class Order {
    private BigInteger id;
    private int shippingFees;
    private int subtotal;

    public Order(BigInteger id, int shippingFees, int subtotal) {
        this.id = id;
        this.shippingFees = shippingFees;
        this.subtotal = subtotal;
    }

    public Order() {};

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getShippingFees() {
        return shippingFees;
    }

    public void setShippingFees(int shippingFees) {
        this.shippingFees = shippingFees;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
