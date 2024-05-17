package com.mibosante.controllers;

import com.mibosante.models.Activity;
import com.mibosante.models.ActivityDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "ActivityServlet", urlPatterns = "/activity-servlet")
public class ActivityServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try {
            String activityType = req.getParameter("activityType").trim();
            Date date = Date.valueOf(req.getParameter("date").trim());
            String description = req.getParameter("description").trim();

            Activity activity = new Activity(0, activityType, date, description); // id is auto-incremented by the database

            boolean insertResult = ActivityDAO.addActivity(activity);

            if (insertResult) {
                res.sendRedirect("Physical.jsp"); // Redirect to Physical.jsp if the insertion is successful
            } else {
                res.sendRedirect("Phhysical.jsp");             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            String action = req.getServletPath();

            if (action.equals("/delete-activity")) {
                int id = Integer.parseInt(req.getParameter("id"));
                ActivityDAO.deleteActivity(id); // Implement this method in ActivityDAO
                res.sendRedirect("activities.jsp"); // Redirect to the JSP page that lists activities
            }
        }
    }



