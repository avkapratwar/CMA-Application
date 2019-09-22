<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add student</title>
</head>
<body>
	<form:form action="register" method="get" modelAttribute="reg">
<td><label> MEETINGTYPE </label>

<select id="meetingtype" name="meetingtype">

<option value="cse">cse</option>

<option value="ece">ece</option>

<option value="mech">mech</option>

<option value="civil">civil</option>

<option value="eee">eee</option>

<option value="principals">principals</option>

<option value="directors">directors</option>

<option value="ceo">ceo</option>

</select>


		<form:errors path="meetingtype" />
		</br>
meetingdate:
<form:input type="date" path="meetingdate" />
		<form:errors path="meetingdate" />
		</br>
		<input type="submit" value="submit" />
	</form:form>
	<>
</body>
</html>