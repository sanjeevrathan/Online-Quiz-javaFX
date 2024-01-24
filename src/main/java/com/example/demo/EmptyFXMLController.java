package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Objects;

public class EmptyFXMLController {
    @FXML
    public Button loginButton;
    @FXML
    public Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Button button_sign_up;

    public void button_sign_upOnAction(ActionEvent e)
    {
        button_sign_up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try{
                    Stage thisstage = (Stage) ((Button)event.getSource()).getScene().getWindow();
                    thisstage.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
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
    public void loginButtonOnAction(ActionEvent e)
    {
        if(usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank() == false)
        {
            //loginMessageLabel.setText("you try to login...!");
            validateLogin();
        }
        else{
            loginMessageLabel.setText("please enter username and password");
        }
    }

    public void cancelButtonOnAction(ActionEvent e)
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM sanjeev.useraccounts WHERE Username = '" + usernameTextField.getText() + "' AND Password = '" + passwordPasswordField.getText() + "'";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next())
            {
                if(queryResult.getInt(1)==1)
                {
                    FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("login.fxml"));
                    Stage window = (Stage)  loginButton.getScene().getWindow();
                    try
                    {
                        window.setScene(new Scene(fxmlLoader.load()));
                    }
                    catch(IOException e)
                    {

                        throw new RuntimeException(e);
                    }
                    //loginMessageLabel.setText("welcome");
                } else {
                    loginMessageLabel.setText("Invalid login. please try again");
                }
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    }

