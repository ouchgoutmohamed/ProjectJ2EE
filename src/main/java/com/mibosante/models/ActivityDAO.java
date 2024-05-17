package com.mibosante.models;

import com.mibosante.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActivityDAO {

    public static boolean addActivity(Activity activity) {
        boolean result = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO activities (activity_type, date, description) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, activity.getActivityType());
            statement.setDate(2, activity.getDate());
            statement.setString(3, activity.getDescription());

            int rowsInserted = statement.executeUpdate();
            result = (rowsInserted > 0); // If one or more rows were inserted, the operation was successful
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

        public static List<Activity> getAllActivities() {
            List<Activity> activities = new ArrayList<>();
            try {
                Connection conn = DBConnection.getConnection();
                String query = "SELECT * FROM activities";
                PreparedStatement statement = conn.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Activity activity = new Activity(
                            resultSet.getInt("id"),
                            resultSet.getString("activity_type"),
                            resultSet.getDate("date"),
                            resultSet.getString("description")
                    );
                    activities.add(activity);
                }
                resultSet.close();
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return activities;
        }

        public static boolean deleteActivity(int id) {
            boolean result = false;
            try {
                Connection conn = DBConnection.getConnection();
                String query = "DELETE FROM activities WHERE id = ?";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setInt(1, id);

                int rowsDeleted = statement.executeUpdate();
                result = (rowsDeleted > 0);
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return result;
        }
    }


