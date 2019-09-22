<%@page import="com.virtusa.cma.entity.Faculty"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.virtusa.cma.service.FacultyServiceIface"%>
<%@page import="com.virtusa.cma.service.FacultyServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
		java.sql.Date st = new java.sql.Date(date.getTime());
		/*Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1522:pavi","scott","tiger");
		String cmd="update facultyinfo set firstname=?,lastname=?,dateofbirth=?,email=?,mobilenumber=?,experience=?,department=?,city=?,state=? Where Empno=?";
		
		
		PreparedStatement pst=con.prepareStatement(cmd);*/
		Faculty f = new Faculty();
		FacultyServiceIface facultyServiceIface = new FacultyServiceImpl();
		f.setEmpno(request.getParameter("empno"));
		f.setFirstname(request.getParameter("firstname"));
		f.setLastname(request.getParameter("lastname"));
		f.setDob(st);
		f.setEmail(request.getParameter("email"));
		f.setPhoneNumber(request.getParameter("mobilenumber"));
		//pst.setString(6,request.getParameter("qualification"));
		f.setEe(request.getParameter("experience"));
		f.setDepartment(request.getParameter("department"));
		//pst.setString(8,request.getParameter("gender"));
		f.setCity(request.getParameter("city"));
		f.setState(request.getParameter("state"));
		String s = facultyServiceIface.updateFaculty(f);
		
		//pst.setString(13,request.getParameter("empno"));
		response.getWriter().println(s);
	%>
	<a href="ShowFacultyServlet?username=<%=request.getParameter("empno")%>">Update</a>
</body>
</html>