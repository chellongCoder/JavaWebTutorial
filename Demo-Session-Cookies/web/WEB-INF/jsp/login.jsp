<%-- 
    Document   : login
    Created on : Nov 24, 2018, 11:25:05 PM
    Author     : chellong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">

<head>
    <title>Login</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <style>
        .header-login {
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>

<body>
    <div class="container">

        <div class="row mt-5">

            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 col-xs-pull-2 col-sm-push-6 col-md-push-6 col-lg-push-2 m-auto">
                <div class="card">
                    <div class="card-header header-login">
                        <div>Login</div>
                    </div>
                    <div class="card-body">

                        <form:form action="auth.view" method="POST" role="form" modelAttribute="user">
                            <div class="form-group">
                                <label for="username">UserName</label>
                                <form:input path="username" type="text" class="form-control" id="username" placeholder="Input field"/>
                            </div>

                            <div class="form-group">
                                <label for="password">password</label>
                                <form:input path="password" type="password" class="form-control" id="password" placeholder=""/>
                            </div>

                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form:form>

                    </div>
                    <div class="card-footer text-muted">
                        Footer
                    </div>
                </div>
            </div>

        </div>

    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>

</html>