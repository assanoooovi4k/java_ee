import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/header/")
public class HeaderTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            System.out.println(s + " = " + req.getHeader(s));
        }
        System.out.println(req.getAuthType());
        System.out.println(req.getCookies());
        System.out.println(req.getMethod());
        System.out.println(req.getRequestURI());
        System.out.println(req.getProtocol());

        resp.setHeader("Content-length", "100");
        System.out.println(req.getHeader("Content-length"));
    }
}
