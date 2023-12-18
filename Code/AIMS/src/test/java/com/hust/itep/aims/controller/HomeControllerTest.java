package com.hust.itep.aims.controller;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HomeControllerTest {

    @Test
    void getAllMedia() throws SQLException {
        HomeController homeController = new HomeController();
        assertNotNull(homeController.getAllMedia().size());
    }
}