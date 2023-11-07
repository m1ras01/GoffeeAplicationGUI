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

public class ControllerAddSomeThing {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Nothing;

    @FXML
    private AnchorPane full;

    @FXML
    private Button milk;

    @FXML
    private Button sirup;

    @FXML
    private Button sugar;

    @FXML
    private AnchorPane up;

    @FXML
    void initialize() {
        sugar.setOnAction(event ->{
                    sugar.getScene().getWindow().hide();

                    FXMLLoader loader = new FXMLLoader();


                    loader.setLocation(getClass().getResource("sugar.fxml"));
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
