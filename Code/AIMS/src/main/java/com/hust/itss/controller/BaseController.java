package com.hust.itss.controller;

import com.hust.itss.entity.cart.Cart;
import com.hust.itss.entity.cart.CartMedia;
import com.hust.itss.entity.media.Media;
import com.hust.itss.service.CartService;
import com.hust.itss.service.MediaService;

import java.util.List;

public class BaseController {

    public CartMedia checkMediaInCart(Media media){
        return new CartService().checkMediaInCart(media);
    }

    public List getListCartMedia(){
        return new CartService().getListMedia();
    }
}
