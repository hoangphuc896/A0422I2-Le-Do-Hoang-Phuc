<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 3/13/2023
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Computer</title>
</head>
<body>
<h1>simple calculator</h1>
<form action="list" method="post">
    <input type="text" name="numberone">
    <input type="text" name="numbertwo">
    </br>
    <button type="submit" name="enter" value="+">Addition(+)</button>
    <button type="submit" name="enter" value="-">Subtraction(-)</button>
    <button type="submit" name="enter" value="X">Multiplication(X)</button>
    <button type="submit" name="enter" value="/">Division(/)</button>
</form>
<h3>Result :${result}</h3>
</body>
</html>
