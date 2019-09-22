<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
</head>
<body>

<form action="addapplicant" method="post" >
<table>
<tr>
<td>
FirstName: </td><td>
<input type="text" name="firstName" required="required"/><br/>
</td>
</tr>
<tr>
<td>
LastName:  </td><td>
<input type="text" name="lastName" required="required"/><br/>
</td>
</tr>
<tr>
<td>
MobileNumber:  </td><td>
<input type="number" name="contactNumber" required="required"/><br/>
</td>
</tr>
<tr>
<td>
Gender:  </td><td>
<input type="text" name="gender" required="required"/><br/>
</td>
</tr>
<tr>
<td>
DateOfBirth:  </td><td>
<input type="date" name="dateOfBirth" required="required"/><br/>
</td>
</tr>
<tr>
<td>
FatherName:  </td><td>
<input type="text" name="fatherName" required="required"/><br/>
</td>
</tr>
<tr>
<td>
Email Id:  </td><td>
<input type="email" name="email" required="required"/><br/>
</td>
</tr>
<tr>
<td>
XPercent:  </td><td>
<input type="number" name="xPercent" required="required"/><br/>
</td>
</tr>
<tr>
<td>
XiiPercent:  </td><td>
<input type="number" name="xiiPercent" required="required"/><br/>
</td>
</tr>
<tr>
<td>
UGPercent:  </td><td>
<input type="number" name="ugPercent" required="required"/><br/>
</td>
</tr>
<tr>
<td>
State:  </td><td>
<input type="text" name="state" required="required"/><br/>
</td>
</tr>
<tr>
<td> 
Country:  </td><td>
<input type="text" name="country" required="required"/><br/>
</td>
</tr>
<tr>
<td>
</td>
<td>
<input type="submit" name="submit" value="submit"/>
</td>
</tr>
</table>
</form>
</body>
</html>