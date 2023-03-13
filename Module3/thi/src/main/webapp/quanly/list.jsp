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
    <title>Display List</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<button>
    <a href="/TComplex?action=create">ADD NEW USERS</a>
</button>
<br/>
<br/>
<form method="post" action="/TComplex">
    <input type="hidden" name="action" value="search">
    <input type="search" placeholder="Ten khach hang" aria-label="Search" name="soTang">
    <input type="submit" value="Search">
</form>
<br/>

<table class="table" id="tableQuanly">
    <thead>
    <tr>
        <th scope="col">maMB</th>
        <th scope="col">dTich</th>
        <th scope="col">SoTang</th>
        <th scope="col">Mota</th>
        <th scope="col">gia</th>
        <th scope="col">NgayBD</th>
        <th scope="col">NgayKT</th>
        <th scope="col">edit</th>
        <th scope="col">Delete</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listDanhSach}" var="quanly">
    <tr>
        <th>${quanly.maMB}</th>
        <td>${quanly.dTich}</td>
        <td>${quanly.soTang}</td>
        <td>${quanly.Mota}</td>
        <td>${quanly.gia}</td>
        <td>${quanly.NgayBD}</td>
        <td>${quanly.NgayKT}</td>
        <td><a href="/TComplex?action=update&id=${quanly.maMB}&id_thanh_toan=${quanly.SoTang}">Edit</a></td>
        <td>
            <button type="button" class="btn btn-danger" role="button" data-toggle="modal"
                    data-target="#modalDelete${quanly.maMB}">Delete
            </button>
        </td>
        <!-- Modal -->
        <div class="modal fade" id="modalDelete${quanly.maMB}" tabindex="-1" role="dialog"
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
                        <a href="/TComplex?action=delete&id=${quanly.maMB}">
                            <button type="button" class="btn btn-primary">Delete</button>
                        </a>
                    </div>
                </div>
            </div>
        </div>

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
        $('#tableQuanly').dataTable( {
            'searching': false,
            'pageLength': 2
        } )
    } );
</script>
</body>
</html>
