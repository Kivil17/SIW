package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		
		String n= req.getParameter("username");
		String p= req.getParameter("password");
		
			
			RequestDispatcher disp;
			disp= req.getRequestDispatcher("index.jsp");
			disp.forward(req,res);
		
	}
}
