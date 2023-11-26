package com.hust.itep.aims.controller.calculate;

import com.hust.itep.aims.service.OrderService;

public class CalculateController {
  /**
   * This method calculates the shipping fees of order.
   * 
   * @param order order
   * @return shippingFee
   */
  public int calculateShippingFee(OrderService order) {
    ShippingFeeCalculator cal = new CalculateShippingFee_v1();
    return cal.calculateShippingFee(order);
  }
  
}
