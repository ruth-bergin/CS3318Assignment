package com.ucc.cs3318assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AssignmentController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}