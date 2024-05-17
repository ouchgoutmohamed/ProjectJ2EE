package com.mibosante.controllers;

import com.mibosante.DAO.ActivityDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;

import java.io.IOException;

@WebServlet(name = "DeleteActivityServlet", urlPatterns = {"/delete-activity"})

public class DeleteActivityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ActivityDAO.deleteActivity(id); // Assurez-vous que cette méthode existe dans ActivityDAO
        res.sendRedirect("Physical.jsp"); // Redirige vers la page JSP qui liste les activités
    }
}

