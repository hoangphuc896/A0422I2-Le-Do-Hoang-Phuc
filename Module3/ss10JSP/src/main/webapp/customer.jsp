<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/6/2023
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/bootstrap%204.0/css/bootstrap.css">
</head>
<body>
<h1>Dách Sách Khách Hàng</h1>
<table class="table">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="Customer">
        <tr>
            <td>${Customer.name}</td>
            <td>${Customer.birthday}</td>
            <td>${Customer.adress}</td>
            <td>
                <img src="/static/img/${Customer.image} " width="50px"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
