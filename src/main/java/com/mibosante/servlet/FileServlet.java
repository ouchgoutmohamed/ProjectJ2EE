package com.mibosante.servlets;

import com.mibosante.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;

@WebServlet("/getXMLContent")
public class FileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fileName = request.getParameter("fileName");

        response.setContentType("text/xml");
        PrintWriter out = response.getWriter();

        try {
            if ("User".equalsIgnoreCase(fileName)) {
                // Create a sample User object
                User user = new User();
                user.setName("Sample User");
                user.setEmail("user@example.com");
                user.setPassword("password");

                // Generate XML content for the User object
                String xmlContent = generateUserXML(user);
                out.write(xmlContent);
            } else {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.write("<error>Classe non trouvée</error>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            out.write("<error>Erreur lors de la génération du XML</error>");
        }
    }

    private String generateUserXML(User user) throws ParserConfigurationException, Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // Root element
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("User");
        doc.appendChild(rootElement);

        // Name element
        Element name = doc.createElement("Name");
        name.appendChild(doc.createTextNode(user.getName()));
        rootElement.appendChild(name);

        // Email element
        Element email = doc.createElement("Email");
        email.appendChild(doc.createTextNode(user.getEmail()));
        rootElement.appendChild(email);

        // Password element
        Element password = doc.createElement("Password");
        password.appendChild(doc.createTextNode(user.getPassword()));
        rootElement.appendChild(password);

        // Convert document to string
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new StringWriter());
        transformer.transform(source, result);

        return result.getWriter().toString();
    }
}
