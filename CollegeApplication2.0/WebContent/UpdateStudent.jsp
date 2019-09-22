
<%@page import="com.virtusa.cma.entity.Student"%>
<%@page import="com.virtusa.cma.service.StudentServiceImpl"%>
<%@page import="com.virtusa.cma.service.StudentServiceIface"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
background-image:url("images/profile.jpg");
background-repeat:no-repeat;
background-size:cover;
color:white;

}
</style>
</head>
<body>
<%
	String studentid=request.getParameter("studentid");
	//out.println("Empno " +empno + "<br/><br/>");
	
	/*Connection con;
	con=DaoConnection.getConnection();
	String cmd="select * from student where Studentid=?";
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setString(1,studentid);
	ResultSet rs=pst.executeQuery();
	rs.next();*/
	StudentServiceIface studentServiceIface=new StudentServiceImpl();
	Student student =new Student();
	student.setStudentid(studentid);
	Student student2=studentServiceIface.showStudent(student);
	if(student2!=null)
	{
%>
	<form method="get" action="UpdateStud.jsp">
		<center>
			Student ID : 
			<input type="text" name="studentid" readonly="readonly" value="<%=student2.getStudentid() %>" /> <br/><br/>
			First Name : 
			<input type="text" name="firstname" value="<%=student2.getFirstname() %>" /> <br/><br/> 
			
			Last Name : 
			<input type="text" name="lastname" value="<%=student2.getLastname() %>" /> <Br/><br/> 
			
			Date Of Birth : 
			<input type="text" name="dateofbirth" value="<%=student2.getDob() %>" /> <Br/><br/> 
			
			Gender : 
			<input type="text" name="gender" value="<%=student2.getGender() %>" /> <Br/><br/> 
			
			Email : 
			<input type="text" name="email" value="<%=student2.getEmail() %>" /> <Br/><br/> 
			
			Mobile Number : 
			<input type="text" name="mobileno" value="<%=student2.getMobileNumber() %>" /> <br/><br/> 
			
			Parents Mobile Number : 
			<input type="text" name="parentsmobileno" value="<%=student2.getParentsMobileNumber() %>" /> <br/><br/> 
			
			Address : 
			<input type="text" name="address" value="<%=student2.getAddress() %>" /> <br/><br/> 
			City : 
			<input type="text" name="city" value="<%=student2.getCity() %>" /> <Br/><br/> 
			
			State : 
			<input type="text" name="state" value="<%=student2.getState() %>" /> <Br/><br/> 
			Department : 
			<input type="text" name="department" value="<%=student2.getDepartment() %>" /> <Br/><br/> 
			
			<input type="submit" value="Update" />
		</center>
	</form>
	<%
	}
	%>
</body>
</html>