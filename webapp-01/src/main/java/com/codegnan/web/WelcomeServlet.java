package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet implements Servlet {

	public void init(ServletConfig config) throws ServletException {

	}

	public void service(ServletRequest resuest, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style = 'color:red' align='center'>");
		out.println("Welcome to first servlet program");
		out.println("</h1></body></html>");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return "";
	}

	public void destroy() {

	}
}
