package com.mibosante.controllers;

import com.mibosante.models.SignUp;
import com.mibosante.utils.Encryptor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SignUpServlet", urlPatterns = "/signup-servlet")
public class SignUpServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String name = req.getParameter("name").trim();
        String email = req.getParameter("email").trim();
        String password = Encryptor.encryptPassword(req.getParameter("password").trim());

        if(SignUp.signup(name, email, password))
        {
            HttpSession session = req.getSession();
            session.setAttribute("email", email);
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
