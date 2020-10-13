<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome forloop</title>
</head>
<body>
<b>Using forloop in scriplet...</b>
<br>
<%
for (int i=0;i<5;i++)
{
	out.println("<B>Welcome to our site</B><br>");
}
%>
</body>
</html>