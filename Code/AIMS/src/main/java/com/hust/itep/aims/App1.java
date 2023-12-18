package com.hust.itep.aims;

import com.hust.itep.aims.utils.Configs;
import com.hust.itep.aims.view.home.HomeScreenHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class App1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
                    HomeScreenHandler homeHandler = new HomeScreenHandler(primaryStage, Configs.HOME_PATH);
                    homeHandler.setScreenTitle("Home Screen");
//                    homeHandler.setImage();
                    homeHandler.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run() {
        launch();
    }
}
