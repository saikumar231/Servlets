<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="Codegnan IT Solutions" /></h1>
	<c:set var="sessionVariable" value="AAA" scope="session" />
	<c:set var="applicationvariable" value="BBB" scope="application" />
	session variable:
	<c:out value="${ sessionVariable}" />
	application variable:
	<c:out value="${applicationvariable }" />
	
	<c:remove var="sessionVariable" scope="session" />
	sesssion variable is removed
	<c:out value="${sessionVariable}" default="variable sessionVariable is removed" />
	
</body>
</html>