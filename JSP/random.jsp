<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random</title>
</head>
<body>
<%if (Math.random()  > 0.5)
	{%>
		Have a <b>Good</b> day!!
	<%}
else{ %>
Have a <b>Nice</b> day!!
<%} %>
</body>
</html>