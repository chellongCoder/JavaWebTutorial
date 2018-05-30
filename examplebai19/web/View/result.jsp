<%-- 
    Document   : result
    Created on : May 17, 2018, 10:07:58 PM
    Author     : chellong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getAttribute("message") %></h1>
    </body>
</html>
