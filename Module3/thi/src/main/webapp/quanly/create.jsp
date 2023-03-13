<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/24/2023
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form method="post" action="/TComplex">
    <input type="hidden" name="action" value="create">
    <input type="hidden" placeholder="maMB" name="maMB">
    <p>dTich</p>
    <input type="text" placeholder="dTich" name="dTich">

    <p>Mota</p>
    <input type="text" placeholder="Mota" name="Mota">
    <p>gia</p>
    <input type="text" placeholder="gia" name="gia">
    <p>NgayBD</p>
    <input type="text" placeholder="NgayBD" name="NgayBD">
    <p>NgayKT</p>
    <input type="text" placeholder="NgayKT" name="NgayKT">
    <p>id_thanh_toan</p>
    <select name="soTang">
        <c:forEach items="${choThues}" var="chothue">
            <option value="${chothue.getSoTang()}">${getSoTang()}</option>
        </c:forEach>
        <input type="submit" value="Thêm Mới">
    </select>
</form>
</body>
</html>
