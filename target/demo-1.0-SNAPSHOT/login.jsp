<%--
  Created by IntelliJ IDEA.
  User: akash.kumar
  Date: 13/10/20
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Login form</h2>
    <%
        if(request.getAttribute("errorMessage")!=null)
            out.println("<div class=\"alert alert-danger\" role=\"alert\">\n" +
                            request.getAttribute("errorMessage")+
                            "</div>"
                    );
    %>
<form action="login" method="post">
    <div class="form-group">
        <label for="userName">Username:</label>
    <input class="form-control" name="userName" placeholder="username" id="userName">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input class="form-control" name="password" type="password" placeholder="password" id="password">
    </div>

    <input type="submit" class="btn btn-default">
</form>
</div>
</body>
</html>
