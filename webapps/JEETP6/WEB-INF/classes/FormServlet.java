import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FormServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      response.setContentType("text/html");

      String login = request.getParameter("login");
      String password = request.getParameter("password");


      if (((login != null) && (password != null)) && ((login != "") && (password != ""))) {
         response.sendRedirect("/JEE/success");
      }  else {
         response.sendRedirect("/JEE");
      }
   }
}
