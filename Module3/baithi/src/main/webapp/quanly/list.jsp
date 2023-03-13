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
    <title>Display List</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<button>
    <a href="/quanly?action=create">ADD NEW USERS</a>
</button>

<button>
    <form method="get" action="/quanly">
        <input type="hidden" name="action" value="search">
        <input type="search" placeholder="name" aria-label="Search" name="name1">
        <input type="submit" value="Search">
    </form>

</button>
<br/>

<table class="table" id="tableUser">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name1</th>
        <th scope="col">Gia</th>
        <th scope="col">Soluong</th>
        <th scope="col">mau</th>
        <th scope="col">thietbi</th>
        <th scope="col">edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listUsers}" var="user">
    <tr>
        <th>${user.id}</th>
        <td>${user.name1}</td>
        <td>${user.gia}</td>
        <td>${user.soluong}</td>
        <td>${user.mau}</td>
        <td>${user.thietbi}</td>
        <td><a href="/quanly?action=update&id=${user.id}">Edit</a></td>
        <td>
            <button type="button" class="btn btn-danger" role="button" data-toggle="modal"
                    data-target="#modalDelete${user.id}">Delete
            </button>
        </td>
        <!-- Modal -->
        <div class="modal fade" id="modalDelete${user.id}" tabindex="-1" role="dialog"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Bạn Có Muốn Xóa Không
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <a href="/quanly?action=delete&id=${user.id}">
                            <button type="button" class="btn btn-primary">Delete</button>
                        </a>
                    </div>
                </div>
            </div>
        </div>
            <%--        <td><a href="/users?action=delete&id=${user.id}" class="btn btn-danger" role="button" data-toggle="modal" data-target="#modalDelete" >Delete</a></td>--%>
    </tr>
    </tbody>
    </c:forEach>

</table>

<script src="/static/js/jquery-3.5.1.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.js"></script>
<script src="/static/js/bootstrap.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.js"></script>
<script>
    $(document).ready(function() {
        $('#tableUser').dataTable( {
            'searching': false,
            'pageLength': 2
        } )
    } );
</script>
</body>
</html>