package com.mibosante.DAO;


import com.mibosante.database.DBConnection;
import java.sql.*;

public class LoginDAO {
    public static String currentUserName;
    public static String currentUserEmail;
    public static int currentUserId;
    public static boolean authenticate(String email, String password) {
        boolean result = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                result = true; // The user is successfully authenticated
                String userName = resultSet.getString("name"); // Store the user's name
                email = resultSet.getString("email"); // Store the user's email
                int userId = resultSet.getInt("id"); // Store the user's id
                currentUserName = userName; // Set the current user's name
                currentUserEmail = email; // Set the current user's email
                currentUserId = userId; // Set the current user's id
            }
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static Integer create(String email, String password ){
        String query1 = "INSERT INTO login(email, password) VALUES (?, ?);";
        String query2 = "SELECT MAX(login_id) FROM login;";
        Integer id = null;
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query2);
            if(resultSet.next()) {
                id = resultSet.getInt("MAX(login_id)");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static void delete(int id){
        String query = "DELETE FROM login WHERE login_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
