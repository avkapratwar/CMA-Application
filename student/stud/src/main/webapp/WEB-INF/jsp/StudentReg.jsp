<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>

</head>
<body>

	<script>
		function validation() {
			var x = document.forms["login"]["firstname"].value;
			if ((x == "") || (!(isNaN(x))) || (x.match(/^[0-9,a-z]+$/))
					&& (!(x.match(/^[a-z]+$/))) || (x.match(/^[0-9]+$/))) {
				document.getElementById("fname").style.border = "1px solid red";
				alert("First Name must be filled out");
				return false;
			}

			var y = document.forms["login"]["lastname"].value;
			if ((y == "") || (!(isNaN(x))) || (y.match(/^[0-9,a-z]+$/))
					&& (!(y.match(/^[a-z]+$/)))) {
				document.getElementById("lname").style.border = "1px solid red";
				alert("Last Name must be filled out");
				return false;
			}
			var v = document.forms["login"]["email"].value;
			if ((v == "") || (v.indexOf('@') <= 0)
					|| (v.charAt(v.length - 4) != '.')
					&& (v.charAt(v.length - 3) != '.')) {
				document.getElementById("email").style.border = "1px solid red";
				alert("E-mail must be filled out properly");
				return false;
			}
			var w = document.forms["login"]["mobileno"].value;
			if ((w == " ") || (isNaN(w)) || (w.length != 10)) {
				document.getElementById("mobileno").style.border = "1px solid red";
				alert("Enter correct mobile numer");
				return false;
			}
			var w = document.forms["login"]["pmobileno"].value;
			if ((w == " ") || (isNaN(w)) || (w.length != 10)) {
				document.getElementById("pmobileno").style.border = "1px solid red";
				alert("Enter correct mobile numer");
				return false;
			}
			var y = document.forms["login"]["address"].value;
			if ((y == "") || (!(isNaN(x))) || (y.match(/^[0-9,a-z]+$/))
					&& (!(y.match(/^[a-z]+$/)))) {
				document.getElementById("address").style.border = "1px solid red";
				alert("address must be filled out");
				return false;
			}
		}
	</script>
</head>
<body>

	<center>
		<h1>Student Registration</h1>

		
		<form name="login" action="ins"
			onsubmit="return validation()">

			<h3>Student Id:</h3>
			<input type="text" name="studentid" id="sid" value=${student.studentid }/>
			<h3>First Name:</h3>

			<input type="text" name="firstname" id="fname" required /><br />
			<h3>Last Name:</h3>

			<input type="text" name="lastname" id="lname" required /><br />

			<h3>Date of Birth:</h3>
			<input type="date" name="dateofbirth" placeholder="MM/dd/yyyy"
				id="dob" required /><br />

			<h3>Gender:</h3>
			<input type="radio" name="gender" value="male">Male<br>
			<input type="radio" name="gender" value="female">Female<br>
			<input type="radio" name="gender" value="other">Other<br>

			<h3>E-mail Id:</h3>
			<input type="text" name="email" id="email" required /><br />

			<h3>Mobile Number:</h3>
			<input type="text" name="mobileNo" id="mobileno" required /><br />

			<h3>Parent Mobile Number:</h3>
			<input type="text" name="parentsMobileNo" id="pmobileno" required /><br />

			<h3>Address:</h3>
			<input type="text" name="address" id="address" required /><br />

			<h3>City:</h3>
			<input type="text" name="city" id="city" required /><br />

			<h3>State:</h3>
			<input type="text" name="state" id="state" required /><br />

			<h3>Department:</h3>
			<select id="department" name="department">
				<option type="text" value="CSE">CSE</option>
				<option type="text" value="IT">IT</option>
				<option type="text" value="MECH">MECH</option>
				<option type="text" value="CIVIL">CIVIL</option>
				<option type="text" value="EEE">EEE</option>
				<option type="text" value="BME">BME</option>
				<option type="text" value="E&I">E&I</option>
			</select><br /> <br> <input type="submit" name="submit" />
		</form>

	</center>
</body>
</html>
