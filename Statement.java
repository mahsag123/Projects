package p1;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Statement extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			HttpSession session=request.getSession();
			int an=(int) session.getAttribute("an");
			DAOModel dao=new DAOModel();
			dao.setAccno(an);
			
			ArrayList al=dao.getStatement();
			
			if(al==null)
			{
				response.sendRedirect("failureStatement.jsp");
			}
			else
			{
				session.setAttribute("al", al);
				response.sendRedirect("successStatement.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
