package com.hust.itep.aims.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {


    @Test
    void getCurrencyFormat() {
        String instance = Utils.getCurrencyFormat(5);
        assertEquals("5 ₫", instance);
    }


    @Test
    void md5() {
        String instance = Utils.md5("5");
        assertNotNull(instance);
        String instance2 = Utils.getToday();
        assertNotNull(instance2);
    }
}