<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update List</title>
</head>
<body>
<h1>Update Email</h1>
<%--@elvariable id="${email}" type="java"--%>
<form:form method="post" action="/email/edit" modelAttribute="${email}">
    <table>

        <tr>
            <td>langueges</td>
            <td><form:select path="languages" value="${langueEnglish}"/></td>
        </tr>
        <tr>
            <td>pageSize</td>
            <td><form:select path="pageSize" value="${pagesize}"/></td>
        </tr>
        <tr>
            <td>spamsFilter</td>
            <td><form:input path="spams" value="${spams}"/></td>
        </tr>
        <tr>
            <td>signature</td>
            <td><form:textarea path="singnature" value="${Singnature}"/></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form:form>
</body>
</html>