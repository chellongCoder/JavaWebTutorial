<%-- 
    Document   : index
    Created on : Oct 29, 2018, 8:07:24 PM
    Author     : chellong
--%>

<%@page import="java.util.List"%>
<%@page import="BEAN.Book"%>
<%@page import="Model.BookModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <title>Title</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%
            String error = request.getAttribute("error")+"";
            System.out.println("error" + error);
        %>
        <div class="container">
            <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">title</th>
                    <th scope="col">Author</th>
                    <th scope="col">Price</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Function</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Book> listBook = BookModel.getAllBook();
                    for (Book elem : listBook) {
                %>
                <tr>
                    <th scope="row"><%=elem.getId()%></th>
                    <td ><%=elem.getTitle()%></td>
                    <td><%=elem.getAuthor()%></td>
                    <td><%=elem.getPrice()%></td>
                    <td><%=elem.getQuantity()%></td>
                    <td>
                        <a href="updateBook.jsp?id=<%=elem.getId()%>" class="btn btn-warning">Sua</a>
                        <a href="deleteBook?id=<%=elem.getId()%>" class="btn btn-danger">Xoa</a>

                    </td>
                </tr>
                <%     
                    }
                %>
            </tbody>
        </table>
            <a href="addNewBook.jsp" class="btn btn-primary">Them moi</a>
        </div>



        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
</html>