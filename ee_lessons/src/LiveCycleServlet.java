import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LiveCycle/")
public class LiveCycleServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DoGet Method");
        String s = "<html>" +
                "<head>" +
                "<title>Title</title>" +
                "</head>" +
                "<body>" +
                "Hello World" +
                "</body>" +
                "</html>";
        resp.getWriter().write(s);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Sevice");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
