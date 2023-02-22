<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/12/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap%204.0/css/bootstrap.css">
    <title>Create new Product</title>
</head>
<body>
<h1>Create New Product</h1>
<p>
    <a href="${pageContext.request.contextPath}/product">Back to product list</a>
</p>
<form method="post" action="product">
    <input type="hidden" name="action" value="create">
    <fieldset>
        <legend>Information Product</legend>
        <table>
            <tr>
                <td>Product Name:</td>
                <td><label for="name"></label><input class="text-bg-warning" type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Product Price:</td>
                <td><label for="Price"></label><input type="text" name="price" id="Price"></td>
            </tr>
            <tr>
                <td>Product Description:</td>
                <td><label for="describe"></label><input type="text" name="describe" id="describe"></td>
            </tr>
            <tr>
                <td>Product Manufacture:</td>
                <td><label for="producer"></label><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
