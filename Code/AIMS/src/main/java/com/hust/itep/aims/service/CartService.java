package com.hust.itep.aims.service;



import com.hust.itep.aims.entity.cart.CartMedia;

import java.util.List;


public class CartService {

    private List<CartMedia> lstCartMedia;

    public CartService() {
    }

    public void checkAvailabilityOfProduct() {
        boolean check = true;
        for (CartMedia object : lstCartMedia) {
            CartMedia cartMedia = object;
            int requiredQuantity = cartMedia.getQuantity();
            int availQuantity = cartMedia.getMedia().getQuantity();
            if (requiredQuantity > availQuantity) check = false;
        }
        if(!check) throw new RuntimeException("Some media not available");
    }

    public int calSubtotal(){
        int total = 0;
        for (Object obj : lstCartMedia) {
            CartMedia cm = (CartMedia) obj;
            total += cm.getPrice()*cm.getQuantity();
        }
        return total;
    }

    public List getListMedia(){
        return lstCartMedia;
    }
}
