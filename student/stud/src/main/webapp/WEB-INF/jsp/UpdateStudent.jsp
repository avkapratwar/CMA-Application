<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: url("images/book.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	color: blue;
}
</style>
</head>
<body>
<form method="get" action="Update" >
			Student Id : <input type="text" name="studentid" value="${student.studentid}"/><br/>
			<br/> First Name : <input type="text" name="firstname" value="${student.firstname}"/> <br/>
			<br/> Last Name : <input type="text" name="lastname"value="${student.lastname}"/> <br/>
			<br/> DateOfBirth : <input type="date" name="dateofbirth" value="${student.dateofbirth }"/> <br/>
			<br/> Gender : <input type="text" name="gender" value="${student.gender}"/> <br/>
			<br/> E-mail : <input type="text" name="email" value="${student.email}"/> <br/>
			<br/> Mobile Number : <input type="text" name="mobileNo" value="${student.mobileNo}"/> <br/>
			<br/> Parents Mobile Number : <input type="text" name="parentsMobileNo" value="${student.parentsMobileNo}"/> <br/>
			<br/> Address : <input type="text" name="address"value="${student.address}"/> <br/>
		    <br/> City : <input type="text" name="city"value="${student.city}"/> <br/>
			<br/> State : <input type="text" name="state"value="${student.state}"/> <br/>
			<br/> Department : <input type="text" name="department"value="${student.department}"/> <br/>
			
			<br/> <input type="submit" value="click" />
	</form>

</body>
</html>