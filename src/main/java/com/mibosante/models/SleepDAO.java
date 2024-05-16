package com.mibosante.models;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.mibosante.database.DBConnection;

public class SleepDAO {
    public static boolean insertSleep(Sleep sleep) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement st = con.prepareStatement("INSERT INTO sleep (date, bed_Time, wake_Time) VALUES (?, ?, ?)");

            st.setDate(1, java.sql.Date.valueOf(sleep.getDate()));
            st.setTime(2, java.sql.Time.valueOf(sleep.getBedTime()));
            st.setTime(3, java.sql.Time.valueOf(sleep.getWakeTime()));

            int result = st.executeUpdate();

            st.close();
            con.close();

            return result > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public List<Sleep> getAllSleep() {
        List<Sleep> sleepList = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM sleep")) {

            while (resultSet.next()) {
                LocalDate date = resultSet.getDate("date").toLocalDate();
                LocalTime bedTime = resultSet.getTime("bed_time").toLocalTime();
                LocalTime wakeTime = resultSet.getTime("wake_time").toLocalTime();
                Sleep sleep = new Sleep(date, bedTime, wakeTime);
                // ... set other fields if necessary
                sleepList.add(sleep);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sleepList;
    }


}