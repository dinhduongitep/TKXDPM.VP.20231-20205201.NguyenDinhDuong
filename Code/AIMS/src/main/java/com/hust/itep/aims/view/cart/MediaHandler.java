package com.hust.itep.aims.view.cart;

import com.hust.itep.aims.entity.cart.Cart;
import com.hust.itep.aims.entity.cart.CartMedia;
import com.hust.itep.aims.utils.Configs;
import com.hust.itep.aims.utils.Utils;
import com.hust.itep.aims.view.FXMLScreenHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;


public class MediaHandler extends FXMLScreenHandler {

    private static Logger LOGGER = Utils.getLogger(MediaHandler.class.getName());

    @FXML
    protected HBox hboxMedia;

    @FXML
    protected ImageView image;

    @FXML
    protected Label labelOutOfStock;

    @FXML
    protected Label quantity;

    @FXML
    protected Label title;

    @FXML
    protected Label price;

    @FXML
    protected Button deleteBtn;

    private CartScreenHandler cartScreen;

    private CartMedia cartMedia;

    private Spinner<Integer> spinner;


    public MediaHandler(String screenPath, CartScreenHandler cartScreen) throws IOException {
        super(screenPath);
        this.cartScreen = cartScreen;
        hboxMedia.setAlignment(Pos.CENTER);
    }

    public void setCartMedia(CartMedia cartMedia) {
        this.cartMedia = cartMedia;
        setMediaInfo();
    }

    private void setMediaInfo() {
        title.setText(cartMedia.getMedia().getTitle());
        price.setText(Utils.getCurrencyFormat(cartMedia.getPrice()));
        quantity.setText(String.valueOf(cartMedia.getQuantity()));

//        File file = new File(cartMedia.getMedia().getImageUrl());
//        Image im = new Image(file.toURI().toString());
//        image.setImage(im);
//        image.setPreserveRatio(false);
//        image.setFitHeight(110);
//        image.setFitWidth(92);

        // add delete button
        deleteBtn.setFont(Configs.REGULAR_FONT);
        deleteBtn.setOnMouseClicked(e -> {
            try {
                Cart.getCart().removeCartMedia(cartMedia); // update user cart
                cartScreen.updateCart(); // re-display user cart
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        });
        initializeSpinner();
    }

    private void initializeSpinner(){
        SpinnerValueFactory<Integer> valueFactory = //
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, cartMedia.getQuantity());
        spinner = new Spinner<Integer>(valueFactory);
        spinner.setOnMouseClicked( e -> {
            try {
                int numOfProd = this.spinner.getValue();
                int remainQuantity = cartMedia.getMedia().getQuantity();
                LOGGER.info("NumOfProd: " + numOfProd + " -- remainOfProd: " + remainQuantity);
                if (numOfProd > remainQuantity){
                    LOGGER.info("product " + cartMedia.getMedia().getTitle() + " only remains " + remainQuantity + " (required " + numOfProd + ")");
                    labelOutOfStock.setText("Sorry, Only " + remainQuantity + " remain in stock");
                    spinner.getValueFactory().setValue(remainQuantity);
                    numOfProd = remainQuantity;
                }

                // update quantity of mediaCart in useCart
                cartMedia.setQuantity(numOfProd);

                // update the total of mediaCart
                price.setText(Utils.getCurrencyFormat(numOfProd*cartMedia.getPrice()));

                // update subtotal and amount of Cart
                cartScreen.updateCartAmount();

            } catch (Exception e1) {
                e1.printStackTrace();
            }

        });
    }
}
