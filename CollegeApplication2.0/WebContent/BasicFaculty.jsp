<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
  background-image:url("images/profilestudent.jpg");
  background-repeat: no-repeat;
  background-size:cover;
  color:white;
}

</style>
<link href="CSS/bootstrap.min.css" rel="stylesheet">
<link href="CSS/studentlogin.css" rel="stylesheet">
<link href="CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<%String uName = request.getParameter("username"); %>
<!-- 
<a href="FacultyReg.jsp?username=<%=uName%>">Add Information</a><br/><br/>
<a href="ShowFaculty.jsp?username=<%=uName%>">Update Information</a>-->
<h3 style="color : white">Faculty Information</h3>
<br/><br/><br/>
<a tabindex="-1" href="FacultyReg.jsp?username=<%=uName%>" ><button style="background-color:white;">Add Information</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;



<a tabindex="-1" href="ShowFacultyServlet?username=<%=uName%>"><button style="background-color:white;">Update Information</button></a>
								
</body>
</html>