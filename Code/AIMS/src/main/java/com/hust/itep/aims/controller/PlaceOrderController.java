package com.hust.itep.aims.controller;


import com.hust.itep.aims.entity.cart.CartMedia;
import com.hust.itep.aims.entity.invoice.Invoice;
import com.hust.itep.aims.entity.order.Order;
import com.hust.itep.aims.entity.order.OrderMedia;
import com.hust.itep.aims.entity.shipping.DeliveryInfo;
import com.hust.itep.aims.service.CartService;
import com.hust.itep.aims.utils.ErrorAlert;
import com.hust.itep.aims.utils.Utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;


public class PlaceOrderController extends BaseController {
    private static Logger LOGGER = Utils.getLogger(PlaceOrderController.class.getName());

    CartService cartService = new CartService();



    // Functional cohesion
    public void placeOrder() {
        cartService.checkAvailabilityOfProduct();
    }

    // Fuctional cohesion
    public Order createOrder() {
        Order order = new Order();
        for (Object object : cartService.getListMedia()) {
            CartMedia cartMedia = (CartMedia) object;
            OrderMedia orderMedia =
                    new OrderMedia(cartMedia.getMedia(), cartMedia.getQuantity(), cartMedia.getPrice());
            order.getlstOrderMedia().add(orderMedia);
        }
        return order;
    }

    // Procedural cohesion
    public Invoice createInvoice(Order order) {
        return new Invoice(order);
    }


    public DeliveryInfo processDeliveryInfo(HashMap info) throws InterruptedException, IOException {
        LOGGER.info("Process Delivery Info");
        LOGGER.info(info.toString());
        validateDeliveryInfo(info);
        DeliveryInfo deliveryInfo = new DeliveryInfo(
                String.valueOf(info.get("name")),
                String.valueOf(info.get("phone")),
                String.valueOf(info.get("province")),
                String.valueOf(info.get("address")),
                String.valueOf(info.get("instructions")));
        System.out.println(deliveryInfo.getProvince());
        return deliveryInfo;
    }
    // Coincidental cohesion
    public int validateDeliveryInfo(HashMap<String, String> info) {
        ValidateController valController = new ValidateController();

        if (!valController.validateName(info.get("name"))) {
            System.out.println("Invalid name!");
            ErrorAlert errorAlert = new ErrorAlert();
            errorAlert.createAlert("Error Message", null, "Invalid name!");
            errorAlert.show();
            throw new RuntimeException("Invalid name! Error!" );
        }
        if (!valController.validatePhoneNumber(info.get("phone"))) {
            System.out.println("Invalid phone number!");
            ErrorAlert errorAlert = new ErrorAlert();
            errorAlert.createAlert("Error Message", null, "Invalid phone number!");
            errorAlert.show();
            throw new RuntimeException("Invalid phone number! Error!" );
        }
        if (!valController.validateAddress(info.get("address"))) {
            System.out.println("Invalid address!");
            ErrorAlert errorAlert = new ErrorAlert();
            errorAlert.createAlert("Error Message", null, "Invalid address!");
            errorAlert.show();
            throw new RuntimeException("Invalid address! Error!" );
        }
        return 1;
    }
}
