<%-- 
    Document   : home
    Created on : Nov 12, 2018, 11:45:53 PM
    Author     : chellong
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <td>id</td>
                <td>name</td>
                <td>class</td>
                <td>dob</td>
            </thead>
            <c:forEach var="item" items="${listStudent}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.lop}</td>
                    <td>${item.dob}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="student/add.htm">Add new</a>
    </body>
</html>
