import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Success extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws IOException, ServletException{
      response.setContentType("text/html");

      RequestDispatcher rd = request.getRequestDispatcher("/success.html");
      rd.include(request, response);
   }
}
