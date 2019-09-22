<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginvalid">
<table>
<tr>
<td>
UserName:
</td>
<td>
<input type="text" name="userName" required="required"/><br/>
</td>
</tr>
<tr>
<td>
Password:
</td>
<td>
<input type="password" name="passWord" required="required"/><br/>
</td>
</tr>
<tr>
<td>
UserType:
</td>
<td>
<select name="userType" required="required">
        <option value="Student">Student</option>
        <option value="Faculty">Faculty</option>
        <option value="Admin">Admin</option>
        <option value="Alumni">Alumni</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="submit" name="submit" value="login"/>

</td>
</tr>
</table>
</form>
</body>
</html>