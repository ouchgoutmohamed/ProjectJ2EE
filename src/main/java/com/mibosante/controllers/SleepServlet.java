package com.mibosante.controllers;

import com.mibosante.models.Sleep;
import com.mibosante.models.SleepDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(name = "SleepServlet", urlPatterns = "/sleep-servlet")
public class SleepServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalDate date = LocalDate.parse(request.getParameter("date").trim());
        LocalTime bedTime = LocalTime.parse(request.getParameter("bedTime").trim());
        LocalTime wakeTime = LocalTime.parse(request.getParameter("wakeTime").trim());

        Sleep sleep = new Sleep(date, bedTime, wakeTime);

        if (SleepDAO.insertSleep(sleep)) {
            response.sendRedirect("SleepPage.jsp"); // Redirect to success page if insertion is successful
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page if insertion fails
        }
    }
}