import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.mibosante.database.DBConnection;

@WebServlet("/FIleProfilServlet")
@MultipartConfig
public class FIleProfilServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
        String fileName = filePart.getSubmittedFileName();
        
        // Define the file path to save the uploaded file (use relative path in the context of the servlet)
        String filePath = getServletContext().getRealPath("/") + "uploads" + File.separator + fileName;
        
        // Create the directory if it doesn't exist
        File uploadDir = new File(getServletContext().getRealPath("/") + "uploads");
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        // Save the file to the server
        filePart.write(filePath);

        try {
            File xmlFile = new File(filePath);

            // Read the XML file
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            // Get data from the XML document
            NodeList entries = document.getElementsByTagName("User");

            // Connect to the database
            try (Connection con = DBConnection.getConnection()) {

                // Insert data into the database
                String insertSQL = "INSERT INTO personal_info (first_name, last_name, date_of_birth, gender, weight, size_in_cm,id,user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = con.prepareStatement(insertSQL)) {

                    // Process each entry in the XML file
                    for (int i = 0; i < entries.getLength(); i++) {
                        Element entry = (Element) entries.item(i);

                        // Extract values from child elements
                        String firstN = getElementText(entry, "first_name");
                        String LastN = getElementText(entry, "last_name");
                        String date = getElementText(entry, "date_of_birth");
                        String gender = getElementText(entry, "gender");
                        String weight = getElementText(entry, "weight");
                        String size = getElementText(entry, "size_in_cm");
                        String id = getElementText(entry, "id");
                        String user_id = getElementText(entry, "user_id");
                        

                        // Set values in the SQL query
                        preparedStatement.setString(1, firstN);
                        preparedStatement.setString(2, LastN);
                        preparedStatement.setString(3, date);
                        preparedStatement.setString(4, gender);
                        preparedStatement.setString(5, weight);
                        preparedStatement.setString(6, size);
                        preparedStatement.setString(7, id);
                         preparedStatement.setString(8, user_id);

                        // Execute the SQL insert query
                        preparedStatement.executeUpdate();
                    }

                    // Envoyer la réponse avec le script JavaScript pour afficher le popup
                    String script = "<script>";
                    script += "alert('Data imported from XML successfully!');";
                    script += "window.location.href='XmlConfig.jsp';"; // Rediriger vers une page spécifique après la fermeture du pop-up
                    script += "</script>";
                    response.setContentType("text/html");
                    response.getWriter().println(script);
                }
            }
        } catch (ParserConfigurationException | SAXException | SQLException ex) {
            ex.printStackTrace();
            response.getWriter().println("Error importing data from XML: " + ex.getMessage());
        }
    }

    private String getElementText(Element parentElement, String childTagName) {
        Node childNode = parentElement.getElementsByTagName(childTagName).item(0);
        if (childNode != null) {
            return childNode.getTextContent().trim(); // Return the content of the node if it exists
        }
        return ""; // Return an empty string if the node doesn't exist
    }
}
