package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class resultController {

    @FXML
    public Label remark, marks, marktext, correcttext, wrongtext;
    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    @FXML
    private void initialize()
    {
        correcttext.setText("Corrected Answers : " + String.valueOf(quizController.correct));
        wrongtext.setText("Incorrect Answers : " + String.valueOf(quizController.wrong));

        marks.setText(quizController.correct + "/10");
        marktext.setText("You have scored "+quizController.correct + "/10");

        float correctf = (float) quizController.correct/10;
        correct_progress.setProgress(correctf);
        float wrongf = (float) quizController.wrong/10;
        wrong_progress.setProgress(wrongf);

        int correct = quizController.correct;
        if(correct<2)
        {
            remark.setText("Oh no..! You have failed the quiz. ti seems that you have to improve your GK!!");
        } else if(correct>=2 && correct<5)
        {
            remark.setText("Oops!! You have scored less marks. It seems that you need to improve your Gk!!");
        }
        else if(correct>=5 && correct<=7)
        {
            remark.setText("Good. A bit more improvement might help you to get better results. Practice is the key to success");
        }
        else if(correct==8 || correct==9){
            remark.setText("congratulations! Its your hardwork and determination which helped you to score good mark");
    }
        else if(correct==10)
        {
            remark.setText("Congratulations! You have passed this Quiz with full marks beavuse of your hardwork and determination");
        }
    }

}
