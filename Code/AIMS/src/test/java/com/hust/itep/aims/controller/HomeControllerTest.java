package com.hust.itep.aims.controller;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @Test
    void getAllMedia() {
        HomeController homeController = new HomeController();
        assertNotNull(homeController.getAllMedia());
    }
}