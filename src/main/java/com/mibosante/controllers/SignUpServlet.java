package com.mibosante.controllers;

import com.mibosante.models.SignUpDAO;
import com.mibosante.utils.Encryptor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "SignUpServlet", urlPatterns = "/signup-servlet")
public class SignUpServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        Part filePart = req.getPart("profileImage");
        InputStream profileImage = null;
        if (filePart != null) {
            profileImage = filePart.getInputStream();
        }
        String name = req.getParameter("name").trim();
        String email = req.getParameter("email").trim();
        String password = Encryptor.encryptPassword(req.getParameter("password").trim());

        if(SignUpDAO.signup(name, email, password))
        {
            HttpSession session = req.getSession();
            session.setAttribute("email", email);
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
