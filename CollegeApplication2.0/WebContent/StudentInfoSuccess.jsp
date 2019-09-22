<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String msg = request.getParameter("msg");
		if (msg != null) {
			out.write("<h2>" + msg + "</h2>");
		}
		else{
			out.write("Error");
		}
	%>
</body>
</html>