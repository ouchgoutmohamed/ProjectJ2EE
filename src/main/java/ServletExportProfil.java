import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import com.mibosante.database.DBConnection;

@WebServlet("/ServletExportProfil")
public class ServletExportProfil extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/xml");
        response.setHeader("Content-Disposition", "attachment; filename=\"Export_Profil.xml\"");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT first_name, last_name, date_of_birth, gender, weight, size_in_cm FROM personal_info");

            // Création du document XML
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            // Élément racine
            Element rootElement = doc.createElement("Profils");
            doc.appendChild(rootElement);

            // Parcours du ResultSet et ajout des éléments XML
            while (rs.next()) {
                Element userElement = doc.createElement("Profil");

                Element firstName = doc.createElement("first_name");
                firstName.appendChild(doc.createTextNode(rs.getString("first_name")));
                userElement.appendChild(firstName);

                Element lastName = doc.createElement("last_name");
                lastName.appendChild(doc.createTextNode(rs.getString("last_name")));
                userElement.appendChild(lastName);

                Element dateOfBirth = doc.createElement("date_of_birth");
                dateOfBirth.appendChild(doc.createTextNode(rs.getString("date_of_birth")));
                userElement.appendChild(dateOfBirth);

                Element gender = doc.createElement("gender");
                gender.appendChild(doc.createTextNode(rs.getString("gender")));
                userElement.appendChild(gender);

                Element weight = doc.createElement("weight");
                weight.appendChild(doc.createTextNode(rs.getString("weight")));
                userElement.appendChild(weight);

                Element size = doc.createElement("size_in_cm");
                size.appendChild(doc.createTextNode(rs.getString("size_in_cm")));
                userElement.appendChild(size);

                rootElement.appendChild(userElement);
            }

            // Transformer le document en une chaîne XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            transformer.transform(source, result);

            // Écrire le XML dans la réponse
            response.getWriter().write(writer.toString());

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("SQL Error exporting data to XML: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            response.getWriter().println("Parser Configuration Error exporting data to XML: " + e.getMessage());
        } catch (TransformerException e) {
            e.printStackTrace();
            response.getWriter().println("Transformer Error exporting data to XML: " + e.getMessage());
        } finally {
            // Fermeture des ressources
            if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException ignore) {}
            if (con != null) try { con.close(); } catch (SQLException ignore) {}
        }
    }
}
