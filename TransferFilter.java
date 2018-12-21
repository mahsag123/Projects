package p1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


public class TransferFilter implements Filter 
{

    
    public TransferFilter()
    {
        
    }

	
	public void destroy() 
	{
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		int amt=Integer.parseInt(request.getParameter("AMT"));
		
		if(amt<=0)
		{
			((HttpServletResponse)(response)).sendRedirect("errorTransfer.jsp");
		}
		else
		{
			chain.doFilter(request, response);
		}		
	}

	
	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}
}
