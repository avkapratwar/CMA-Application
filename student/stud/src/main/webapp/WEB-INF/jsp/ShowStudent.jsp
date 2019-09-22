
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<table>
<tr>
<th>Student Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Date of birth</th>
<th>Gender</th>
<th>Email</th>
<th>MobileNumber</th>
<th>Parents Mobile Number</th>
<th>Address</th>
<th>City</th>
<th>State</th>
<th>Department</th>
<th>Update</th>

</tr>
<c:forEach var="st" items="${stu}">
<tr>
<td>${st.studentid}</td>
<td>${st.firstname}</td>
<td>${st.lastname}</td>
<td>${st.dateofbirth}</td>
<td>${st.gender}</td>
<td>${st.email}</td>
<td>${st.mobileNo}</td>
<td>${st.parentsMobileNo}</td>
<td>${st.address}</td>
<td>${st.city}</td>
<td>${st.state}</td>
<td>${st.department}</td>


<td><a tabindex="-1" href="Studentupdate/${st.studentid}"><button style="background-color:white;">Update Information</button></a></td>

</tr>
</c:forEach>
</table>