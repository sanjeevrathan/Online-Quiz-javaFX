package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
public class SignupController {

    @FXML
    private Button Signbutton;
    @FXML
    private Button signbutton;
    @FXML
    private TextField firstnamelabel;
    @FXML
    private TextField lastnamelabel;
    @FXML
    private TextField usernamelabel;
    @FXML
    private TextField passwordlabel;
    @FXML
    private Label labell;
    Connection con;
    PreparedStatement pst;

    public void SignbuttonOnAction(ActionEvent event) {
        try {
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmptyFXML.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signbuttonOnAction(ActionEvent event) {
        String Firstname = firstnamelabel.getText();
        String Lastname = lastnamelabel.getText();
        String Username = usernamelabel.getText();
        String Password = passwordlabel.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sanjeev","root","Sanjeev@123");

            pst = con.prepareStatement("insert into sanjeev.useraccounts(Firstname,Lastname,Username,Password)values(?,?,?,?)");
            pst.setString(1, Firstname);
            pst.setString(2,Lastname);
            pst.setString(3,Username);
            pst.setString(4,Password);
            int status=pst.executeUpdate();

            if (status==1){
                System.out.println("record added");
                firstnamelabel.setText("");
                lastnamelabel.setText("");
                usernamelabel.setText("");
                passwordlabel.setText("");
                firstnamelabel.requestFocus();
                labell.setText("Added Succesfully");
            }else {
                System.out.println("record failed");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}