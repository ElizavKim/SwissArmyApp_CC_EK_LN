package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Settings {
    @FXML
    private ToggleButton colorToggle;
    @FXML
    private boolean redMode = true;
    @FXML
    private AnchorPane anchorPane;


    @FXML
    protected void changeAppColor() {
//        if (redMode) {
//            Parent root = null;
//            Scene scene = new Scene(root);
//            //Scene scene = new Scene(anchorPane,300, 250);
//            scene.getStylesheets().add(getClass().getResource("/colorchange.css").toExternalForm());
////            scene.getStylesheets().add(ActivityPage.class.getResource("/colorchange.css").toExternalForm());
////            scene.getStylesheets().add(Madlibs.class.getResource("/colorchange.css").toExternalForm());
////            scene.getStylesheets().add(HelloController.class.getResource("/colorchange.css").toExternalForm());
//
//        }
//        return false;

    }

    @FXML
    public void settingsToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ActivityPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
    }

}


