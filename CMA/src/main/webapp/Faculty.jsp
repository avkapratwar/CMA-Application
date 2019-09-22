<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Faculty</title>
<!-- Bootstrap -->
<link href="resources/CSS/bootstrap.min.css" rel="stylesheet">
<link href="resources/CSS/studentlogin.css" rel="stylesheet">
<link href="resources/CSS/font-awesome/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>
	<div id="page_wrapper">
		<div class="container">
			<div class="row">
				<div class="main_header_row">
					<div class="col-md-3 col-xs-12">
						<!---------- Start Logo ------->
						<img src="resources/images/logo-hcu.png"
							style="width: 500px; height: 170px;">
						<!------------ End of logo-------->
					</div>
					<!---------- [col] ------------>
					<div class="col-md-5"></div>
					<!----------- [col] ----------->
					<div class="col-md-4 col-xs-12">
						<!-------- Search form -------->
						<div class="call_us">
							<span> <a href="#"><i
									class="fa fa-phone details_icon_size "></i></a> Or <a href="#"><i
									class="fa fa-whatsapp details_icon_size "></i></a> us on
							</span> : <b> 040 2313 2102</b>
						</div>
						<!---------- .call_us ----------->
						<!------- End search form ------->
					</div>
					<!------------ [col] ---------->
				</div>
				<!------- .main_header_row ------------>
			</div>
			<!----------- .row ------------>
		</div>
		<!----------- .container ---------->
		<center>
			<h1>Faculty</h1>
		</center>
		<hr>
		<center>
			<div class="page_wrapper">
				<div class="container">
					<div class="buttons">

						<div class="row">

							<div class="col-md-4 col-md-12">
								<%
									String uName = request.getParameter("UserName");
									String uType = request.getParameter("UserType");
								%>


								<a tabindex="-1" href="vcourse?username=<%=uName%>">Courses</a><br />
								<a tabindex="-1" href="ShowPlacementFaculty.jsp">PlacementCalendar</a><br />
								<br /> <br /> <br /> <a tabindex="-1"
									href="FacultyMeeting.html">Staff Meetings</a>



							</div>
							<!-------------[col]------------>

							<div class="col-md-4 col-md-12">
								<a tabindex="-1" href="showAllEvents">Events</a><br /> <br />
								<a tabindex="-1" href="BasicFaculty.jsp?username=<%=uName%>">FacultyInfo</a><br />
								<br /> <a tabindex="-1" href="ShowAllAlumni">AlumniList</a>
							</div>
							<div class="col-md-4 col-md-12">
								<a tabindex="-1" href="ClassSchedule.jsp">ClassSchedule</a><br />
								<br /> <a tabindex="-1" href="ExamSchedule.jsp">ExamSchedule</a><br />
								<a tabindex="-1"
									href="insertfeedback?username=<%=uName%>&userType=<%=uType%>">FeedBAck</a><br />
								<br /> <br /> <a tabindex="-1" href="Logout.html">Logout</a><br />
								<br /> <br />

							</div>

						</div>
						<!------------ button ------------->
					</div>
					<!----------- .container ------------>
				</div>
				<!----------- .page_wrapper ------------>
		</center>
		<hr>






		<div class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-xs-12">
						<h4>
							<i class="fa fa-bullhorn details_icon_size"></i> About Us
						</h4>
						<a href="#"><img src="resources/images/hyd.jpg"
							style="width: 300px; height: 170px;"></a>
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
							<li>University of Hyderaad,</li>
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
