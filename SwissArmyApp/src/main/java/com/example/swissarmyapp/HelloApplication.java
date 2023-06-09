package com.example.swissarmyapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //launches app with default css, opens to Landing Page
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landingpage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        stage.setTitle("Swiss Army App");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}