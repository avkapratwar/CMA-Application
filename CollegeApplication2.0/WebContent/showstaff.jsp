<%@page import="com.virtusa.cma.entity.StaffMeetings"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<center>
<jsp:useBean id="beanStaff" class="com.virtusa.cma.service.StaffMeetingsServiceIfaceImpl"/>
		<table class="table table-bordered table-hover">
			<tr class="info" border="3">



				<th>MeetingType</th>
				<th>MeetingDate</th>

			</tr>

			<%
			//StaffMeetings staffMeetings= new StaffMeetings();
			List<StaffMeetings> staffmeet = (List)request.getAttribute("ck");

				for (StaffMeetings a : staffmeet) {
			%>
			<tr>
				<td><%=a.getMeetingType()%></td>
				<td><%=a.getMeetingDate()%></td>

			</tr>
			<%
				}
			%>

		</table>
	</center>
</body>
</html>