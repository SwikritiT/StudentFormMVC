<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/css/select2.min.css" rel="stylesheet" />
<script src="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/js/select2.min.js"></script>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style >
.error{
color:red;
}
</style>
</head>
<body>
<form:form id="student-form" action= "store" modelAttribute="student" method="POST">
<label for="name">Name</label>
<form:input placeholder="enter student name" path="name" id="name"/>
<form:errors path="name" cssClass="error"/><br><br>
<label for="address">Address</label>
<form:input placeholder="enter student address" path="address" id="address"/><br><br>
<label for="email">Email</label>
<form:input placeholder="enter email" path="email" id="email"/>
<form:errors path="name" cssClass="error"/>
<br><br>
<label for="country">Country</label>
<form:select path="country">
  <form:options items="${ student.countryOptions}"/>
 
</form:select>
<br><br>
<label for="gender">Gender</label>
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female
<form:radiobutton path="gender" value="other" />Other<br><br>
<label for="hobbies">Hobbies</label>
<form:checkbox path="hobbies" value="Singing" />Singing
<form:checkbox path="hobbies" value="Reading" />Reading
<form:checkbox path="hobbies" value="Dancing" />Dancing
<br><br>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>