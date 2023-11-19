package com.hust.itss.service;

import com.hust.itss.entity.cart.Cart;
import com.hust.itss.entity.cart.CartMedia;
import com.hust.itss.entity.media.Media;

import java.sql.SQLException;
import java.util.List;


public class CartService {

    private List<CartMedia> lstCartMedia;

    public CartMedia checkMediaInCart(Media media){
        for (CartMedia cartMedia : lstCartMedia) {
            if (cartMedia.getMedia().getId() == media.getId()) {
                return cartMedia;
            }
        }
        return null;
    }

    public List getListMedia() {
        return lstCartMedia;
    }

    public int calSubtotal(){
        int total = 0;
        for (Object obj : lstCartMedia) {
            CartMedia cm = (CartMedia) obj;
            total += cm.getPrice()*cm.getQuantity();
        }
        return total;
    }

    public void checkAvailabilityOfProduct() {
        boolean allAvai = true;
        for (Object object : lstCartMedia) {
            CartMedia cartMedia = (CartMedia) object;
            int requiredQuantity = cartMedia.getQuantity();
            int availQuantity = cartMedia.getMedia().getQuantity();
            if (requiredQuantity > availQuantity) allAvai = false;
        }
        if (!allAvai) throw new RuntimeException("Some media not available");
    }
}
