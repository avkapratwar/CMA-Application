<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Status</title>
</head>
<body>
Your Application Status is 
<%= request.getAttribute("status") %>
</body>
</html>