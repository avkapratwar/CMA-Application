<%@page import="com.virtusa.cma.entity.Courses"%>
<%@page import="java.io.PrintWriter"%>

<%@page import="java.text.ParseException"%>

<%@page import="jdk.nashorn.internal.runtime.ParserException"%>

<%@page import="java.util.Date"%>

<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.sql.SQLException"%>

<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>






	<form method="post" action="registerCourses">

		<center>

			courseid: <input type="text" name="courseId"
				value="${course.courseId}" /><br /> userName: <input
				type="text" name="username"> courseName:<input
				type="text" name="courseName" value="${course.courseName}" /><br />

			<input type="submit" value="submit" />



		</center>



	</form>

</body>

</html>