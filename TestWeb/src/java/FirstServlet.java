import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        String user = req.getParameter("user");    //get value of use and store in user object
        PrintWriter pw = res.getWriter();
        
        //if(user.equal("Lynan"))
        if(user.equalsIgnoreCase("Lynan"))   //.equalIgnoreCase() to ignore whether it is small or big letter
        {
            pw.println("Welcome : " + user);
        }
        else
        {
            pw.println("Wrong input doGet");
        }
        
        //Not using .equalsIgnoreCase()
//        if(user.contains("L") || user.contains("l"))
//        {
//            pw.println("Welcome : " + user);
//        }
//        else
//        {
//            pw.println("Wrong input doGet");
//        }

        //Each letter
//        for(int i=0; i<user.length(); i++)
//        {
//            if(user.charAt(i) == 'L')
//            {
//                pw.println("Username has L" + user);
//            }
//            else
//            {
//                pw.println("Username doesn't have L");
//            }
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        String name = req.getParameter("user");
        PrintWriter out = res.getWriter();
        
        if(name.equals("Lynana"))
        {
            out.println("Welcome : " + name);
        }
        else
        {
            out.println("Worng input doPost");
        }
    }
}
