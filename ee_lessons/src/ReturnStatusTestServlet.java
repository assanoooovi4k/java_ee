import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/return")
public class ReturnStatusTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("/hello");
//        resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
//        resp.setHeader("Refresh", "1");
        resp.setHeader("Refresh", "5;URL = https://google.com");

        System.out.println(resp.containsHeader("Refresh"));
    }
}
