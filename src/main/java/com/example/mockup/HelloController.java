package com.example.mockup;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView imageview;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField passwordField;

    @FXML
    private void onOkButtonClick() {
        String name = nameField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();
        String password = passwordField.getText();

        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(password);

        welcomeText.setText("Uw gegevens zijn bijgewerkt.");
        System.out.println("Uw gegevens zijn bijgewerkt.");
    }
    @FXML
    private void onReturnButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 600);

        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        System.out.println("onReturnButtonClick() called");
    }

    }









