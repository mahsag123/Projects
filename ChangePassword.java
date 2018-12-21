package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ChangePassword extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
    	try
    	{
    		String opw=request.getParameter("OPW");
        	String npw=request.getParameter("NPW");
        	
        	HttpSession session=request.getSession();
        	int accno=(int)session.getAttribute("an");
        	
        	DAOModel dao=new DAOModel();
        	dao.setAccno(accno);
        	dao.setPassword(opw);
        	boolean temp=dao.changePassword(npw);
        	
        	if(temp==true)
        	{
        		response.sendRedirect("successPassword.jsp");
        	}
        	else
        	{
        		response.sendRedirect("failurePassword.jsp");
        	}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
