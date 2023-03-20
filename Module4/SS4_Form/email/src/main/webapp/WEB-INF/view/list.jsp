
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Email</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>Email List</h1>
<c:if test="${success}">
    <h3>${success}</h3>
</c:if>
<div class="details">
    <div class="cusdetails">
        <label>Langues:</label>
        <label>${emails.languages}</label>
    </div>
    <div class="cusdetails">
        <label>PageSize</label>
        <label>${emails.pageSize}</label>
    </div>
    <div class="cusdetails">
        <label>Spams filter:</label>
        <label>${emails.spams}</label>
    </div>
    <div class="cusdetails">
        <label>Singnature:</label>
        <label>${emails.singnature}</label>
    </div>
</div>
<p><a href="/email/update">
    edit
</a>
</p>
</body>
</html>
