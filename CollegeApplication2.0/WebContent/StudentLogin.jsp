<%@page import="com.virtusa.cma.util.DaoConnection"%>
<%@page import="java.sql.Types"%>
<%@page import="java.sql.CallableStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>


<script type="text/javaScript">
	function disableBackButton() {
		window.history.forward();
	}
	setTimeout("disableBackButton()", 0);
</script>
</head>
<body>
<body onload="disableBackButton()">




	<%
		//com.employeeinfo.EmployeeInfo empinfo=new com.employeeinfo.EmployeeInfo  ();
		String userid, pwd;
		int c;
		String uType;
		uType = request.getParameter("UserType");
		userid = request.getParameter("UserName");
		pwd = request.getParameter("password");
		String type = request.getParameter("UserType");
		//Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DaoConnection.getConnection();
		CallableStatement cs = con.prepareCall("call prcStudentLogin(?,?,?,?)");
		cs.setString(1, request.getParameter("UserName"));
		cs.setString(2, request.getParameter("password"));
		cs.setString(3, request.getParameter("UserType"));
		cs.registerOutParameter(4, Types.INTEGER);
		cs.execute();
		int res = cs.getInt(4);

		//System.out.println(rs.getString("empid"));

		//out.print(res);
		if (res == 0) {
			if (uType.equals("Student")) {
				RequestDispatcher rs = request.getRequestDispatcher("Student.jsp");
				rs.forward(request, response);
			}
			if (uType.equals("Faculty")) {
				RequestDispatcher rs = request.getRequestDispatcher("Faculty.jsp");
				rs.forward(request, response);
			}
			if (type.equals("Alumni")) {
				RequestDispatcher rs = request.getRequestDispatcher("AlumniBase.jsp");
				rs.forward(request, response);
			}
			if (uType.equals("Admin")) {
				RequestDispatcher rs = request.getRequestDispatcher("Admin.html");
				rs.forward(request, response);
			}

			out.println("Correct User");
		} else {
			out.println("Incorrect Credentials");
		}
	%>
</body>
</html>