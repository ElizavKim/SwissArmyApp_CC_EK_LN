package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import java.io.IOException;


public class Settings {
    @FXML
    private ToggleButton colorToggle;

    @FXML
    boolean redMode = false;

    @FXML
    public void changeColor(ActionEvent event) throws IOException {
        redMode = !redMode;
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (redMode) {
            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
        }
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }

//    @FXML
//    public void changeColor(ActionEvent event) throws IOException {
//        redMode = !redMode;
//        if (redMode) {
//            setRedMode();
//        } else {
//            setWhiteMode();
//        }
//    }
//
//    private void setRedMode(ActionEvent) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
//        EventObject event = null;
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene.getStylesheets().add(HelloApplication.class.getResource("/colorchange.css").toExternalForm());
//        stage.setTitle("Settings");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    private void setWhiteMode() throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene.getStylesheets().remove(HelloApplication.class.getResource("/colorchange.css").toExternalForm());
//        stage.setTitle("Settings");
//        stage.setScene(scene);
//        stage.show();
//    }



    @FXML
    public void backToActivities (ActionEvent event) throws IOException {
        redMode = !redMode;
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (redMode) {
            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
        }
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
        ActivityPage activityPage = fxmlLoader.getController();
        activityPage.onBack();
    }

}




