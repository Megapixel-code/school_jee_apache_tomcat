import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FormServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      response.setContentType("text/html");

      String login = request.getParameter("login");
      String password = request.getParameter("password");

      RequestDispatcher rd;
      if ((login != null) && (password != null)) {
         rd = request.getRequestDispatcher("/hello.html");
      } else {
         rd = request.getRequestDispatcher("/home.html");
      }
      rd.include(request, response);
   }
}
