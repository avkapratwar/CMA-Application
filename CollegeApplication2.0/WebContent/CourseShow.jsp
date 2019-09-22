<%@page import="com.virtusa.cma.entity.Courses"%>
<%@page import="com.virtusa.cma.service.CourseServiceImpl"%>
<%@page import="com.virtusa.cma.dao.CourseDaoIface"%>
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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

<center>
---------------------------------------------------------------------------------
<table class="table table-bordered table-hover">
      <tr class="info" border="3">  

		<th>CourseId</th>
		<th>CourseName</th>
		<th>StartDate</th>
		<th>EndDate</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	
	

	
		

			<%
				
				Courses[] crs = (Courses[])request.getAttribute("courses");

				for (Courses u : crs) {
					
					java.util.Date utilDate1 = new java.util.Date(u.getStartDate().getTime());
					String stSimple= new SimpleDateFormat("MM-dd-yy").format(utilDate1);
	 				
					java.util.Date utilDate = new java.util.Date(u.getEndDate().getTime());
					String edSimple= new SimpleDateFormat("MM-dd-yy").format(utilDate);
	 				
					
			%>
			<tr>
				<td><%=u.getCourseId()%></td>
				<td><%=u.getCourseName()%></td>
				<td><%=stSimple%></td>
				<td><%=edSimple%></td>

		<td>
			<a href="ShowCoursesServlet?cid=<%=u.getCourseId() %>&type=update">Update</a>
		</td>
		<td>
			<a href="DeleteCourseServle?cid=<%=u.getCourseId()%>">Delete</a>
		</td>
	</tr>
		<%
	}
	%>
	
</table>
<br/><br/>
	<a href="Admin.html"><button>Return</button></a>
</center>	

</body>
</html>
