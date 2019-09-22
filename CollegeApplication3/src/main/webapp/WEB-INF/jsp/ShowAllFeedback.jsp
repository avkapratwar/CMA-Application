<%@page import="com.virtusa.cma.entity.*"%>
<%@page import="com.virtusa.cma.service.*" %>
<%@page import="com.virtusa.cma.dao.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<center>
<table border="3">
	<tr>
		<th>username</th>
		<th>usertype</th>
		<th>rating</th>
		<th>comments</th>
	</tr>
		
	<c:forEach items="${list}" var="temp">
	<tr>
                        <td>${temp.userName}</td>
                        <td>${temp.userType}</td>
                        <td>${temp.rating}</td>
                        <td>${temp.comments}</td>
		
	</tr>
	
                </c:forEach>
</table>
<br/><br/>
	
</center>	
</body>
</html>