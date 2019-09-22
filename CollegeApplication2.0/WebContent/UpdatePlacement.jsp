
<%@page import="com.virtusa.cma.service.PlacementServiceIfaceImpl"%>
<%@page import="com.virtusa.cma.service.PlacementServiceIface"%>
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
<style>
body
{
background-image:url("images/placement.jpg");
background-repeat:no-repeat;
background-size:cover;

}

</style>

</head>
<body>
	
	<jsp:useBean id="beanPl" class="com.virtusa.cma.entity.Placement" />
	<%
	PlacementServiceIface bp=new PlacementServiceIfaceImpl();
		String companyName = request.getParameter("companyName");
		beanPl=bp.showParticularPlacement(companyName);
		

	%>
	
	<br/><br/>
	<form method="get" action="PlacementUpdServlet">
		<center>
			<h3>Company Name : </h3>
			<input type="text" name="companyName"
				readonly="readonly" value="<%=beanPl.getCompanyName()%>" /> <br />
			<br /> 
			<h3>Drive Date : </h3>
			<input type="date" name="driveDate"
				value="<%=beanPl.getDriveDate()%>" /> <br />
			<br /> <input type="submit" value="Update" />
		</center>
	</form>
	
</body>
</html>
