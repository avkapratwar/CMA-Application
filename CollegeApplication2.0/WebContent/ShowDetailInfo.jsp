
<%@page import="com.virtusa.cma.entity.Applicants"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		
		
		<%
		Applicants applicants=(Applicants)request.getAttribute("applicants");
	
	%>
	<br/><br/>
	
	Application Number:<%	out.println(applicants.getApplicationNumber());%><br/><br/>
	First Name : <%out.println(applicants.getFirstName());%><br/><br/>
	Last Name:<% out.println(applicants.getLastName());%><br/><br/>
	Contact Number:<% out.println(applicants.getContactNumber());%><br/><br/>
	Gender : <% out.println(applicants.getGender());%><br/><br/>
	DOB : <%
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  

	 String strDate= formatter.format(applicants.getDateOfBirth());
	 out.println(strDate);
	
	%><br/><br/>
	Father Name : <% out.println(applicants.getFatherName());%><br/><br/>
	Email : <% out.println(applicants.getEmail());%><br/><br/>
	X Percentage : <% out.println(applicants.getxPercent());%><br/><br/>
	Xii Percentage : <% out.println(applicants.getXiiPercent());%><br/><br/>
	UG Percentage : <% out.println(applicants.getUgPercent());%><br/><br/>
	State : <% out.println(applicants.getState());%><br/><br/>
	Country : <% out.println(applicants.getCountry());%><br/><br/>
	Status : <%out.println(applicants.getStatus()); %><br/><br/>
	
	<center>
	Status<br/>
	<form method="get" action="UpdateAppStatusController">
		<input type="radio" name="status" value="Accepted">Accept<br/>
		<input type="radio" name="status" value="Rejected">Reject<br/>
		<input type="hidden" name="appNo" value="<%=applicants.getApplicationNumber()%>">
		<input type="submit" value="Set">
	</form><br/>
	<a href="Admin.html"><button>Return</button></a>
	</center>
</body>
</html>