import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one = req.getParameter("one");
        one = one == null ? "" : one.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
//        String two = req.getParameter("two");
        System.out.println(one);
        resp.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                "<form action = 'temp' method = 'post'>" +
                "<textarea name = 'one'></textarea>" +
//                "<input type='text' name = 'two'/>" +
                "<input type='submit' name = 'submit'/>" +
                "</form>" +
                "</body>" +
                "</html>");
//        String one = req.getParameter("one");
//        System.out.println(one);
//        String two = req.getParameter("two");
//        System.out.println(two);
//        String[] m = req.getParameterValues("one");
//        for (String s :
//                m) {
//            System.out.println(s);
//
//        }
//        Enumeration<String> paramNames = req.getParameterNames();
////        while(paramNames.hasMoreElements()) {
////            String elementName = paramNames.nextElement();
////            System.out.println(elementName + " = " + req.getParameter(elementName));
////        }
////        Map<String, String[]> parametrMap = req.getParameterMap();
////        System.out.println(parametrMap);
//        System.out.println(req.getRequestURL());
//        System.out.println(req.getRequestURI());
//        System.out.println(req.getServletPath());
//        System.out.println(req.getRemoteHost());
//        System.out.println(req.getLocalPort());
//        System.out.println(req.getQueryString());
    }
}
