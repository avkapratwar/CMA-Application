<%@page import="com.virtusa.cma.entity.Student"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.virtusa.cma.service.StudentServiceIface" %>
<%@page import="com.virtusa.cma.service.StudentServiceImpl" %>

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
</head>
<body>
<%
Date date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateofbirth"));
java.sql.Date st=new java.sql.Date(date.getTime());	
	Student s=new Student();
	
	StudentServiceIface studentServiceIface=new StudentServiceImpl();
	s.setFirstname(request.getParameter("firstname"));
	s.setLastname(request.getParameter("lastname"));
	s.setDob(st);
	s.setGender(request.getParameter("gender"));
	s.setEmail(request.getParameter("email"));
	s.setMobileNumber(request.getParameter("mobileno"));
	s.setParentsMobileNumber(request.getParameter("parentsmobileno"));
	s.setAddress(request.getParameter("address"));
	s.setCity(request.getParameter("city"));
	s.setState(request.getParameter("state"));
	s.setDepartment(request.getParameter("department"));
	s.setStudentid(request.getParameter("studentid"));
	String output=studentServiceIface.updateStudent(s);
	//response.getWriter().println(out);
	
	%>
<a href="ShowStudentServlet?username=<%=request.getParameter("studentid")%>">Update</a>
</body>
</html>