package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class quizController {
    @FXML
    public Label question;
    @FXML
    public Button opt1, opt2, opt3, opt4;
    int counter = 0;
    static int correct =0;
    static int wrong =0;

    @FXML
    private void initialize()
    {
        loadQuestions();

    }

    private void loadQuestions() {
        if(counter==0)
        {
            question.setText("1. How many consonants are there in the English Alphabets?");
            opt1.setText("19");
            opt2.setText("20");
            opt3.setText("21");
            opt4.setText("22");

        }
        else if(counter==1)
        {
            question.setText("2. Who invented light bulb?");
            opt1.setText("Thomas Alva Edison");
            opt2.setText("Alexander Fleming");
            opt3.setText("Sanjeev Rathan");
            opt4.setText("Charles Baggage");

        }
        else if(counter==2)
        {
            question.setText("3. In Solar System, farthest planet from the sun is");
            opt1.setText("Jupiter");
            opt2.setText("Saturn");
            opt3.setText("Uranus");
            opt4.setText("Neptune");

        }
        else if(counter==3)
        {
            question.setText("4. Largest moon in the solar system is?");
            opt1.setText("Titan");
            opt2.setText("Ganymede");
            opt3.setText("Moon");
            opt4.setText("Europa");

        }
        else if(counter==4)
        {
            question.setText("5. which of these are not the property of a metal");
            opt1.setText("Good conductor");
            opt2.setText("Malleable");
            opt3.setText("Non ductile");
            opt4.setText("sonourous");

        }
        else if(counter==5)
        {
            question.setText("6. Who discovered pasteurisation?");
            opt1.setText("Simon Pasteur");
            opt2.setText("Alexander Fleming");
            opt3.setText("Sanjeev Rathan");
            opt4.setText("Louis Pasteur");

        }
        else if(counter==6)
        {
            question.setText("7. Hydrochloric acid (HCL) is produced by -?");
            opt1.setText("Small intestine");
            opt2.setText("Liver");
            opt3.setText("Oesophagus");
            opt4.setText("Stomach");

        }
        else if(counter==7)
        {
            question.setText("8. the fastest animal in the world is -?");
            opt1.setText("Lion");
            opt2.setText("Black buck");
            opt3.setText("Sanjeev Rathan");
            opt4.setText("Quarter horse");

        }
        else if(counter==8)
        {
            question.setText("9. World environment day is on?");
            opt1.setText("5th june");
            opt2.setText("5th july");
            opt3.setText("15th june");
            opt4.setText("25th june");

        }
        else if(counter==9)
        {
            question.setText("10. complementary colour of red is ");
            opt1.setText("Blue");
            opt2.setText("Green");
            opt3.setText("Yellow");
            opt4.setText("Pink");

        }

    }

    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString()))
        {
            correct = correct+1;
        } else{
            wrong = wrong + 1;
        }

        if(counter == 9) {
            try{
                Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            counter++;
            loadQuestions();
        }
    }

    boolean checkAnswer(String answer) {

        if(counter == 0){
            if(answer.equals("21")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 1){
            if(answer.equals("Thomas Alva Edison")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 2){
            if(answer.equals("Neptune")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 3){
            if(answer.equals("Ganymede")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 4){
            if(answer.equals("Non ductile")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 5){
            if(answer.equals("Louis Pasteur")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 6){
            if(answer.equals("Stomach")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 7){
            if(answer.equals("Sanjeev Rathan")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 8){
            if(answer.equals("5th june")){
                return true;
            } else{
                return false;
            }
        }
        if(counter == 9){
            if(answer.equals("Green")){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString()))
        {
            correct = correct+1;
        } else{
            wrong = wrong + 1;
        }

        if(counter == 9) {
            try{
                Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            counter++;
            loadQuestions();
        }
    }
    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString()))
        {
            correct = correct+1;
        } else{
            wrong = wrong + 1;
        }

        if(counter == 9) {
            try{
                Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            counter++;
            loadQuestions();
        }
    }
    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString()))
        {
            correct = correct+1;
        } else{
            wrong = wrong + 1;
        }

        if(counter == 9) {
            try{
                Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            counter++;
            loadQuestions();
        }
    }
}
