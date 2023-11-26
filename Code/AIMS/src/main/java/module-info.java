module com.hust.itep.aims {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hust.itep.aims to javafx.fxml;
    exports com.hust.itep.aims;
}