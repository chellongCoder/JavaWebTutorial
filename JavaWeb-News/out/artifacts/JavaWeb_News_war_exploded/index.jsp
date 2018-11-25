<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<head>
  <title>Title</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
</head>

<body>
<nav class="navbar navbar-light bg-light">

  <div class="container">
    <a class="navbar-brand" href="#">Navbar</a>
  </div>

</nav>

<div class="container ">

  <form action="search" method="post">
    <div class="form-group mt-5">
      <label for="search">Search</label>
      <input value="${search!=null ? search : ""}" type="text" class="form-control" id="search" name="search" aria-describedby="emailHelp" placeholder="Search">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
  </form>


  <c:forEach var="item" items="${news}">
    <div class="card mb-3 ">

      <!-- <img class="card-img-top" src=".../100px180/" alt="Card image cap"> -->
      <div class="card-body">
        <p class="card-text float-right"><small class="text-muted">time: ${item.create_at}</small></p>
        <h5 class="card-title">Title : ${item.title}</h5>
        <p class="card-text">Summary : ${item.summary}</p>

        <p class="card-text"><small class="text-muted">${item.author}</small></p>
      </div>
    </div>
  </c:forEach>

  <nav aria-label="Page navigation pt-1">
    <ul class="pagination">
      <li class="page-item">
        <a class="page-link" href="home?page=${currentPage-1}" aria-label="Previous">
          <span aria-hidden="true">&laquo;</span>
          <span class="sr-only">Previous</span>
        </a>
      </li>
      <c:forEach var="index" begin="1" end="${pages}">
        <c:choose>
          <c:when test="${index == currentPage}">
            <li class="page-item disabled"><a class="page-link" href="#">${index}</a></li>
          </c:when>
          <c:otherwise>
            <%--<li class="page-item"${index}</li>--%>
            <li class="page-item"><a class="page-link" href="home?page=${index}">${index}</a></li>
          </c:otherwise>
        </c:choose>
      </c:forEach>
      <li class="page-item">
        <a class="page-link" href="home?page=${currentPage+1}" aria-label="Next">
          <span aria-hidden="true">&raquo;</span>
          <span class="sr-only">Next</span>
        </a>
      </li>
    </ul>
  </nav>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em"
        crossorigin="anonymous"></script>
</body>

</html>
