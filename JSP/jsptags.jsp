<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A javaserver pages using jsp tags</title>
</head>
<body>
<h2>An example using different session objects</h2>
<ul>
<li><b>Expression</b><br>
Your Hostname is : <%=request.getRemoteHost() %>
<li><b>Scriplet-</b><br>
<%out.println("attached GET Data:" +request.getQueryString()); %>
<li><b>Declaration-</b><br>
<%!private int accessCount =0; %>
This page has been accessed<%= ++accessCount %>time(s) since the server was last restarted
<li><b>Directive -</b><br>
<%@ page import = "java.util.*" %>
Today's date is: <%= new Date() %>
</ul>
</body>
</html>