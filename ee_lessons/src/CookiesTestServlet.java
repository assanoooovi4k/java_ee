import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;


@WebServlet("/cookies")
public class CookiesTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }

        Cookie cookiee = new Cookie("test", "123");
        cookiee.setMaxAge(5);// время жизни, при -1 бесконечность
        cookiee.setComment("comment");
        cookiee.setPath("localhost:8080/cookies");// куки отображаются только для этого пути
        cookiee.setSecure(true);//видны только если по https соединению
        resp.addCookie(cookiee);

    }
}