package com.hust.itep.aims.entity.order;

import java.math.BigInteger;
import java.util.List;

public class Order {
    private BigInteger id;
    private int shippingFees;
    private int subtotal;
    private List lstOrderMedia;

    public List<OrderMedia> getlstOrderMedia() {
        return this.lstOrderMedia;
    }

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
