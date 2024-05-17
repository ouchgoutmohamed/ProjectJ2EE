
package com.mibosante.models;

import com.mibosante.database.DBConnection;

import java.sql.*;
import java.util.Base64;

public class UserDAO {
    // existing code...

    public static String getProfileImage(String email) {
        String result = null;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT profile_image FROM users WHERE email = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("profile_image");
                if (blob != null) {
                    byte[] bytes = blob.getBytes(1, (int) blob.length());
                    result = Base64.getEncoder().encodeToString(bytes);
                }
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}