package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		int n= Integer.parseInt(req.getParameter("username"));
		int p= Integer.parseInt(req.getParameter("password"));
		
		
	}
}
