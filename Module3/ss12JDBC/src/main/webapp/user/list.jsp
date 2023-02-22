<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/16/2023
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display List</title>
    <link rel="stylesheet" href="/static/bootstrap-4.0/css/bootstrap.css">
</head>
<body>
<button>
    <a href="/users?action=create">ADD NEW USERS</a>
</button><br/>
<button>
    <a href="/users?action=sort">SORT BY NAME</a>
</button><br/>
<button>
    <a href="/users?action=search">SEARCH BY COUNTRY</a>
</button><br/>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Country</th>
        <th scope="col">edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listUsers}" var="user">
    <tr>
        <th>${user.id}</th>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.country}</td>
        <td><a href="/users?action=update&id=${user.id}">Edit</a></td>
        <td><a href="/users?action=delete&id=${user.id}">Delete</a></td>
    </tr>
    </tbody>
    </c:forEach>
</table>
</body>
</html>
