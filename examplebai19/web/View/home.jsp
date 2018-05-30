<%-- 
    Document   : home
    Created on : May 17, 2018, 8:56:25 PM
    Author     : chellong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload singleFile</title>
    </head>
    <body>
        <form method="POST" enctype="multipart/form-data" action="HomeController">
        File to upload: <input type="file" name="file"><br/>
        Notes about the file: <input type="text" name="note"><br/>
        <br/>
        <input type="submit" value="Upload single file"> to upload the file!
      </form>
    </body>
</html>
