<%@page import="java.util.List"%>
<%@page import="com.virtusa.cma.entity.Feedback"%>
<%@page import="com.virtusa.cma.util.DaoConnection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanFeedBack" class="com.virtusa.cma.service.FeedbackServiceImpl"/>
	<table class="table table-bordered table-hover" border="3">
      <tr class="info">  
	
		<th>UserName</th>
		<th>UserType</th>
		<th>Rating</th>
		<th>Comments</th>	
	</tr>
	<% 
	List<Feedback> feedback = beanFeedBack.showAllFeedback();
		
		for(Feedback f : feedback) {
	%>
		<tr>
		<td>
			<%=f.getUserId() %> 
		</td>
		<td>
			<%=f.getUserType() %>
		</td>
		<td>
			<%=f.getRating()%>
		</td>
		<td>
			<%=f.getFeedBack() %>
		</td>		
		</tr>
		
		<%
		}
	%>
	
	</table>
</body>
</html>