<%@page import="Model.StudentModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BEAN.SinhVien"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <head>
        <title>Home</title>
        <!-- Latest compiled and minified CSS -->

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Bootstrap/bootstrap.min.css" >

    </head>
    <body>
<!--        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
                </div>
            </div>
        </nav>-->
         <%@include file="header.jsp" %>
           
        <div class="container">
            <table class="table table-light table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">Họ tên</th>
                    <th scope="col">Khoá</th>
                    <th scope="col">Lớp</th>
                    <th scope="col">Chức năng</th>
                </tr>       
            </thead>
            <tbody>
               <%
                    List<SinhVien> list = StudentModel.getAll();
                    for (int i = 0; i < list.size(); i++) {                                 
                %>
                <tr>
                    <td scope="row"><%=list.get(i).getId()%></td>
                    <td scope="row"><%=list.get(i).getName()%></td>
                    <td scope="row"><%=list.get(i).getKhoa()%></td>
                    <td scope="row"><%=list.get(i).getLop()%></td>
                    <td scope="row">
                        <button onclick="window.location.href='update_student.jsp?id=<%=list.get(i).getId()%>'" class="btn btn-warning">Sửa</button>
                        <button class="btn btn-danger">Xoá</button>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
            
        </table>
        <a class="btn btn-primary" href="addNew.jsp">Thêm mới</a>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
