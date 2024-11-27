package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sname = request.getParameter("sname");

		String[] qual = request.getParameterValues("squal");
		List<String> squal = Stream.of(qual).collect(Collectors.toList());

		String sgender = request.getParameter("sgender");

		List<String> scourses = Stream.of(request.getParameterValues("scourses")).collect(Collectors.toList());

		String branchLocation = request.getParameter("branchLocation");

		String saddr = request.getParameter("saddr");

		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color: red;' align='center'>");
		out.println("codegnan it solutions");
		out.println("</h2>");
		out.println("<h3 style='color: blue;' align='center'>");
		out.println("Course Registration Details");
		out.println("</h3>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>Student Name</th><td>" + sname + "</td></tr>");
		out.println("<tr><th>Student Qualification</th><td>" + squal + "</td></tr>");
		out.println("<tr><th>Student Gender</th><td>" + sgender + "</td></tr>");
		out.println("<tr><th>Student Courses</th><td>" + scourses + "</td></tr>");
		out.println("<tr><th>Branch Location</th><td>" + branchLocation + "</td></tr>");
		out.println("<tr><th>Student Address</th><td>" + saddr + "</td></tr>");
		out.println("</table>");
		out.println("<h3 align='center'><a href='./registrationform.html'>|Registartion form|</a>");
		out.println("</body></html>");

	}

}
