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
		<th>Course Id</th>
		<th>Course Name</th>
		<th>Start Date</th>
		<th>End Date</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.courseId}</td>
			<td>${list.courseName}</td>
			<td>${list.startDate}</td>
			<td>${list.endDate}</td>
			<td><a href="<c:url value='/updateInfo/${list.courseId}' />">update</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>