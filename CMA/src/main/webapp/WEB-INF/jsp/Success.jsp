<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Success
<table>
<tr>
<th>Source</th>
<th>Destination</th>
<th>Noofseats</th>

</tr>
<tr>
<c:forEach items="${number1}" var="temp">
<tr>
<td>${temp.source}</td>
<td>${temp.destination}</td>
<td>${temp.noOfSeats}</td>
<td><a href="Book?poolid=${temp.poolId}&noseats=${noOfSeats}&src=${temp.source}&dest=${temp.destination}">Book</a>
</c:forEach>


</tr>



</table>
</body>
</html>