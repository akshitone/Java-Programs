<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pages accessed count</title>
</head>
<body>
<%! int count=0;%>
<% count = count +1;%>
<B>This page has been accessed <%=count%> time(s). </B>
</body>
</html>