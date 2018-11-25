<%-- 
    Document   : add
    Created on : Nov 13, 2018, 1:40:51 AM
    Author     : chellong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form:form method="POST" action="insert.htm" modelAttribute="StudentForm"> 
            name <form:input path="name" type="text"/> <br/> 
            class <form:input path="lop" type="text"/> <br/>
            <%--<fmt:formatDate value="${yourObject.date}" var="dateString" pattern="yyyy-MM-dd" />--%>
            dob <form:input path="dob" type="text" />
            <form:button>ADD</form:button>
        </form:form>
    </body>
</html>
