
<%@page import="com.virtusa.cma.entity.Faculty"%>
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
	<table class="table table-bordered table-hover">
      <tr class="info" border="3">  
	
	<!-- <table border="3">
		<tr>-->
			<th>Empno</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>DateOfBirth</th>
			<th>Email</th>
			<th>Mobile NO</th>
			<th>Qualification</th>
			<th>Experience</th>
			<th>Department</th>
			<th>Gender</th>
			<th>City</th>
			<th>State</th>
			<th>Update</th>
		</tr>

		<%
			/*if (request.getParameter("username") != null) {
				String empno = request.getParameter("username");
				Faculty f1 = new Faculty();
				Faculty f = f1.showFaculty(empno);
				if (f != null) {
					//System.out.println("Employ number is"+f.getEmpno());
					empno = f.getEmpno();
					List<Alumni> alumni = (List) request.getAttribute("alumni");

					for (Alumni a : alumni) {*/
					
					Faculty faculty=(Faculty) request.getAttribute("faculty");
		%>
		<tr>
			<td><%=faculty.getEmpno()%></td>
			<td><%=faculty.getFirstname()%></td>
			
			<td><%=faculty.getLastname()%></td>
			<td><%=faculty.getDob()%></td>
			<td><%=faculty.getEmail()%></td>
			<td><%=faculty.getPhoneNumber()%></td>
			<td><%=faculty.getQq()%></td>
			<td><%=faculty.getEe()%></td>
			<td><%=faculty.getDepartment()%></td>
			<td><%=faculty.getGender()%></td>
			<td><%=faculty.getCity()%></td>
			<td><%=faculty.getState()%></td>
			<td><a href="UpdateFaculty.jsp?empno=<%=faculty.getEmpno()%>">Update</a></td>
			
		</tr>


	</table>
	
</body>
</html>