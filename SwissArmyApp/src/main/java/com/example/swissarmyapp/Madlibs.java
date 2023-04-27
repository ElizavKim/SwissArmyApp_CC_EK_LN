package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Madlibs {
    @FXML
    private TextField story1Noun;
    @FXML
    private TextField story1MU;
    @FXML
    private TextField story1Place;
    @FXML
    private TextField story1PTV;
    @FXML
    private TextField story1Adverb;
    @FXML
    private Label story1;

    @FXML
    private TextField story2Noun;
    @FXML
    private TextField story2Noun2;
    @FXML
    private TextField story2Number;
    @FXML
    private TextField story2Adjective;
    @FXML
    private TextField story2Noun3;
    @FXML
    private Label story2;

    @FXML
    protected void generateStory1() {
//        try {
//            Integer.parseInt(story1Noun.getText());
//        } catch (NumberFormatException e) {
//            story1.setText("Please enter applicable inputs.");
//
//        } finally {// story from stanza 4 of the poem "The Road Not Taken by Robert Frost

        story1.setText("I shall be telling this with a " + story1Noun.getText() +
                    "\nSomewhere " + story1MU.getText() + " and " + story1MU.getText() + " hence: \n" +
                    "Two roads diverged in a " + story1Place.getText() + ", and I - \n" +
                    "I took the one less " + story1PTV.getText() + " by,\n" +
                    "And that has made " + story1Adverb.getText() + " the difference.");
    }
    @FXML
    protected void generateStory2() {

        //story taken from https://www.phillymag.com/foobooz/2023/03/20/tony-burritos-foodery-roxborough/
        story2.setText("Tony's Burritos serves, as its name suggests, burritos - thick as your " + story2Noun.getText()
                + ", messy as \nheck, crisped in the oven to add some structure and filled with all the usual " +
                "suspects " + "- \nrice and beans, " + story2Noun2.getText() + " and sour cream, avocado for $" +
                story2Number.getText() + ". The pork al pastor gets a \nlittle lost in the noise of " +
                story2Adjective.getText() + " starches, but the " + story2Noun3.getText() + " version is solid if " +
                "you're \ncomfortable ordering a " + story2Noun3.getText() + " burrito from a beer store.");
    }

    @FXML
    protected void resetStory1() {
        story1.setText("");
        story1Noun.setText("");
        story1MU.setText("");
        story1Place.setText("");
        story1PTV.setText("");
        story1Adverb.setText("");
    }

    @FXML
    protected void resetStory2() {
        story2.setText("");
        story2Noun.setText("");
        story2Noun2.setText("");
        story2Number.setText("");
        story2Adjective.setText("");
        story2Noun3.setText("");
    }

    @FXML
    public void backToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
    }
}
