
// ContactServlet.java
package com.mibosante.controllers;

import com.mibosante.models.Contact;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactServlet", urlPatterns = {"/contact-servlet"})
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        String email = request.getParameter("email").trim();
        String subject = request.getParameter("subject").trim();
        String message = request.getParameter("message").trim();

        boolean insertResult = Contact.insertContact(name, email, subject, message);

        if (insertResult) {
<<<<<<< HEAD
            response.sendRedirect("contact.jsp"); // Redirect to success page if insertion is successful
=======
            response.sendRedirect("success.jsp"); // Redirect to success page if insertion is successful
>>>>>>> 17605b7b7f7b0d4861aafda6263e0793e15876d7
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page if insertion fails
        }
    }
}
