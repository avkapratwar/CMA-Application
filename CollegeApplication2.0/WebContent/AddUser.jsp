<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="header">
		<h2>Add User</h2>
	</div>
	<form method="post" action="AddUserServlet">
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
					<%
						String msg= request.getParameter("msg");
						if(msg!=null){	
							out.write("<h2>"+msg+"</h2>");
						}
					 %>
					<a href="ShowAllUsersController">Search User</a>
				</center>


				<br /> <br />
	</form>
</body>
</html>
</body>
</html>