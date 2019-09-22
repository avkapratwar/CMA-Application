<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="<c:url value="/resources/CSS/style.css" />" rel="stylesheet"  type="text/css" />

</head>
<body>
	<div class="header">
		<center><h2>Add User</h2></center>
	</div>
	<center>
	<form method="post" action="AddUserController.ind">
		<div class="input-group">
			<label>Username(Rollno)</label> <input type="text" name="userName">
		</div>
		<div class="input-group">
			<label>Password</label> <input type="text" name="password" disabled>
		</div>
		<div class="input-group">
			<label>Type</label> <select name="type">
				<option value="Student">Student</option>
				<option value="Faculty">Faculty</option>
				<option value="Alumni">Alumni</option>

			</select>
		</div>
		<center>
			<div class="input-group">
				<button type="submit" class="btn" name="submit">Add</button>
			</div>
			<center>
				<center>
					<a href="ShowAllUsersController">Search User</a>
				</center>
			
	

				<br /> <br />
	</form>
	</center>
	<center><h1>${msg}</h1></center>
</body>
</html>
</body>
</html>