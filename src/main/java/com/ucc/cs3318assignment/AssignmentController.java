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
        emailLabel.setText(emailAddress.getText());
        passwordLabel.setText(password.getText());
    }
}