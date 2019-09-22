
<%@page import="com.virtusa.cma.entity.Student"%>
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

	<%
		String uname = request.getParameter("username");
		String uType = request.getParameter("userType");
		//out.print(uname + " " + uType);
	%>
	</form>
		---------------------------------------------------------------------------------
<table class="table table-bordered table-hover">
      <tr class="info">  
			<th>Studentid</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>DateOfBirth</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Mobile NO</th>
			<th>ParentsMobile NO</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Department</th>
			<th>Update</th>
		</tr>
		<%
			/*if (uname != null) {

				//if(request.getParameter("studentid")!=null)
				//{
				//String st=request.getParameter("studentid");
				Student s1 = new Student();
				Student s = s1.showStudent(uname);
				if (s != null) {
					System.out.println("Student number is" + s.getStudentid());
					uname = s.getStudentid();*/
					Student student=(Student) request.getAttribute("student");
		%>
		<tr>
			<td><%=student.getStudentid()%></td>
			<td><%=student.getFirstname()%></td>
			<td><%=student.getLastname()%></td>
			<td><%=student.getDob()%></td>
			<td><%=student.getGender()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getMobileNumber()%></td>
			<td><%=student.getParentsMobileNumber()%></td>
			<td><%=student.getAddress()%></td>
			<td><%=student.getCity()%></td>
			<td><%=student.getState()%></td>
			<td><%=student.getDepartment()%></td>
			<td><a href="UpdateStudent.jsp?studentid=<%=uname%>">Update</a>
			</td>

		</tr>

	</table>
	
</body>
</html>