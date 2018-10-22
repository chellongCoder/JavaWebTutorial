<%-- 
    Document   : update_student
    Created on : Oct 22, 2018, 11:04:27 PM
    Author     : chellong
--%>

<%@page import="Model.StudentModel"%>
<%@page import="BEAN.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Bootstrap/bootstrap.min.css">
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            System.out.println("id" + id);
            SinhVien sv = StudentModel.getStudent(id);
            request.setAttribute("id", sv.getId());
        %>
        <%@include file="header.jsp" %>
    <div class="container">
        <div id="error" class="alert alert-danger" role="alert">
            A simple danger alert—check it out!
        </div>
        <form onsubmit="validateForm(event)" method="POST" action="update" id="formAddNew" role="form">
            <legend>Add new Student</legend>

            <div class="form-group">
                <label for="">name</label>
                <input type="text" class="form-control" value="<%=sv.getName()%>" name="name" id="name" onkeydown="checkInput('name')" placeholder="nguyen van A">
            </div>

            <div class="form-group">
                <label for="">khoa</label>
                <input type="text" class="form-control" name="khoa" value="<%=sv.getKhoa()%>" id="khoa" onkeydown="checkInput('khoa')" placeholder="at13">
            </div>

            <div class="form-group">
                <label for="">lop</label>
                <input type="text" class="form-control" name="lop" id="lop" value="<%=sv.getLop()%>" onkeydown="checkInput('lop');" placeholder="l01">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
            <input type="hidden" value="<%=sv.getId()%>" name="id">
        </form>

    </div>
    <script>
        document.getElementById("error").style.visibility = "hidden";
        function checkInput(textbox) {
            console.log("ok");
            var textInput = document.getElementById(textbox).value;

            document.getElementById("error").style.visibility = "hidden";
        }
        function validateForm(event) {
            console.log('ok', event);
            event.preventDefault();
            console.log(document.getElementById("name").value);

            // this will prevent the submit event.
            if (document.getElementById("name").value == "") {
                document.getElementById("error").style.visibility = "visible";
                document.getElementById("name").focus();
                return false;
            } else if (document.getElementById("khoa").value == "") {
                document.getElementById("error").style.visibility = "visible";
                document.getElementById("khoa").focus();
                return false;
            } else if (document.getElementById("lop").value == "") {
                document.getElementById("error").style.visibility = "visible";
                document.getElementById("lop").focus();
                return false;
            }
            // return true;
            else {
                document.getElementById("formAddNew").submit(); // fire submit event
            }
        }

       
    </script>
    </body>
</html>
