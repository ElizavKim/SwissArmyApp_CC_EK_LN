package com.example.swissarmyapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Scanner;

public class LoveCalculator {
    @FXML
    private TextField nameInput;

    @FXML
    private TextField nameInput2;

    @FXML
    private Button pushButton;

    @FXML
    private Label resultLabel;

    @FXML
    public void initialize() {
        // Initialize event listener for the calculate button
        pushButton.setOnAction(event -> {
            String name1 = nameInput.getText();
            String name2 = nameInput2.getText();

            int loveScore = calculateLoveScore(name1, name2);

            String result = name1 + " and " + name2 + " are " + loveScore + "% compatible!";
            resultLabel.setText(result);
        });
    }

    private int calculateLoveScore(String name1, String name2) {
        // Convert the names to lowercase
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        // Count the number of common letters
        int commonLetters = 0;
        for (int i = 0; i < name1.length(); i++) {
            char c = name1.charAt(i);
            if (name2.indexOf(c) != -1) {
                commonLetters++;
            }
        }

        // Calculate the love score as a percentage
        int totalLetters = name1.length() + name2.length();
        int loveScore = (commonLetters * 100) / totalLetters;

        return loveScore;
    }

}
