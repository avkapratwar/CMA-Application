<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
  background-image:url("images/courses.jpg");
  background-repeat: no-repeat;
  background-size:cover;
}
</style>
</head>
<body>


	<% String uName=request.getParameter("username");
		String uType=request.getParameter("UserType");
							%>
							<br/><br/>
<a href="ShowAllCoursesUserServlet?username=<%=uName%>"><button>View All Courses</button></a><br><br>
<a href="MyCourses.jsp?username=<%=uName%>
                        "><button>My Courses</button></a>
</body>
</html>