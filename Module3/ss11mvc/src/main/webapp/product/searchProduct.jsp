<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/10/2023
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap%204.0/css/bootstrap.css">
    <title>Search Name Product</title>
</head>
<body>
<h1>Edit product:</h1>
<form method="post" action="product">
    <input type="hidden" name="action" value="search">
    <fieldset>
        <legend>Search product by name:</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Search" ></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
