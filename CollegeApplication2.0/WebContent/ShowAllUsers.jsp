
<%@page import="java.util.List"%>
<%@page import="com.virtusa.cma.entity.Users"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<%
				List<Users> usrs = (List) request.getAttribute("users");

				for (Users u : usrs) {
			%>
			<tr>
				<td><%=u.getUserName()%></td>
				<td><%=u.getPassword()%></td>
				<td><%=u.getType()%></td>
				<td><%=u.getStatus()%></td>
				<td><a
					href="UpdateUsers.jsp?userName=<%=u.getUserName()%>&userType=<%=u.getType()%>&userStatus=<%=u.getStatus()%>">Update</td>
				<td><a
					href="DeleteUsersController?userName=<%=u.getUserName()%>&userType=<%=u.getType()%>&userStatus=<%=u.getStatus()%>">Delete</td>


			</tr>
			<%
				}
			%>

		</table>
		<br /> <a href="Admin.html"><button>Return</button></a>
	</center>

</body>
</html>