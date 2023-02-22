
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/calculator" method="post">
    <h1>Simple Calculator</h1>
    Nhập số đầu tiên :
    <input type="text" name="first-operand" ><br/>
    <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
    </select><br/>
    nhập số thứ 2 :
    <input type="text" name="second-operand"><br/>
    <input type="submit" value="result">
</body>
</html>