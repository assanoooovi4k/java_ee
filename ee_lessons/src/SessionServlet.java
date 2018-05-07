import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Enumeration<String > attributeNames = session.getAttributeNames();
        session.setAttribute("one" , "two");
        session.setAttribute("on312e" , "t32o");
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName + " = " + session.getAttribute(attributeName));
        }

        System.out.println(session.getMaxInactiveInterval());
        System.out.println(session.isNew());
        System.out.println(session.getId());

    }
}
