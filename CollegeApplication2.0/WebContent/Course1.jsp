<%@page import="com.virtusa.cma.entity.Courses"%>
<%@page import="java.io.PrintWriter"%>

<%@page import="java.text.ParseException"%>

<%@page import="jdk.nashorn.internal.runtime.ParserException"%>

<%@page import="java.util.Date"%>

<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.sql.SQLException"%>

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


                <%
                String str=request.getParameter("UserName");
                String courseId=request.getParameter("courseid");
               	Courses course=(Courses)request.getAttribute("courses");
               
                session.setAttribute("username", str);

                %>

               

                <form method="post" action="RegisterCoursesServlet">

                                <center>

                                                courseid:

                                                <input type="text"name="cid"value="<%=course.getCourseId()%>"/><br/>
                                                userName: <input type="text" name="username" value="<%=str%>">

                                                courseName:<input type="text"name="cname"value="<%=course.getCourseName()%>"/><br/>

                                                <input type="submit"value="submit"/>

                               

                                </center>

               

                </form>

</body>

</html>