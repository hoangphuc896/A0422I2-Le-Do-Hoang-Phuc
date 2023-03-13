<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/16/2023
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<div align="center">
    <div id="messageerror" style="color: red"></div>
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit User
                </h2>
            </caption>
            <c:if test="${user != null}">
                <input  type="hidden" name="id" value="<c:out value='${users.id}' />"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input id="username" type="text" name="name" size="45"
                           value="<c:out value='${user.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${user.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${user.country}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit"  name="abc" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
<script>

</script>
</body>
</html>
