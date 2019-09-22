<%@page import="com.virtusa.cma.entity.Courses"%>
<%@page import="java.text.SimpleDateFormat"%>
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
body {
	background-image: url("images/img1.jpg");
}
</style>
</head>
<body>


	<%
// 		String courseId = request.getParameter("cid");
// 		beanCourses = beanCourses.showCourse(courseId);
// 		String stSimple = new SimpleDateFormat("MM-dd-yy").format(beanCourses.getStartDate());
// 		String edSimple = new SimpleDateFormat("MM-dd-yy").format(beanCourses.getEndDate());
		
		Courses crs= (Courses)request.getAttribute("courses");
		
		String stSimple = new SimpleDateFormat("MM-dd-yyyy").format(crs.getStartDate());
 		String edSimple = new SimpleDateFormat("MM-dd-yyyy").format(crs.getEndDate());
		 
	%>
	<form method="get" action="UpdateCourseServlet">
		<center>
			<br />
			<br />
			<h3>COURSEID :</h3>
			<input type="text" name="cid" readonly="readonly"
				value="<%=crs.getCourseId()%>" /> <br />
			<h3>COURSENAME :</h3>
			<input type="text" name="cname"
				value="<%=crs.getCourseName()%>" required /> <br />
			<h3>STARTDATE:</h3>
			<input type="text" name="sdate" value="<%=stSimple%>"
				placeholder="MM/dd/yyyy" required /> <br />
			<h3>ENDDATE :</h3>
			<input type="text" name="edate" value="<%=edSimple%>"
				placeholder="MM/dd/yyyy" required /> <br /> <br /> <input
				type="submit" value="Update" />
		</center>
	</form>
</body>
</html>