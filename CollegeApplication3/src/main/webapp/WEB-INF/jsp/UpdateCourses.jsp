<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Information</h1>
<form action="updcourses" method="get">
CourseId:
<input type="text" name="courseId" value="${course.courseId}"/><br/>
CourseName:
<input type="text" name="courseName" value="${course.courseName}"/><br/>
Start Date(yyyy/MM/dd):
<input type="date" name="startDate" value="${course.startDate}"/><br/>
End Date(yyyy/MM/dd):
<input type="date" name="endDate" value="${course.endDate}"/><br/>
<input type="submit" value="Submit">
</form>
</body>
</html>