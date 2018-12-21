package p1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Home extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			int cid=Integer.parseInt(request.getParameter("CID"));
			String pw=request.getParameter("PW");
			
			DAOModel dao=new DAOModel();
			dao.setCid(cid);
			dao.setPassword(pw);
			
			boolean temp=dao.login();
			
			if(temp==true)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("an",dao.getAccno());
				session.setAttribute("name", dao.getCname());
				response.sendRedirect("proceed.jsp");
			}
			else
			{
				response.sendRedirect("invalid.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
