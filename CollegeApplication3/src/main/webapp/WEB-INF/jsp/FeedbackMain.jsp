<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<CENTER>
		<B>
			<H2>Feedback Form</H2>
			<FORM METHOD="post" ACTION="addfeedback">

				User Id <input type="text" name="userName"  ><BR>
				User Type <input type="text" name="userType"  ><BR>
				
				
				<BR> How do you rate the faculty or trainer <INPUT TYPE="radio"
					NAME="rating" VALUE="poor"> Poor <INPUT TYPE="radio"
					NAME="rating" VALUE="good"> Good <INPUT TYPE="radio"
					NAME="rating" VALUE="very good" CHECKED> Very Good <INPUT
					TYPE="radio" NAME="rating" VALUE="excellent"> Excellent <BR>
				<BR> Suggestions for the betterment of faculty or trainer
				<TEXTAREA NAME="comments" ROWS="6" COLS="40">

 
</TEXTAREA>
				<BR>
				<BR> <INPUT TYPE="submit" VALUE="Send"> <INPUT
					TYPE="reset" VALUE="Clear">
			</FORM>
</body>
</html>