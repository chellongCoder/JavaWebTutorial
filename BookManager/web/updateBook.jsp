<%-- 
    Document   : addNew
    Created on : Oct 21, 2018, 10:26:34 PM
    Author     : chellong
--%>

<%@page import="Model.BookModel"%>
<%@page import="BEAN.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
</head>


<body>

    <%@include file="header.jsp" %>
    
    <%
        String id = request.getParameter("id");
        Book book = BookModel.getBook(id);
        
    %>
    <div class="container">
        <div id="error" class="alert alert-danger" role="alert">
            A simple danger alert—check it out!
        </div>
        <form onsubmit="validateForm(event)" method="POST" action="updateBook" id="formUpdate" role="form">
            <legend>Add new Student</legend>
            
            <input  name="id" id="id" type="hidden" value="<%=book.getId()%>" placeholder="1">
            <div class="form-group">
                <label for="">Title</label>
                <input type="text" class="form-control" name="title" id="title" value="<%=book.getTitle()%>" onkeydown="checkInput('title')"
                    placeholder="book1" />
            </div>

            <div class="form-group">
                <label for="">Author</label>
                <input type="text" class="form-control" name="author" id="author" value="<%=book.getAuthor()%>" onkeydown="checkInput('author')"
                    placeholder="author 1">
            </div>

            <div class="form-group">
                <label for="">Price</label>
                <input type="text" class="form-control" name="price" id="price" value="<%=book.getPrice()%>" onkeydown="checkInput('price');"
                    placeholder="1.1">
            </div>
            <div class="form-group">
                <label for="">Quantity</label>
                <input type="text" class="form-control" name="quantity" id="quantity" value="<%=book.getQuantity()%>" onkeydown="checkInput('quantity');"
                    placeholder="1">
            </div>

            <button type="submit" class="btn btn-primary btn-block">Submit</button>
        </form>

    </div>
    <script>
        const error = document.getElementById("error");
        error.style.visibility = "hidden";

        function checkInput(textbox) {
            console.log("ok");
            var textInput = document.getElementById(textbox).value;

            error.style.visibility = "hidden";
        }

        function isInt(n) {
            return Number(n) == n && n % 1 == 0;
        }

        function isFloat(n) {
            return Number(n) == n && n % 1 != 0;
        }

        function isString(str) {
            return /^[a-zA-Z]/.test(str);
        }

        function validateForm(event) {
            const title = document.getElementById('title').value;
            const author = document.getElementById("author").value;
            const price = document.getElementById("price").value;
            const quantity = document.getElementById('quantity').value;

            console.log('ok', event);
            event.preventDefault();
            console.log(title, author, price, quantity);
            if (!isString(title) || !isString(author)) {
                document.getElementById("error").innerText = "required string";
                error.style.visibility = "visible";
                return;
            }
            if (!isFloat(price)) {
                document.getElementById("error").innerText = "required double";
                error.style.visibility = "visible";
                return;
            }
            if (!isInt(quantity)) {
                document.getElementById("error").innerText = "required integer";
                error.style.visibility = "visible";
                return;
            } else {
                document.getElementById("formUpdate").submit(); // fire submit event
            }
        }
    </script>
</body>

</html>