package com.example.midterm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.IOException;

public class HelloApplication extends Application {


    private TextField customerIdField;
    private TextField lastnameField;
    private TextField firstnameField;
    private TextField addressField;
    private TextField cityField;
    private TextField stateField;
    private TextField zipcodeField;

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        customerIdField = new TextField();
        lastnameField = new TextField();
        firstnameField = new TextField();
        addressField = new TextField();
        cityField = new TextField();
        stateField = new TextField();
        zipcodeField = new TextField();

        grid.add(new Label("Customer ID:"), 0, 0);
        grid.add(customerIdField, 1, 0);
        grid.add(new Label("Last Name:"), 0, 1);
        grid.add(lastnameField, 1, 1);
        grid.add(new Label("First Name:"), 0, 2);
        grid.add(firstnameField, 1, 2);
        grid.add(new Label("Address:"), 0, 3);
        grid.add(addressField, 1, 3);
        grid.add(new Label("City:"), 0, 4);
        grid.add(cityField, 1, 4);
        grid.add(new Label("State:"), 0, 5);
        grid.add(stateField, 1, 5);
        grid.add(new Label("Zipcode:"), 0, 6);
        grid.add(zipcodeField, 1, 6);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> insertData());
        grid.add(submitButton, 1, 7);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Customer Data Entry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void insertData() {
        System.out.println("Insert Data method called");

        String customerId = customerIdField.getText();
        String lastname = lastnameField.getText();
        String firstname = firstnameField.getText();
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String zipcode = zipcodeField.getText();

        String url = "jdbc:sqlite:Customers.db";

        String sql = "INSERT INTO CustomerTable (CustomerID, Lastname, Firstname, Address, City, State, Zipcode) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, customerId);
            pstmt.setString(2, lastname);
            pstmt.setString(3, firstname);
            pstmt.setString(4, address);
            pstmt.setString(5, city);
            pstmt.setString(6, state);
            pstmt.setString(7, zipcode);
            pstmt.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Data transferred successfully!");
            alert.showAndWait();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
