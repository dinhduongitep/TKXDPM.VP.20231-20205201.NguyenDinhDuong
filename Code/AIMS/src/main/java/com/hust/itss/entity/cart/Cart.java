package com.hust.itss.entity.cart;

import com.hust.itss.entity.media.Media;

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
}
