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

@WebServlet("/ServletExportData")
public class ServletExportUsers extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/xml");
        response.setHeader("Content-Disposition", "attachment; filename=\"ExportUsers.xml");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id, nom, email, mot_de_passe FROM users");

            // Création du document XML
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            // Élément racine
            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);

            // Parcours du ResultSet et ajout des éléments XML
            while (rs.next()) {
                Element userElement = doc.createElement("user");

                Element id = doc.createElement("id");
                id.appendChild(doc.createTextNode(String.valueOf(rs.getInt("id"))));
                userElement.appendChild(id);

                Element nom = doc.createElement("nom");
                nom.appendChild(doc.createTextNode(rs.getString("nom")));
                userElement.appendChild(nom);

                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(rs.getString("email")));
                userElement.appendChild(email);

                Element motDePasse = doc.createElement("mot_de_passe");
                motDePasse.appendChild(doc.createTextNode(rs.getString("mot_de_passe")));
                userElement.appendChild(motDePasse);

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
