<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/16/2023
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form method="post" action="/users">
        <input type="hidden" name="action" value="create">
        <input type="hidden" placeholder="id" name="id">
        <p>Name</p>
        <input type="text" placeholder="name" name="name">
        <p>Email</p>
        <input type="email" placeholder="email" name="email">
        <p>Country</p>
        <input type="text" placeholder="country" name="country">
        <input type="submit" value="Thêm Mới">
    </form>
</body>
</html>
