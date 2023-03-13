<%--
  Created by IntelliJ IDEA.
  User: LAPTOP
  Date: 2/23/2023
  Time: 7:36 PM
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
        <input  type="hidden" name="id" value="<c:out value='${listDanhSach.id}' />"/>
      </c:if>
      <tr>
        <th>nameIphones:</th>
        <td>
          <input id="username" type="text" name="nameIphones" size="45"
                 value="<c:out value='${listDanhSach.nameIphones}' />"
          />
        </td>
      </tr>
      <tr>
        <th>phonenumber:</th>
        <td>
          <input type="text" name="phone_number" size="45"
                 value="<c:out value='${listDanhSach.phone_number}' />"
          />
        </td>
      </tr>
      <tr>
        <th>note:</th>
        <td>
          <input type="text" name="note" size="15"
                 value="<c:out value='${listDanhSach.note}' />"
          />
        </td>
      </tr>
      <tr>
        <th>id_thanh_toan:</th>
        <td>
          <input type="text" name="id_thanh_toan" size="15"
                 value="<c:out value='${listDanhSach.id_thanh_toan}' />"
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
