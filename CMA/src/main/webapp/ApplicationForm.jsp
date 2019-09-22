<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="style.css" />
<style>
.navbar {
	overflow: hidden;
	background-color: black;
	top: 0;
	width: 100%;
}

.navbar a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.navbar a:hover {
	background: #ddd;
	color: black;
}
</style>

<link href="resources/CSS/bootstrap.min.css" rel="stylesheet">
<link href="resources/CSS/style.css" rel="stylesheet">
<link href="resources/CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<img src="resources/images/logo-hcu.png" style="width: 500px; height: 170px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ApplicationForm.jsp"><img src="resources/images/admission.png"
			style="width: 250px; height: 170px;" alt="registration open"></a><img
			src="resources/images/leftpoint.gif" style="width: 50px; height: 50px;"
			alt="vb"></a>click here<br />
		<br />
	</div>
	<hr>
	<div class="navbar">
  <a href="index.jsp">Home</a>
  <a href="UohAboutus.jsp">Aboutus</a>
  <a href="News.jsp">News</a>
  <a href="Academics.jsp">Academics</a>
  <a href="NewsLetter.jsp">NewsLetter</a>
  <a href="AntiRagging.jsp">AntiRagging</a>
  <a href="Applicationstatus.jsp">Applicationstatus</a>
  <a href="LoginStatus.jsp">Loginstatus</a>
  <a href="MainLogin.jsp">Login</a>
</div>
	<center>
		<b><h3>Application For University of Hyderabad</h3></b>
	</center>
	<hr>
	<form method="get" action="addapplicant">

		<center>

			<div class="input-group">
				<label>Firstname*</label> <input type="text" name="firstName"
					required />
			</div>
			<div class="input-group">
				<label>Lastname(Surname)*</label> <input type="text" name="lastName"
					required />
			</div>
			<div class="input-group">
				<label>Contact Number*</label> <input type="number" name="contactNumber"
					required />
			</div>
			<div>
				<label>Gender*</label><br /> <input type="radio" name="gender"
					value="male" checked> Male <input type="radio"
					name="gender" value="female"> Female <input type="radio"
					name="gender" value="other"> Other
			</div>
			<div class="input-group">
				<label>Date of Birth*</label> <input type="date" name="dateOfBirth"
					placeholder="MM/dd/yyyy" required />
			</div>
			<div class="input-group">
				<label>Fathername*</label> <input type="text" name="fatherName"
					required />
			</div>

			<div class="input-group">
				<label>Email*</label> <input type="email" name="email" required />
			</div>
			<div class="input-group">
				<label>10th percentage*</label> <input type="number"
					name="xPercent" required />
			</div>
			<div class="input-group">
				<label>12th Percentage*</label> <input type="number"
					name="xiiPercent" required />
			</div>
			<div class="input-group">
				<label>UG percentage</label> <input type="number"
					name="ugPercent" />
			</div>
			<div class="input-group">
				<label>State*</label> <input type="text" name="state" required />
			</div>
			<div class="input-group">
				<label>Country*</label> <input type="text" name="country" required />
			</div>

			<input type="checkbox" name="agree" required /> I Agree*


			<div class="input-group">
				<button type="submit" name="submit">Submit</button>
			</div>
		</center>

	</form>
	<hr>
	<div class="lates">



		<div class="text-center">

			<h2>&nbsp;&nbsp;OUR UNIVERSITY</h2>

		</div>

		<div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms"
			data-wow-delay="300ms">

			<img src="resources/images/LAB.jpg" class="img-responsive">

			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				LABS</h3>

			<p align="justify">The laboratories are fully equipped with
				complete set of latest equipments and tools, which caters to the
				need of the undergraduate and post graduate students and has
				experienced technical staff from industrial background.</p>

		</div>



		<div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms"
			data-wow-delay="600ms">

			<img src="resources/images/LIB.jpeg" class="img-responsive"><br />
			<br />
			<br />

			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				LIBRARY</h3>

			<p align="justify">The college has a very good Library, computing
				and internet facilities. The library has total volumes of
				16,216(2849 titles) in addition to a good number of both National
				and International journals. It has e-journal subscription available
				through DELNET. The students are encouraged to make full use of the
				Central Library, Digital Library and other facilities.</p>

		</div>



		<div class="col-md-4">

			<img src="resources/images/ctc offered ug.jpg" class="img-responsive">

			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				PLACEMENT</h3>

			<p align="justify" class="text-justify">The Training &amp;
				Placement Cell at UoH is a very strong department with an impeccable
				track record in placing students right after their graduation. The
				Training &amp; Placement Cell constantly keeps in touch with HRs of
				various major MNCs and IT companies to enhance the employability of
				the students.</p>

		</div>



	</div>

</body>
</html>




