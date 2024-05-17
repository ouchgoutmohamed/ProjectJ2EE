package com.mibosante.models;

import com.mibosante.database.DBConnection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDAO {

    public static boolean signup(String name, String email, String password, InputStream profileImage) {
        boolean result = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO users (name, email, password, profile_image) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, password);
            if (profileImage != null) {
                statement.setBlob(4, profileImage);
            } else {
                statement.setNull(4, java.sql.Types.BLOB);
            }

            int rowsInserted = statement.executeUpdate();
            result = (rowsInserted > 0); // If one or more rows were inserted, signup was successful
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // existing code...

    public static boolean updateUserProfile(String name, String email, String password, InputStream profileImage) {
        boolean result = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "UPDATE users SET name = ?, email = ?, password = ?, profile_image = ? WHERE email = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, password);
            if (profileImage != null) {
                statement.setBlob(4, profileImage);
            } else {
                // If no image is provided, keep the existing one
                statement.setNull(4, java.sql.Types.BLOB);
            }
            statement.setString(5, email);

            int rowsUpdated = statement.executeUpdate();
            result = (rowsUpdated > 0); // If one or more rows were updated, the update was successful
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}