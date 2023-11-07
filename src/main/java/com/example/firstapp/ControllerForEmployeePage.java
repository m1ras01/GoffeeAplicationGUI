package com.example.firstapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerForEmployeePage {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button Exit;

        @FXML
        private Button back;

        @FXML
        private Button checkInventory;

        @FXML
        private AnchorPane full;

        @FXML
        private AnchorPane up;

        @FXML
        private Button updateInventory;

    @FXML
    void initialize() {
        back.setOnAction(event ->{
                    back.getScene().getWindow().hide();

                    FXMLLoader loader = new FXMLLoader();


                    loader.setLocation(getClass().getResource("login.fxml"));
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


        checkInventory.setOnAction(event ->{
                    checkInventory.getScene().getWindow().hide();

                    FXMLLoader loader = new FXMLLoader();


                    loader.setLocation(getClass().getResource("inventory.fxml"));
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
