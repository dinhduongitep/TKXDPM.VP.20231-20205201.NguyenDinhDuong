package com.hust.itep.aims.view.shipping;


import com.hust.itep.aims.controller.PlaceOrderController;
import com.hust.itep.aims.entity.order.Order;
import com.hust.itep.aims.entity.shipping.DeliveryInfo;
import com.hust.itep.aims.utils.Configs;
import com.hust.itep.aims.utils.Utils;
import com.hust.itep.aims.view.BaseScreenHandler;
import com.hust.itep.aims.view.invoice.InvoiceHandler;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Logger;

public class ShippingScreenHandler extends BaseScreenHandler {
	private static final Logger LOGGER = Utils.getLogger(ShippingScreenHandler.class.getName());

	@FXML
	private HBox screenTitle;

	@FXML
	private TextField name;

	@FXML
	private TextField gmail;

	@FXML
	private TextField phone;

	@FXML
	private TextField address;

	@FXML
	private TextField instructions;

	@FXML
	private ChoiceBox<String> province;

	private Order order;

	public ShippingScreenHandler(Stage stage, String screenPath, Order order) throws IOException {
		super(stage, screenPath);
		try {
			setupData(order);
			setupFunctionality();
		} catch (Exception ex) {
			LOGGER.info(ex.getMessage());
		}
	}

	protected void setupData(Object dto) throws Exception {
		this.order = (Order) dto;
		this.province.getItems().addAll(Configs.PROVINCES);
	}

	protected void setupFunctionality() throws Exception {
		final BooleanProperty firstTime = new SimpleBooleanProperty(true); // Variable to store the focus on stage load
		name.focusedProperty().addListener((observable,  oldValue,  newValue) -> {
			if(newValue && firstTime.get()){
				content.requestFocus(); // Delegate the focus to container
				firstTime.setValue(false); // Variable value changed for future references
			}
		});

	}

	public void preprocessDeliveryInfo() throws IOException, InterruptedException {
		// add info to messages
		HashMap<String, String> messages = new HashMap<>();
		messages.put("name", name.getText());
		messages.put("phone", phone.getText());
		messages.put("gmail", gmail.getText());
		messages.put("address", address.getText());
		messages.put("instructions", instructions.getText());
		messages.put("province", province.getValue());
		DeliveryInfo deliveryInfo;
		try {
			// process and validate delivery info
			deliveryInfo = getBController().processDeliveryInfo(messages);
		} catch (Exception e) {
			throw new RuntimeException("Invalid address! Error!");
		}

		order.setDeliveryInfo(deliveryInfo);
	}

	public PlaceOrderController getBController(){
		return (PlaceOrderController) super.getBController();
	}


	@FXML
	void submitDeliveryInfo(MouseEvent event) throws IOException, InterruptedException, SQLException {
		// validate delivery info and prepare order info
		preprocessDeliveryInfo();
		// create invoice screen
		InvoiceHandler test = new InvoiceHandler();
		test.run();
	}
}
