<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style= "color:red" align="center">Welcome To First JSP Application</h1>
	<!-- Page Directives -->
	<h2>To Date:<%=new Date().toString() %>></h2>
	<%
	session.setAttribute("a", "aaa");
	session.setAttribute("b", "bbb");
	%>
	
	<h3>
	A--------<%= session.getAttribute("A") %><br>
	B--------<%= session.getAttribute("B") %><br>
	</h3>
	
</body>
</html>