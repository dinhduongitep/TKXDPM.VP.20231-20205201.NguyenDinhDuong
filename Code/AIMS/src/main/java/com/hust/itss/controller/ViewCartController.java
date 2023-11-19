package com.hust.itss.controller;

import com.hust.itss.service.CartService;

import java.sql.SQLException;

public class ViewCartController extends BaseController {

    public void checkAvailabilityOfProduct() {
        new CartService().checkAvailabilityOfProduct();
    }
    public int getCartSubtotal(){
        int subtotal = new CartService().calSubtotal();
        return subtotal;
    }
}
