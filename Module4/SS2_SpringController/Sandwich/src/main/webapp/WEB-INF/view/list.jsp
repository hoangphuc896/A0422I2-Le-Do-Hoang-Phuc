<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 3/13/2023
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="list" method="post">
    <input type="checkbox" name="spice" value="Lettuce">
    <label>
        Lettuce
    </label>
    <input type="checkbox" name="spice" value="Tomato">
    <label>
        Tomato
    </label>
    <input type="checkbox" name="spice" value="Mustard">
    <label>
        Mustard
    </label>
    <input type="checkbox" name="spice" value="Sprouts">
    <label>
        Sprouts
    </label>
    <input type="submit" value="Save">
    <h3>The spices you choose are : ${result}</h3>
</form>
</body>
</html>
