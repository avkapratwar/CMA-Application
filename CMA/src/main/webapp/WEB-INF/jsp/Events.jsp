<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>EVENTSPAGE</title>
<style>
body{
  background-image:url("images/img6.jpg");
  background-repeat: no-repeat;
  background-size:cover;
}
.txt
{
color:blue
}
</style>
<title>Insert title here</title>
</head>
<body>
<form  action="Add"  method="post">
<h1  class="txt" >EVENTS</h1>
<br>
<table>

<tr>
<td><h3  class="txt">EVENTID</h3></td><td><input type="text" name="eventId" required></td>
</tr>

<tr>
<td><h3  class="txt">EVENTNAME</h3></td><td><input type="text" name="eventName" required></td>
</tr>

<tr>
<td><h3  class="txt">EVENTDATE</h3></td><td><input type="date" name="eventDate" placeholder="MM/dd/yyyy" required></td>
</tr>

<tr>
<td>
<h3  class="txt">VENUE</h3></td><td><input type="text" name="venue" required></td>
</table>

<input type="submit" value="Click">
</form>

</body>
</html>