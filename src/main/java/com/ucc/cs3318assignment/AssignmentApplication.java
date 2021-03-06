package com.ucc.cs3318assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AssignmentApplication extends Application {

    public static boolean validateEmailAddress(String emailAddress) {
        return emailAddress.matches("\\w[\\w[\\.]]*@[\\w[\\.]]*\\.[a-z]+") &&
                !emailAddress.matches(".*[\\.[@]][\\.[@]].*");
    }

    public static boolean validatePassword(String password) {
        return password.matches(
                "(?=.*[a-zA-Z]+)" +
                        "(?=.*\\d+)" +
                        "(?=.*[*^&@!]+)" +
                        ".{7,}?");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AssignmentApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}