`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	
	<%
		String userName,userType,userStatus;
		userName=request.getParameter("userName");
		userType=request.getParameter("userType");
		userStatus=request.getParameter("userStatus");
		//String st=beanUsers.updateUser(userName, userType, userStatus);
		//out.println(st);
	%>
	<form action="UpdateUsersController">

         <center> 
				UserName:
               <input type="text"name="userName"value="<%=userName %>" readonly="readonly"/><br/>
               UserType:
               <input type="text"name="userType"value="<%=userType %>"/><br/>
               UserStatus:
               <input type="text"name="userStatus"value="<%=userStatus %>"/><br/>

                  <input type="submit"value="submit">
                 </center>

               

                </form>
</body>
</html>