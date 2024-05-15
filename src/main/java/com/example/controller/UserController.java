package com.example.controller;

import com.example.Model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/*") // Make sure this mapping is correct
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo(); // This gets the part of the URL after '/user/'

        try {
            if ("/signup".equals(action)) {
                registerUser(request, response);
            } else if ("/login".equals(action)) {
                authenticateUser(request, response);
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


    private void registerUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        // Ensure these match the input names in your JSP form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(name, email, password);
        userDao.saveUser(user);
        response.sendRedirect("login.jsp"); // Redirect after successful registration
    }

    private void authenticateUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        // Ensure these match the input names in your JSP form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userDao.checkLogin(email, password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("userhome.jsp"); // Redirect to home page on successful login
        } else {
            response.sendRedirect("login.jsp?error=true"); // Redirect back to login on failure
        }
    }
}
