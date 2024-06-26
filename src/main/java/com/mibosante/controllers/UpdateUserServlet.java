package com.mibosante.controllers;

import com.mibosante.DAO.SignUpDAO;
import com.mibosante.utils.Encryptor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name = "UpdateUserServlet", urlPatterns = "/update-user-servlet")
public class UpdateUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // 1. Check for Null Values:
        if (name == null || name.isEmpty() ||
                email == null || email.isEmpty() ||
                password == null || password.isEmpty()) {
            res.sendRedirect("erreurNULLparmetrs.jsp");
            return; // Stop processing the request if parameters are missing
        }


        name = name.trim(); // Safe to trim now
        email = email.trim();
        password = password.trim();

         password = Encryptor.encryptPassword(req.getParameter("password").trim()); // Example using BCrypt library

        boolean updateResult = SignUpDAO.updateUser(name, email, password);

        if (updateResult) {
            res.sendRedirect("profile.jsp");
        } else {
            // Handle update failure (e.g., display error message on the same page)
            res.sendRedirect("profile.jsp");
        }
    }

}
