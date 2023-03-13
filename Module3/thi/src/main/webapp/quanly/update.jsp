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
            <c:if test="${listDanhSach != null}">
                <input  type="hidden" name="maMB" value="<c:out value='${listDanhSach.maMB}' />"/>
            </c:if>
            <tr>
                <th>dTich:</th>
                <td>
                    <input id="username" type="text" name="dTich" size="45"
                           value="<c:out value='${listDanhSach.dTich}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>SoTang:</th>
                <td>
                    <input type="text" name="SoTang" size="45"
                           value="<c:out value='${listDanhSach.SoTang}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Mota:</th>
                <td>
                    <input type="text" name="Mota" size="15"
                           value="<c:out value='${listDanhSach.Mota}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>gia:</th>
                <td>
                    <input type="text" name="gia" size="15"
                           value="<c:out value='${listDanhSach.gia}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>NgayBD:</th>
                <td>
                    <input type="text" name="NgayBD" size="15"
                           value="<c:out value='${listDanhSach.NgayBD}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>NgayKT:</th>
                <td>
                    <input type="text" name="NgayKT" size="15"
                           value="<c:out value='${listDanhSach.NgayKT}' />"
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
