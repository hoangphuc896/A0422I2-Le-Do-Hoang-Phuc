<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/12/2023
  Time: 4:42 PM
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
    Update Product
</h1>
<p>
    <a href="product">Back to product list</a>
</p>
<form method="post" action="product">
    <input type="hidden" name="action" value="edit">
    <input type="hidden" name="id" value="${requestScope["product"].getId()}">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Product Name:</td>
                <td>
                    <input type="text" name="name" id="productsName"
                           value="${requestScope["product"].getNameProduct()}">
                </td>
            </tr>
            <tr>
                <td>Product Price:</td>
                <td><input type="text" name="price" id="productPrice"
                           value="${requestScope["product"].getPriceProduct()}">
                </td>
            </tr>
            <tr>
                <td>Product Description:</td>
                <td><input type="text" name="describe" id="productDescription"
                           value="${requestScope["product"].getDescribeProduct()}">
                </td>
            </tr>
            <tr>
                <td>Product Manufacture:</td>
                <td><input type="text" name="producer" id="productProducer"
                           value="${requestScope["product"].getProducer()}">
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
