<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="3">
		<tr>
			<th>applicationNumber</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Gender</th>
			<th>Fathername</th>
			<th>dateofbirth</th>
			<th>mobile</th>
			<th>X Percent</th>
			<th>Xii Percent</th>
			<th>UG Percent</th>
			<th>Email</th>
			<th>State</th>
			<th>Country</th>
			<th>status</th>
		</tr>
		<tr>
			<td>${applicants.applicationNumber}</td>
			<td>${applicants.firstName}</td>
			<td>${applicants.lastName}</td>
			<td>${applicants.gender}</td>
			<td>${applicants.fatherName}</td>
			<td>${applicants.dateOfBirth}</td>
			<td>${applicants.contactNumber}</td>
			<td>${applicants.xPercent}</td>
			<td>${applicants.xiiPercent}</td>
			<td>${applicants.ugPercent}</td>
			<td>${applicants.email}</td>
			<td>${applicants.state}</td>
			<td>${applicants.country}</td>
			<td>${applicants.status }</td>
		</tr>
	</table>
	<form action="update" method="get">
		<input type="radio" name="status" value="Accepted" checked="checked">Accept<br/>
		<input type="radio" name="status" value="Rejected">Reject<br/>
		<input type="hidden" name="appNo" value="${applicants.applicationNumber}">
		<input type="submit" value="submit">
	</form>
</body>
</html>