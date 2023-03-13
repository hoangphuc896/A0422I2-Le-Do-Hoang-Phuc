<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/27/2023
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form method="post" action="/quanly">
    <input type="hidden" name="action" value="create">
    <input type="hidden" placeholder="id" name="id">
    <p>Name</p>
    <input type="text" placeholder="name" name="name1">
    <p>Gia</p>
    <input type="text" placeholder="Gia" name="gia">
    <p>soLuong</p>
    <select name="soluong">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>
        <option value="13">13</option>
        <option value="14">14</option>
        <option value="15">15</option>
    </select>
    <select name="mau">
        <option value="do">do</option>
        <option value="xanh">xanh</option>
        <option value="den">den</option>
        <option value="vang">vang</option>
        <option value="trang">trang</option>
    </select>
    <select name="thietbi">
        <option value="iphone">iphone</option>
        <option value="tivi">tivi</option>
        <option value="tulanh">tulanh</option>
        <option value="maygiat">maygiat</option>
        <option value="dieuhoa">dieuhoa</option>
    </select>
    <input type="submit" value="Thêm Mới">
</form>
</body>
</html>
