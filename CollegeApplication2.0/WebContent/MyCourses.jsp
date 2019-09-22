<%@page import="com.virtusa.cma.util.DaoConnection"%>
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

<title>My courses</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<center>
<body>

<h2>MY COURSES</h2>
	<table class="table table-bordered table-hover">
      <tr class="info" border="3">  
	
	
		<th>CourseId</th>
		<th>CourseName</th>
		
	</tr>

<%
                String uName=request.getParameter("username");
out.print(uName);
                Connection con;
				con = DaoConnection.getConnection();

                //HttpSession session1=request.getSession(true);

                //String username=(String)session.getAttribute("username");

               // out.println(username);

                String cmd="select * from regcourses where userid=?";
                PreparedStatement pst=con.prepareStatement(cmd);
                pst.setString(1,uName);	
                //out.print(uName);
                ResultSet rs=pst.executeQuery();
              
                while(rs.next()){
            		%>
            	<tr>
            		<td>
            			<%=rs.getString("courseid") %>
            		</td>
            		<td>
            			<%=rs.getString("coursename") %>
            		</td>
            	</tr>
            	
            		<%
            	}
            	%>
            	</table>

               

</body>
</center>
</html>
