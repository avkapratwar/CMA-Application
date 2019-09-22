<!-- <html>
<body>
<a href="test">ClickHere-Test</a>
<a href="addUser">Add User</a>
<a href="ShowAllUsersController">Show All Users</a>
<a href="ShowAllAlumni">Show All Alumni</a>
<a tabindex="-1" href="ins" ><button style="background-color:white;">Add Information</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a tabindex="-1" href="show" ><button style="background-color:white;">Show Information</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="applicationstatus">ApplicationStatus</a><br/>
<a href="applicantregister">register here</a> <br/>
<a href="showallregister">showapplicants</a> <br/>
<a href="login">login</a>
</body>
</html> -->



<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<style>
.navbar {
  overflow: hidden;
  background-color: #333;
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
<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/CSS/bootstrap.min.css" rel="stylesheet">
<link href="resources/CSS/style.css" rel="stylesheet">
<link href="resources/CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</head>
<body>
<div>
<img src="resources/images/logo-hcu.png" style="width:500px;height:170px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="ApplicationForm.jsp"><img src="resources/images/admission.png" style="width:250px;height:170px;" alt="registration open"></a><img src="resources/images/leftpoint.gif" style="width:50px;height:50px;" alt="vb">click logo</a><br/><br/>
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
<div class="container">
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" data-interval="3000">
								<!-- Indicators -->
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
									<li data-target="#carousel-example-generic" data-slide-to="1"></li>
									<li data-target="#carousel-example-generic" data-slide-to="2"></li>
								</ol>
								  <!------- Wrapper for slides --------->
									<div class="carousel-inner" role="listbox">
										<div class="item active">
											<img src="resources/images/uohhyd.jpg" alt="...">
										</div>
										<div class="item">
										  <img src="resources/images/uohhyd.jpg" alt="...">
										</div>
										<div class="item">
										  <img src="resources/images/uohhyd.jpg" alt="...">
										</div>
									</div>
										<!---------- Controls --------->
										<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
											<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
											<span class="sr-only">Previous</span>
										</a>
										<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
											<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
											<span class="sr-only">Next</span>
										</a>
										
							</div><!------------ carousel slide --------------->
</div>

<hr>
<div class="lates">

		

			<div class="text-center">

				<h2>&nbsp;&nbsp;OUR UNIVERSITY</h2>

			</div>

			<div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">

				<img src="resources/images/LAB.jpg" class="img-responsive">

				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; LABS </h3>

				<p align="justify">The laboratories are fully equipped with complete set of latest equipments and tools, which caters to the need of the undergraduate and post graduate students and has experienced technical staff from industrial background.</p>

		  </div>

			

			<div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">

				<img src="resources/images/LIB.jpeg" class="img-responsive"><br/><br/><br/>

				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; LIBRARY</h3>

				<p align="justify">The college has a very good Library, computing and internet facilities. The library has total volumes of 16,216(2849 titles) in addition to a good number of both National and International journals. It has e-journal subscription available through DELNET. The students are encouraged to make full use of the Central Library, Digital Library and other facilities.</p>

		  </div>

			

			<div class="col-md-4">				

				<img src="resources/images/ctc offered ug.jpg" class="img-responsive">

				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; PLACEMENT</h3>

				<p align="justify" class="text-justify">The Training &amp; Placement Cell at UoH is a very strong department with an impeccable track record in placing students right after their graduation. The Training &amp; Placement Cell constantly keeps in touch with HRs of various major MNCs and IT companies to enhance the employability of the students.</p>

		  </div>

	 

  </div>
</body>
</html>
<!-- <html>  
<body>  
<a href="applicationstatus">ApplicationStatus</a><br/>
<a href="applicantregister">register here</a> <br/>
<a href="showallregister">showapplicants</a> <br/>
<a href="login">login</a>
<a href="courses">Courses</a>
</body>  
</html>  -->