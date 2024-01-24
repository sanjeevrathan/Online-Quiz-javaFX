package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class loginController {
    @FXML
    private Button playquiz;

    @FXML
    private void initialize()
    {
        playquiz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try{
                    Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                    thisstage.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    stage.show();
                } catch(Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}
