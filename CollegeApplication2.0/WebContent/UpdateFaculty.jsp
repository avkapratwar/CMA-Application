<%@page import="java.sql.ResultSet"%>
<%@page import="com.virtusa.cma.service.FacultyServiceIface"%>
<%@page import="com.virtusa.cma.service.FacultyServiceImpl"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.virtusa.cma.entity.Faculty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: url("images/book.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	color: white;
}
</style>
</head>
<body>
	<%
		String empno = request.getParameter("empno").trim();
		//out.println("Empno " +empno + "<br/><br/>");

		FacultyServiceIface facultyServiceIface = new FacultyServiceImpl();
		Faculty faculty = new Faculty();
		faculty.setEmpno(empno);
		Faculty faculty1 = facultyServiceIface.showFaculty(faculty);
		if (faculty1 != null) {
	%>

	<form method="post" action="UpdateF.jsp">
		<center>
			Employ No : <input type="text" name="empno" readonly="readonly"
				value="<%=empno%>" /> <br />
			<br /> First Name : <input type="text" name="firstname"
				value="<%=faculty1.getFirstname()%>" /> <br />
			<br /> Last Name : <input type="text" name="lastname"
				value="<%=faculty1.getLastname()%>" /> <br />
			<br /> DateOfBirth : <input type="date" name="dob"
				value="<%=faculty1.getDob()%>" /> <br />
			<br /> E-mail : <input type="text" name="email"
				value="<%=faculty1.getEmail()%>" /> <br />
			<br /> Mobile Number : <input type="text" name="mobilenumber"
				value="<%=faculty1.getPhoneNumber()%>" /> <br />
			<br /> Experience : <input type="text" name="experience"
				value="<%=faculty1.getEe()%>" /> <br />
			<br /> Department : <input type="text" name="department"
				value="<%=faculty1.getDepartment()%>" /> <br />
			<br /> City : <input type="text" name="city"
				value="<%=faculty1.getCity()%>" /> <br />
			<br /> State : <input type="text" name="state"
				value="<%=faculty1.getState()%>" /> <br />
			<br /> <input type="submit" value="Update" />
		</center>
	</form>
	<%
		}
	%>
</body>
</html>