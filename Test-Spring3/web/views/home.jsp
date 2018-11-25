<%--
  Created by IntelliJ IDEA.
  User: chellong
  Date: 11/18/18
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/dist/css/AdminLTE.min.css"/>
</head>
<body>

<%@ include file="navbar.jsp"%>
<div class="container">
    <div class="row">
        <table class="table table-bordered">
        	<thead class="thead-dark">
        		<tr>
        			<th>id</th>
                    <th>name</th>
                    <th>dob</th>
                    <th>salary</th>
                    <th>function</th>
        		</tr>
        	</thead>
        	<tbody>
                <c:forEach var="item" items="${listCustomer}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.dob}</td>
                        <td>${item.salary}</td>
                        <td>
                            <a name="update" id="update" class="btn btn-warning mb-1" href="update?id=${item.id}"
                               role="button">Update</a>
                            <a name="delete" id="delete" class="btn btn-danger mb-1" href="update?id=${item.id}"
                               role="button">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
        	</tbody>
        </table>
        <a name="" id="" class="btn btn-primary" href="addNew" role="button">Add
            New</a>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
        integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>