<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
<h1>mobile login form</h1>
<form method="get" action="logincheck">
<div>
<span>mobile no </span>
<input name="mobileno" type="text" />
</div>
<div>
<span>password </span>
<input name="password" type="password" />
</div>
<input type="submit" value="Submit"/>
</form>
</body>
</html>