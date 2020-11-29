<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<p>${student.name}</p>
<p>${student.address}</p>
<p>${student.gender}</p>
<c:forEach items="${student.hobbies}" var="hobby">
<p>${hobby }</p>
</c:forEach>
</body>
</html>