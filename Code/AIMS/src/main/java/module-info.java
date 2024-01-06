module com.hust.itep.aims {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires com.google.zxing;
    requires jasperreports;
    requires com.formdev.flatlaf;
//    requires distance.api;
//    requires com.google.zxing.javase;


    opens com.hust.itep.aims to javafx.fxml;
    exports com.hust.itep.aims;
    opens com.hust.itep.aims.view.cart to javafx.fxml;
    opens com.hust.itep.aims.view.invoice to javafx.fxml;
    opens com.hust.itep.aims.view.shipping to javafx.fxml;
    opens com.hust.itep.aims.view.home to javafx.fxml;
    opens com.hust.itep.aims.controller to javafx.fxml;
    opens com.hust.itep.aims.entity.media to javafx.base;
    exports com.hust.itep.aims.controller;
    exports com.hust.itep.aims.service;
    opens com.hust.itep.aims.service to javafx.fxml;
    exports com.hust.itep.aims.view.invoice;
}