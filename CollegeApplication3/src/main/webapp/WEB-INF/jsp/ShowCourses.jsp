<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<table>
<tr>
<th>CourseId</th>
<th>CourseName</th>
<th>Start Date</th>
<th>End Date</th>
<th>UpdateCourse</th>
<th>DeleteCourse</th>

</tr>
<c:forEach var="course" items="${list}">
<tr>
<td>${course.courseId}</td>
<td>${course.courseName}</td>
<td>${course.startDate}</td>
<td>${course.endDate}</td>

<td><a href="CourseUpdate?courseId=${course.courseId}">Update</a></td>
<td><a href="CourseDelete?courseId=${course.courseId}">Delete</a></td></tr>
</c:forEach>
</table>