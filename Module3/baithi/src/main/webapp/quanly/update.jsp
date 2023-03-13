<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/27/2023
  Time: 7:44 PM
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
                <input  type="hidden" name="id" value="<c:out value='${user.id}' />"/>
            </c:if>
            <tr>
                <th>Name:</th>
                <td>
                    <input id="username" type="text" name="name1" size="45"
                           value="<c:out value='${user.name1}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Gia:</th>
                <td>
                    <input type="text" name="gia" size="15"
                           value="<c:out value='${user.gia}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>soluong:</th>
                <td>
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
                </td>
            </tr>
            <tr>
                <th>mau:</th>
                <td>
                    <select name="mau">
                        <option value="do">do</option>
                        <option value="xanh">xanh</option>
                        <option value="den">den</option>
                        <option value="vang">vang</option>
                        <option value="trang">trang</option>
                    </select>
                </td>
            </tr>

            <tr>
                <th>mau:</th>
                <td>
                    <select name="thietbi">
                        <option value="iphone">iphone</option>
                        <option value="tivi">tivi</option>
                        <option value="tulanh">tulanh</option>
                        <option value="maygiat">maygiat</option>
                        <option value="dieuhoa">dieuhoa</option>
                    </select>
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
    this.id = id;
    this.name1 = name1;
    this.gia = gia;
    this.soluong = soluong;
    this.mau = mau;
    this.thietbi = thietbi;

</script>
</body>
</html>