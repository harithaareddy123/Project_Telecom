<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>The details of customer are</h2>
<h3>
Your mobileno is  <c:out value="${user.mobileno}"/><br>
Your password is <c:out value="${user.password}"/><br>
Your balance is<c:out value="${user.balance }"/>
</h3>
</body>
</html>