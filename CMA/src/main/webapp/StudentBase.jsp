<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="CSS/bootstrap.min.css" rel="stylesheet">
<link href="CSS/studentlogin.css" rel="stylesheet">
<link href="CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<style>
body{
  background-image:url("images/profilestudent.jpg");
  background-repeat: no-repeat;
  background-size:cover;
  color:white;
}
</style>
</head>
<body>
		<%String uName=request.getParameter("username"); 
		String uType=request.getParameter("userType"); 
		%>
<!-- 	
<a href="insert?username=<%=uName%>&userType=<%=uType%>">New Student</a>
  
<a href="show.jsp?username=<%=uName%>&userType=<%=uType%>">Update</a>
-->



<h3>Student Information</h3>
<br/><br/><br/>
<a tabindex="-1" href="insert?username=<%=uName%>" ><button style="background-color:white;">Add Information</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;



<a tabindex="-1" href="show?username=<%=uName%>"><button style="background-color:white;">Update Information</button></a>

</body>
</html>