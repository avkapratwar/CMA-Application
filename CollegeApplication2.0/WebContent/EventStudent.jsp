<%@page import="java.util.List"%>
<%@page import="com.virtusa.cma.entity.Events"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
	<jsp:useBean id="beanEvents" class="com.virtusa.cma.service.EventsServiceImpl"/>
<table class="table table-bordered table-hover">
      <tr class="info" border="3">  
	



		<th>Eventid</th>
		<th>EventName</th>
		<th>EventDate</th>
		<th>Venue</th>
	</tr>
	
	<% 
		List<Events> list = (List)beanEvents.showAllEventsService();
		
		for(Events event : list) {
			
	%>
		<tr>
		<td>
			<%=event.getEventId() %> 
		</td>
		<td>
			<%=event.getEventName() %>
		</td>
		<td>
			<%=event.getEventDate() %>
		</td>
		<td>
			<%=event.getVenue() %>
		</td>
		
	</tr>
		<%
	}
	%>
	
</table>
<br/><br/>
		
</body>
</html>