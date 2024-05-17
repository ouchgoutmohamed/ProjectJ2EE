package com.mibosante.models;


import com.mibosante.database.DBConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDAO {

    public static boolean signup(String name, String email, String password) {
        boolean result = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, password);

            int rowsInserted = statement.executeUpdate();
            result = (rowsInserted > 0); // If one or more rows were inserted, signup was successful
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static boolean updateUser(String name, String email, String password) {
        boolean isUpdated = false;
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE users SET name = ?, email = ?, password = ? WHERE name = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, password);
            statement.setString(4, name);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User's email and password were updated successfully!");
                JOptionPane.showMessageDialog(null, "User's email and password were updated successfully!", "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                isUpdated = true;
            }

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error while updating the user's email and password: " + ex.getMessage());
        }
        return isUpdated;
    }

}
