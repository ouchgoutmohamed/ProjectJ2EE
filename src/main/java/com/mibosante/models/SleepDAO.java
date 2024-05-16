package com.mibosante.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}