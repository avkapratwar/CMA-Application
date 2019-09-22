<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
		<table class="table table-bordered table-hover" border="3">
			<tr class="info">



				<th>Alumni Id</th>
				<th>First Name</th>
				<th>Gender</th>
				<th>Contact No</th>
				<th>Email Id</th>

			</tr>
			
			<c:forEach items="${list}" var="temp">
				<tr>
					<td>${temp.studentId}</td>
					<td>${temp.firstName}</td>
					<td>${temp.gender}</td>
					<td>${temp.mobileNo}</td>
					<td>${temp.email}</td>

			</c:forEach>
		</table>
		<center><h1>${msg}</h1></center>
</body>
</html>