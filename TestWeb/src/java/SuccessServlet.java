import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SuccessServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter pw = res.getWriter();
        HttpSession ses = req.getSession();
        String name = (String) req.getAttribute("user");
        pw.println("From doGet" + name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter pw = res.getWriter();
        String name = (String) req.getAttribute("user");
        pw.println("From doPost" + name);
    }
}
