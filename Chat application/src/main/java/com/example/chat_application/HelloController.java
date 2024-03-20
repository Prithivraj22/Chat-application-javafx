package com.example.chat_application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;

public class HelloController {
    @FXML
    private Pane rootPane;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("button clicked");
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onRegisterClick(ActionEvent actionEvent) {
    }

//    public void initialize() {
//        // Load your image
//        Image backgroundImage = new Image("images/img.png");
//
//        // Set the background of the Pane
//        rootPane.setBackground(new Background(new BackgroundFill(new ImagePattern(backgroundImage), null, null)));
//    }

    public void signupclicked(ActionEvent actionEvent) {
    }

    public void loginclicked(ActionEvent actionEvent) {
    }

    public void onsignupclicked(ActionEvent actionEvent) {
    }
}
