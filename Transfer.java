package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Transfer extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
    	try
    	{
    		int amt=Integer.parseInt(request.getParameter("AMT"));
    		HttpSession session=request.getSession();
    		int accno=(int)session.getAttribute("an");
    		
    		DAOModel dao=new DAOModel();
    		dao.setAccno(accno);
    		boolean temp=dao.fundTransfer(amt);
    		
    		if(temp==true)
    		{
    			response.sendRedirect("successTransfer.jsp");
    		}
    		else
    		{
    			response.sendRedirect("failureTransfer.jsp");
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	
	
}
