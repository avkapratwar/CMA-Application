<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<th>detailed info</th>
	</tr>
	<c:forEach var="applicant" items="${list}">
		<tr>
			<td>${applicant.applicationNumber}</td>
			<td>${applicant.firstName}</td>
			<td>${applicant.lastName}</td>
			<td>${applicant.gender}</td>
			<td>${applicant.fatherName}</td>
			<td>${applicant.dateOfBirth}</td>
			<td>${applicant.contactNumber}</td>
			<td><a href="<c:url value='/showdetailed/${applicant.applicationNumber}' />">show Detailed Info</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>