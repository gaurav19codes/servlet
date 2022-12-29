package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user1 = (String)request.getAttribute("user1");
		String p = (String)request.getAttribute("passw");
		String dobb = (String)request.getAttribute("dobb");

		String addre = (String)request.getAttribute("ad");
		
		out.print("<h1>Welcome "+user1+"! You are successfully logged In </h1> <br><br>");
		
		out.print("<h2>UserName :"+user1+"<br><br>");
		out.print("<h2>Password :"+p+"<br><br>");
		out.print("<h2>DateOfBirth :"+dobb+"<br><br>");
		out.print("<h2>Address :"+addre+"<br><br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

// Servlet Filter: Used to do pre-processing of post-processing of the response.

