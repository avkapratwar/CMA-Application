`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	
	<%
		
	%>
	<form method="post" action="UpdateUsersController">

         <center> 
				UserName:<br/>
               <input type="text"name="userName"value="${user.userName }" readonly="readonly"/><br/>
               
               UserType:<br/>
               <input type="text"name="type" value="${user.type }" /><br/>
               UserStatus:
               <input type="text"name="status"value="${user.status }"/><br/>

                  <input type="submit"value="submit">
                 </center>

               

                </form>
</body>
</html>