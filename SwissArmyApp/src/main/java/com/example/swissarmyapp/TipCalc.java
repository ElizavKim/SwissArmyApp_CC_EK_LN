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
   // String formattedAmount = String.format("%.2f", totalAmount);


    @FXML
   private void calcResult(){

   }

   @FXML
    private void toReset(){
       theInput.clear();
       theValue.setText("0.00");
    }




}
