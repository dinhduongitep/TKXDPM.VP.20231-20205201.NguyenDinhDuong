package com.hust.itep.aims.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateControllerTest {

    @Mock
    ValidateController validateController;

    @BeforeEach
    void setUp() throws Exception {
        validateController = new ValidateController();
    }
    @Test
     void validatePhoneNumber() {
        assertEquals(validateController.validatePhoneNumber("09"), false);
        assertEquals(validateController.validatePhoneNumber("0912345678"), true);
        assertEquals(validateController.validatePhoneNumber("a_"), false);
    }

    @Test
    void validateName() {
        assertEquals(validateController.validateName(""), false);
        assertEquals(validateController.validateName("Duong"), true);
        assertEquals(validateController.validateName("0_Duong"), false);
    }

    @Test
    void validateAddress() {
        assertEquals(validateController.validateAddress(""), false);
        assertEquals(validateController.validateAddress("so 1 Dai Co Viet"), true);
        assertEquals(validateController.validateAddress("hanoi"), true);
    }
}