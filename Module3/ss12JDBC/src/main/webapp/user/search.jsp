<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/17/2023
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seach By Country</title>
</head>
<body>
<h1>Search By Country</h1>
<form method="post" action="/users" >
    <input type="hidden" name="action" value="search">
    <fieldset>
    <legend>Search User by Country</legend>
        <table>
        <tr>
            <td>Country:</td>
            <td><input type="text" name="country" id="country"></td>
        </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Search"></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
