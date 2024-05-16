package com.mibosante.models;

import com.mibosante.database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Contact {

    // Method to insert a new contact into the database
    public static boolean insertContact(String name, String email, String subject, String message) {
        boolean result = false;
        try (Connection conn = DBConnection.getConnection()) {
            String query = "INSERT INTO contacts (name, email, subject, message) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, name);
                statement.setString(2, email);
                statement.setString(3, subject);
                statement.setString(4, message);
                int rowsInserted = statement.executeUpdate();
                result = (rowsInserted > 0); // If one or more rows were inserted, contact was successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}