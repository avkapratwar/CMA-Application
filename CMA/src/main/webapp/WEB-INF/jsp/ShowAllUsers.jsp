<%@page import="java.util.List"%>
<%@page import="com.virtusa.cmadv.entity.Users"%>
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


	<center>


		<table class="table table-bordered table-hover">
			<tr class="info" border="3">

				<th>UserName</th>
				<th>Password</th>
				<th>Type</th>
				<th>Status</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${list}" var="temp">
				<tr>
					<td>${temp.userName}</td>
					<td>${temp.password}</td>
					<td>${temp.type}</td>
					<td>${temp.status}</td>
					<td><a href="updateUser?type=${temp.type}&userName=${temp.userName}">Update</a></td> 
			<td>
			<a href="DeleteUsersController?userName=${temp.userName}&userType=${temp.type}&userStatus=${temp.status}">Delete</a></td>
					
				</tr>
			</c:forEach>
	

			</tr>


		</table>
		<br /> <a href="Admin.html"><button>Return</button></a>
	</center>

</body>
</html>