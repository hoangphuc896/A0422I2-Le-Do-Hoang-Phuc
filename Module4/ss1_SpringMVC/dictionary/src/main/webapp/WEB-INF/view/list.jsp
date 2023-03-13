<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 3/13/2023
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="list" method="post">
    <input type="text" name="vn">
    <input type="submit" value="dịch">
    <h1>Result:${result.result}</h1>
</form>
</body>
</html>
