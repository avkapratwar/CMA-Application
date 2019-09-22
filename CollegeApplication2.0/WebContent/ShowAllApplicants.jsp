<%@page import="com.virtusa.cma.entity.Applicants"%>
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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
	
	
	<center>
	---------------------------------------------------------------------------------
<table class="table table-bordered table-hover">
      <tr class="info" border="3">  
	
		<th>Application Number</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Contact Number</th>
		<th> </th>
		
	</tr>
	<% 
		Applicants[] apps =(Applicants[]) request.getAttribute("applicants");
		for(Applicants a : apps) {
	%>
		<tr>
		<td>
		<%=a.getApplicationNumber() %>
		</td>
		<td>
			<%=a.getFirstName() %>
		</td>
		<td>
			<%=a.getLastName() %>
		</td>
			<td>
			<%=a.getContactNumber() %>
		</td>
		<td>
		<a href="ShowDetailInfoAppController?applicationNumber=<%=a.getApplicationNumber() %>">Show Detailed Info</a>
		
		</td>
		</tr>
		<%
		}
	%>
	
	</table>
	<a href="Admin.html"><button>Return</button></a>
	</center>
	</body>
</html>