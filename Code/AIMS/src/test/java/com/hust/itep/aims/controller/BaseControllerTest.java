package com.hust.itep.aims.controller;

import com.hust.itep.aims.entity.cart.CartMedia;
import com.hust.itep.aims.entity.media.Media;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BaseControllerTest {

    @Test
    void checkMediaInCart() {
        Media media = new Media();
        HomeController bController = new HomeController();
        CartMedia instance = bController.checkMediaInCart(media);
        assertNull(instance);
    }

    @Test
    void getListCartMedia() {
        PlaceOrderController bController = new PlaceOrderController();
        int instance = bController.getListCartMedia().size();
        assertEquals(instance, 0);
    }
}