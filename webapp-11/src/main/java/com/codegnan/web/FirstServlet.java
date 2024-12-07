package com.codegnan.web;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String uage = request.getParameter("uage");
		HttpSession hs = request.getSession();
		hs.setAttribute("uname", uname);
		hs.setAttribute("uage", uage);
		RequestDispatcher rd = request.getRequestDispatcher("form2.html");
		rd.forward(request, response);
	}
}
