package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		String dateofBirth = request.getParameter("dob");

		String address = request.getParameter("addr");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(userName.equals("") || password.equals("") || dateofBirth.equals("") || address.equals("")) {
			out.print("<h2>** All Fields Are Required **</h2> <br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
	}
		
		else if(userName.length()<6 || password.length()<8) {
			out.print("<h2>** Name should be min 6 length and password min 8 length required **</h2> <br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
		
		else {
			out.print("<h2>** Successfull Registered **</h2> ");
			
			request.setAttribute("user1", userName);
			request.setAttribute("passw", password);
			request.setAttribute("dobb", dateofBirth);
			request.setAttribute("ad", address);
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
