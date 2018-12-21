package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewPassword extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			String npw=request.getParameter("CPW");
			String toEmail=request.getParameter("MAIL");
			
			DAOModel dao=new DAOModel();
			dao.setPassword(npw);
			dao.setEmail(toEmail);
			
			boolean temp=dao.forgotPassword();
			
			if(temp==true)
			{
				response.sendRedirect("newPasswordSuccess.jsp");
			}
			else
			{
				response.sendRedirect("newPasswordFailure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
}
