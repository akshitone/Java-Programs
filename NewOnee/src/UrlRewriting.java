import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class urlrewriting
 */
@WebServlet("/urlrewriting")
public class UrlRewriting extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();

            String n=request.getParameter("uname");
            out.print("Welcome "+n);

            out.print("<a href='urlrewriting?uname="+n+" '> visit</a>");
            out.close();
        }catch(Exception e) { System.out.println(e);}
    }
}
