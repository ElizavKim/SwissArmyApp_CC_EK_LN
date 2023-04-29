package com.example.swissarmyapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LandingPage {
    @FXML
    private TextField nameInput;

    @FXML
    public static String userName;



    @FXML
    public void theNextButtonClick(ActionEvent event) throws IOException {
        ActivityPage.userName = nameInput.getText();
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        scene.getStylesheets().add("default.css");//CSS ADDED
        ActivityPage controller = fxmlLoader.getController();
        controller.setUserName(ActivityPage.userName);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Activities");
        stage.setScene(scene);
        stage.show();
    }











}
