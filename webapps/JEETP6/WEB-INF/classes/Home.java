import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Home extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws IOException, ServletException{
      response.setContentType("text/html");

      RequestDispatcher rd = request.getRequestDispatcher("/home.html");
      rd.include(request, response);
   }
}
