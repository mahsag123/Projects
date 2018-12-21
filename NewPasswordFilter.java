package p1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


public class NewPasswordFilter implements Filter 
{

    
    public NewPasswordFilter()
    {
        
    }

	
	public void destroy()
	{
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String npw=request.getParameter("NPW");
		String cpw=request.getParameter("CPW");
		
		if(npw.equals(cpw)==true)
		{
		// pass the request along the filter chain
		chain.doFilter(request, response);
		}
		else
		{
			((HttpServletResponse)(response)).sendRedirect("errorNewPassword.jsp");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
