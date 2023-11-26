package com.hust.itep.aims.controller.calculate;

import com.hust.itep.aims.service.OrderService;

import java.util.Random;

public class CalculateShippingFee_v1 implements ShippingFeeCalculator{
  public int calculateShippingFee(OrderService order){
    Random rand = new Random();
    int fees = (int) (((rand.nextFloat() * 10) / 100) * order.getAmount());
    // LOGGER.info("Order Amount: " + order.getAmount() + " -- Shipping Fees: " + fees);
    return fees;
  }
}
