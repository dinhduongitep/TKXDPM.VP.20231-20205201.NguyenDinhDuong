package com.hust.itep.aims.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    @Test
    public void test(){
        OrderService orderService = new OrderService();
        int instance = orderService.getAmount();
        assertNotNull(instance);
    }
}