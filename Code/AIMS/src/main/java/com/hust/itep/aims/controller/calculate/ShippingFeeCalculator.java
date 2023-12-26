package com.hust.itep.aims.controller.calculate;

import com.hust.itep.aims.service.OrderService;

interface ShippingFeeCalculator {
  public int calculateShippingFee(OrderService order);

}
