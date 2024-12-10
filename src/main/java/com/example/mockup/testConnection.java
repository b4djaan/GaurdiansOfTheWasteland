package com.example.mockup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class testConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/challenge";
        String user = "root";
        String password = "";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // If the connection is successful, print a message
            if (connection != null) {
                System.out.println("Connection established!");
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
