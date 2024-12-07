<%@ include file="logo.jsp"%>
<%@ include file="body.jsp"%>
<%@ include file="footer.jsp"%>



<%@page import="java.time.*"  %>
<%! 
LocalDateTime dateTime=null;
String dateAndTime="";
int day;
int month;
int year;
int hour;
int minute;
int second;
%>

<%
dateTime=LocalDateTime.now();
day=dateTime.getDayOfMonth();
month=dateTime.getMonthValue();
year=dateTime.getYear();
hour=dateTime.getHour();
minute=dateTime.getMinute();
second=dateTime.getSecond();

dateAndTime=day+"/ "+month+"/ "+year+" : "+hour+":"+minute+":"+second ;
%>

<html>
<body>
<h1 style="color:red" align="center">Date And Time: <%=dateAndTime %></h1>
</body>
