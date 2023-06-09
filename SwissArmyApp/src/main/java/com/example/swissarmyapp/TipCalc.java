package com.example.swissarmyapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
public class TipCalc {
    @FXML
    private TextField theInput;
   @FXML
   private Label theValue;

   @FXML
   private void calcTip() {
       double inputAmount = Double.parseDouble(theInput.getText());
       double totalAmount = inputAmount * 0.20;
       String twoDecimal = String.format("%.2f", totalAmount);
       theValue.setText(twoDecimal);
   }


    @FXML
    public void backToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ActivityPage");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        // tracks settings changes across scenes
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont(), SettingsSingleton.getButton(),SettingsSingleton.getWeight());

        stage.setScene(scene);
        stage.show();
        ActivityPage activityPage = fxmlLoader.getController();
        activityPage.onBack();//to make sure the changes stay when you go back
    }


   @FXML
    private void toReset(){
       theInput.clear();
       theValue.setText("0.00");
    }
}
