<%@page import="com.virtusa.cma.service.PlacementServiceIface"%>
<%@page import="com.virtusa.cma.service.PlacementServiceIfaceImpl" %>
<%@page import="com.virtusa.cma.entity.Placement"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<center>
	---------------------------------------------------------------------------------
<table class="table table-bordered table-hover">
      <tr class="info">  

		<th>Company Name</th>
		<th>Drive Date</th>
		<th>Update</th>
		<th>Delete</th>
		
		
	</tr>
	<%
	Placement p1=new Placement();
	PlacementServiceIface pl=new PlacementServiceIfaceImpl();
    
	Placement p[]=pl.showPlacement();
	int i=0;
	int n=p.length;
	while(i<n) 
	{		%> 
	<tr>
		<td>
			<%=p[i].getCompanyName()%>
		</td>
		<td>
			<%=p[i].getDriveDate()%>
		</td>
		<td>
		<a href="UpdatePlacement.jsp?companyName=<%=p[i].getCompanyName()%>">Update</a>
		</td>
		<td>
		<a href="PlacementDeleteServlet?companyName=<%=p[i].getCompanyName()%>">Delete</a>
		</td>
	</tr>
		<%
	i++;
	}
	%>
	
</table>
<br/><br/>
	<a href="InsertAdmin.html">Add company</a>
	<br/><br/>
	<a href="Admin.html">Return</a><br/><br/>
</center>	
</body>
</html>
