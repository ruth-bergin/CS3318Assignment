package com.ucc.cs3318assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AssignmentController {

    @FXML
    public Label emailLabel;

    @FXML
    public TextField emailAddress;

    @FXML
    public Label submitText;

    @FXML
    public Label passwordLabel;

    @FXML
    public TextField password;

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
        if (AssignmentApplication.validateEmailAddress(emailAddress.getText())) {
            emailLabel.setText("Email address accepted!");
        } else {
            emailLabel.setText("Invalid format - email address rejected.");
        }
        if (AssignmentApplication.validatePassword(password.getText())) {
            password.setText("Password accepted!");
        } else {
            passwordLabel.setText("Invalid format - password rejected.");
        }
    }
}