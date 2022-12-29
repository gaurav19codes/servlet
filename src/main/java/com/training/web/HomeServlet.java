package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String msg;
	
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	msg="Hello from servlet !!!!";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext context = getServletConfig().getServletContext();
		
		String value = context.getInitParameter("value1");
		
		String userName = request.getParameter("uname");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> "+msg+" "+value+ "</h1>");
		out.println("<h1> "+userName+" "+value+ "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post method is called");
		doGet(request, response);
	}

}

// Servlet Config: Initial parameters can be configured using ServletConfig
// Each servlet will have their own servlet config


