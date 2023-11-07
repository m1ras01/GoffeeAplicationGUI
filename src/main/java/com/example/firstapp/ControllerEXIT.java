package com.example.firstapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ControllerEXIT {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text buy;

    @FXML
    void initialize() {
        assert buy != null : "fx:id=\"buy\" was not injected: check your FXML file 'Exit.fxml'.";

    }
}
