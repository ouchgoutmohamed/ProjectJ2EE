package com.mibosante.controllers;

import com.mibosante.DAO.ActivityDAO;
import com.mibosante.models.Activity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "EditActivityServlet", urlPatterns = {"/edit-activity"})
public class EditActivityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Activity activity = ActivityDAO.getActivityById(id); // Retrieve the activity by ID
        req.setAttribute("activity", activity); // Set the activity as a request attribute
        req.getRequestDispatcher("Physical.jsp").forward(req, res); // Forward to the JSP page for editing
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Retrieve updated activity data from the request
        int id = Integer.parseInt(req.getParameter("id"));
        String activityType = req.getParameter("activityType");
        Date date = Date.valueOf(req.getParameter("date")); // Ensure the date is in the correct format
        String description = req.getParameter("description");

        // Create an Activity object with the updated data
        Activity activity = new Activity(id, activityType, date, description);

        // Update the activity in the database
        boolean success = ActivityDAO.updateActivity(activity);

        if (success) {
            res.sendRedirect("Physical.jsp"); // Redirect to the activities list page if update is successful
        } else {
            // Handle the error scenario
        }
    }
}
