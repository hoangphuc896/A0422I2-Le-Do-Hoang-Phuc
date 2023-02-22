<jsp:useBean id="product" scope="request" type="java.util.List"/>
<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/12/2023
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Product details</title>
</head>
<body>
<h1>Product details</h1>
<fieldset>
    <legend>Product information:</legend>
    <table>
        <tr>
            <td>ID: </td>
            <td>${requestScope["product"].getId()}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${requestScope["product"].getNameProduct()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${requestScope["product"].getPriceProduct()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${requestScope["product"].getDescribeProduct()}</td>
        </tr>
        <tr>
            <td>Producer: </td>
            <td>${requestScope["product"].getProducer()}</td>
        </tr>
        <td></td>
        <td><a href="${pageContext.request.contextPath}/product">Back to List</a> </td>
    </table>
</fieldset>
</body>
</html>