package com.mibosante.controllers;

import com.mibosante.models.*;
import com.mibosante.utils.Encryptor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login-servlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String email = req.getParameter("email").trim();
        String password = Encryptor.encryptPassword(req.getParameter("password").trim());

        if(Login.authenticate(email, password))
        {
            HttpSession session = req.getSession();
            session.setAttribute("email", email);
            res.sendRedirect("Home.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
