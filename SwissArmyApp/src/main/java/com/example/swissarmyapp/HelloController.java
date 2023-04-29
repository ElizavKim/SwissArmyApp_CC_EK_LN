package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }



//    @FXML
//    protected void onHelloButtonClick(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("activitypage.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
//        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        stage.setTitle("Activities");
//        stage.setScene(scene);
//        stage.show();
//    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("madlibs.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        scene.getStylesheets().add("default.css");//added

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Swiss Army App");
        stage.setScene(scene);
        stage.show();
    }

}