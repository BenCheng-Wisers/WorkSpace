package samples.attachments;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class WebServiceFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletRequest request=(HttpServletRequest)arg0;
		 String clientIP=request.getRemoteHost();
		 if(clientIP.equals("192.168.44.30")||clientIP.equals("127.0.0.1")){
			 System.out.println(clientIP);
			 arg2.doFilter(arg0,arg1);
		 }else{
			 System.out.println(clientIP);
		 }

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
