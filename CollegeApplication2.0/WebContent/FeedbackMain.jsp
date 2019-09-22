<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
  background-image:url("images/feedback.jpg");
  background-repeat: no-repeat;
  background-size:cover;
}
</style>

</head>
<body>

	<CENTER>
		<B>
		<%
		String userName=request.getParameter("username");
		String userType=request.getParameter("userType");
		%>
			<H2>Feedback Form</H2>
			<FORM METHOD="post" ACTION="AddFeedbackServlet">

				User Id <input type="text" name="username" value="<%=userName %>" readonly ><BR>
				User Type <input type="text" name="userType" value="<%=userType %>" readonly ><BR>
				
				
				<BR> How do you rate the faculty or trainer <INPUT TYPE="radio"
					NAME="rating" VALUE="poor"> Poor <INPUT TYPE="radio"
					NAME="rating" VALUE="good"> Good <INPUT TYPE="radio"
					NAME="rating" VALUE="very good" CHECKED> Very Good <INPUT
					TYPE="radio" NAME="rating" VALUE="excellent"> Excellent <BR>
				<BR> Suggestions for the betterment of faculty or trainer
				<textarea rows="4" cols="50" name="comments" placeholder="Enter any comments and suggestions to improve the Course or trainer..."></textarea>
				<BR>
				<BR> <INPUT TYPE="submit" VALUE="Send"> <INPUT
					TYPE="reset" VALUE="Clear">
			</FORM>
<br/>
</body>
</html>