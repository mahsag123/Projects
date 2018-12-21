package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Balance extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{	
			HttpSession session=request.getSession();
			int an=(int)session.getAttribute("an");
			
			
			DAOModel dao=new DAOModel();
			dao.setAccno(an);
			
			boolean temp=dao.checkBalance();
			if(temp==true)
			{
				session.setAttribute("balance",dao.getBalance());
				response.sendRedirect("balanceSuccess.jsp");
			}
			else
			{
				response.sendRedirect("balanceFailure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
