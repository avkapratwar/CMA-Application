<!DOCTYPE html>
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
<meta charset="ISO-8859-1">
<title>User Login</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<!-- Bootstrap -->
<title>Student Login</title>
<link href="resources/CSS/bootstrap.min.css" rel="stylesheet">
<link href="resources/CSS/studentlogin.css" rel="stylesheet">
<link href="resources/CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
	<div class="main_header_row">
		<div class="container">
			<div class="row">
				<div class="col-md-3 col-xs-12">
					<!--------------- Start Logo ----------->

					<img src="resources/images/logo-hcu.png" style="width: 500px; height: 170px;">

					<!--------------- End of logo ------------>
				</div>
				<!------------ [col]--------------->
				<div class="col-md-5"></div>
				<!------------- [col] --------------->
				<div class="col-md-4 col-xs-12">
					<!--------------- Search form ------------->
					<div class="call_us">
						<span> <a href="#"><i
								class="fa fa-phone details_icon_size "></i></a> Or <a href="#"><i
								class="fa fa-whatsapp details_icon_size "></i></a> us on
						</span> : <b> 040 2313 2102</b>
					</div>
					<!------------ call_us ----------------->
					<!------------- End search form --------------->
				</div>
				<!--------------- [col]---------------->
			</div>
			<!------------- .row -------------->
		</div>
		<!--------------- .container ----------->
	</div>
	<!------------- .main_header_row --------------->
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
		<div id="page_wrapper">
			<div class="container">
				<h2 class="heading">User Login</h2>
				<hr>
				<div class="section_offset">
					<form action="loginvalid">
						<ul>
							<li class="row">
								<div class="col-md-6 col-md-offset-3">
									Already registered? Please log in below:<br>
									<br>
									<div class="form-group">
										<label for="UserName" class="required width_100">UserName</label>
										<div class="input-group">
											<span class="form_icon_bg input-group-addon"><i
												class="fa fa-user form_icon"></i></span> <input type="text"
												id="UserName" name="UserName" placeholder="UserName"
												class="form-control" required>
										</div>
										<!---------- input-group ----------->
									</div>
								</div>
								<!--------- [col] ------------>
							</li>
							<li class="row">
								<div class="col-md-6 col-md-offset-3">
									<div class="form-group">
										<label for="Password" class="required width_100">Password</label>
										<div class="input-group">
											<span class="form_icon_bg input-group-addon"><i
												class="fa fa-lock"></i></span> <input type="password"
												name="password" id="passwd" class="form-control"
												placeholder="Password" required>
										</div>
									</div>
								</div>
								<!--------- [col] ----------->
							</li>
							<li class="row">
								<div class="col-md-6 col-md-offset-3">
									<div class="form-group">
										<label for="type">Select list (select one):</label> <select
											class="form-control" name="type">
											<option>Student</option>
											<option>Faculty</option>
											<option>Alumni</option>
											<option>Admin</option>
										</select>
									</div>
									<!--------- [col] ----------->
							</li>

							<li class="row">
								<div class="col-md-6 col-md-offset-3">

									<div class="on_the_sides">
										<div class="left_side">
											<a href="ForgotPass.html" class="small_link">Forgot your
												password?</a>
											<div class="left_side">
												<button type="Login" class="btn btn-success active">
													<i class="fa fa-sign-in details_icon_size"></i> Login </a>
												</button>
											</div>
										</div>
										<div class="right_side">
											<span class="prompt">Required Fields</span>
											<div class="right_side">
												<button type="Reset" class="btn btn-success active">
													<i class="fa fa-refresh details_icon_size"></i> Reset </a>
												</button>
											</div>
										</div>
									</div>
								</div>
					</form>
					<!--------- form ------------>
				</div>
			</div>
			<!----------- container ------------>
		</div>
		<!----------- page_wrapper ------------>
		<hr>

		<div class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-xs-12">
						<h4>
							<i class="fa fa-bullhorn details_icon_size"></i> About Us
						</h4>
						<img src="resources/images/hyd.jpg" style="width: 300px; height: 170px;">
						<p>The University of Hyderabad (UoH), one of the major
							institutions of higher education in India is largely devoted to
							postgraduate studies and is widely known for its excellence in
							research and for its distinguished faculty. Founded in 1974 with
							Prof. Gurbaksh Singh as its first Vice Chancellor, UoH - also
							known as Hyderabad Central University or HCU- has emerged as a
							leading centre of teaching and research.</p>
					</div>
					<!---------- [col] --------------->
					<div class="col-md-4 col-xs-12">
						<h4>
							<i class="fa fa-phone" aria-hidden="true"></i> Contact
						</h4>
						<ul>
							<li>Call:040 2313 2102</li>
							<li>registrar@uohyd.ernet.in.</li>
						</ul>

					</div>
					<!---------- [col] --------------->
					<div class="col-md-4 col-xs-12">
						<h4>
							<i class="fa fa-map-marker" aria-hidden="true"></i> Address
						</h4>
						<ul>
							<li>University of Hyderabad,</li>
							<li>Gachibowli,</li>
							<li>District:Hyderabad, Telangana</li>
						</ul>
					</div>
					<!---------- [col] --------------->
				</div>
				<!------------- row -------------->
			</div>
			<!---------- container ---------->
		</div>
		<!------------- footer -------------->
		<hr>
		<div class="footer_section_3 align_center">
			<div class="container">
				<!------------ End of footer navigation ------------>
				<div class="col-md-4 col-xs-12 visit_counter_height"></div>
				<div class="col-md-8 col-xs-12"></div>
				<div class="clearfix"></div>
			</div>
			<!----------- .container --------->
		</div>
		<!------------ .footer_section ------------>
</body>
</html>