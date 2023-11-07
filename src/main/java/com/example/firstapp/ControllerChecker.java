package com.example.firstapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerChecker {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login;

    @FXML
    private Button loginButton;

    @FXML
    private TextField password;

    @FXML
    void initialize() {
        loginButton.setOnAction(event ->{
                    loginButton.getScene().getWindow().hide();

                    FXMLLoader loader = new FXMLLoader();


                    loader.setLocation(getClass().getResource("ForEmployee.fxml"));
                    try {
                        loader.load();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.showAndWait();
                }
        );
    }

}
