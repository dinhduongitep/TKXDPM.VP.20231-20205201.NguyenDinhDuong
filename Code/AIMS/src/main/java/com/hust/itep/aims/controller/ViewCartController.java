package com.hust.itep.aims.controller;

import com.hust.itep.aims.service.CartService;


public class ViewCartController extends BaseController {

    CartService cartService = new CartService();

    public void checkAvailabilityOfProduct() {
        new CartService().checkAvailabilityOfProduct();
    }
    public int getCartSubtotal(){
        int subtotal = new CartService().calSubtotal();
        return subtotal;
    }
}
