package com.hust.itep.aims.controller;


import com.hust.itep.aims.entity.cart.Cart;
import com.hust.itep.aims.entity.cart.CartMedia;
import com.hust.itep.aims.entity.media.Media;
import com.hust.itep.aims.service.CartService;

import java.util.List;

public class BaseController {

    public CartMedia checkMediaInCart(Media media){
        return Cart.getCart().checkMediaInCart(media);
    }

    public List getListCartMedia(){
        return Cart.getCart().getListMedia();
    }
}
