<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<form action="selectyy?username=${username}&courseId=${courses.courseId}&courseName=${courses.courseName}">
Enter the username:
<input type="text" name="username"/><br/><br/>
CourseId:
<input type="text" name="courseId" value="${courses.courseId}" readonly="readonly"/>
CourseName:
<input type="text" name="courseName" value="${courses.courseName}" readonly="readonly"/>
<input type="submit" value="login"/>
</form>


</html>