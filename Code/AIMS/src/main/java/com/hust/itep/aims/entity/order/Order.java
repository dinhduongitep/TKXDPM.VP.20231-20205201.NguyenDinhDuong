package com.hust.itep.aims.entity.order;

import com.hust.itep.aims.entity.shipping.DeliveryInfo;

import java.util.List;

public class Order {
    private int id;
    private int shippingFees;
    private int subtotal;
    private List lstOrderMedia;
    private DeliveryInfo deliveryInfo;


    public List<OrderMedia> getlstOrderMedia() {
        return this.lstOrderMedia;
    }

    public Order(int id, int shippingFees, int subtotal) {
        this.id = id;
        this.shippingFees = shippingFees;
        this.subtotal = subtotal;
    }

    public Order() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
//        this.shippingFees = deliveryInfo.calculateShippingFee(this);
        this.shippingFees = 10000;
    }
}
