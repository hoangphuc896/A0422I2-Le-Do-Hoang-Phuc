<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/12/2023
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="product" scope="request" type="java.util.List"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="product?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacture</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${product}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getNameProduct()}</td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescribeProduct()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="${pageContext.request.contextPath}/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
    <tr><a href="${pageContext.request.contextPath}/product?action=search">Search Product by Name</a></tr>
</table>
</body>
</html>