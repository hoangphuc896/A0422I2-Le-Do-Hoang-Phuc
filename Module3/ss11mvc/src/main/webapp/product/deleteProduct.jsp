
<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/12/2023
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/bootstrap%204.0/css/bootstrap.css">
</head>
<body>
<h1>
    Delete Product
</h1>

<form method="post" action="product">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" value="${requestScope["product"].getId()}">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Product Name:</td>
                <td>
                    ${requestScope["product"].getNameProduct()}
                </td>
            </tr>
            <tr>
            <td>Product Price:</td>
            <td> ${requestScope["product"].getPriceProduct()}</td>
            </tr>
            <tr>
                <td>Product Description:</td>
                <td> ${requestScope["product"].getDescribeProduct()}</td>
            </tr>
            <tr>
                <td>Product Producer:</td>
                <td> ${requestScope["product"].getProducer()}</td>
            </tr>
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/product">Cancel</a>
                </td>
                <td><input type="submit" value="Delete product"></td>

            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
