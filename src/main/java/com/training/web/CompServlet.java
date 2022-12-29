package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompServlet
 */
@WebServlet("/CompServlet1")
public class CompServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
    public CompServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		ServletConfig config=getServletConfig();
		ServletContext context=getServletConfig().getServletContext();
		String compN =context.getInitParameter("company");
		String usname = request.getParameter("usName");
		String psswd = request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String StorderPass=config.getInitParameter("password");
		if(psswd.equals(StorderPass)) {
			out.println("<h1>"+"Welcome to "+compN+"</h1>");
			out.println("<h2>"+"User Name: "+usname+"</h2>");
			
			
		}
		else {
			out.println("<h3>"+"Wrong Credentials "+"</h3>");
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
