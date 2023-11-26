package com.hust.itep.aims.entity.cart;

import com.hust.itep.aims.entity.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartMedia> lstCartMedia;
    private static Cart cartInstance;
    private Cart(){
        lstCartMedia = new ArrayList<CartMedia>();
    }
    public static Cart getCart(){
        if(cartInstance == null) cartInstance = new Cart();
        return cartInstance;
    }

    public CartMedia checkMediaInCart(Media media){
        for (CartMedia cartMedia : lstCartMedia) {
            if (cartMedia.getMedia().getId() == media.getId()) return cartMedia;
        }
        return null;
    }

    public List getListMedia(){
        return lstCartMedia;
    }
}
