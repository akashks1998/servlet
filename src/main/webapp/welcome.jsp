<%--
  Created by IntelliJ IDEA.
  User: akash.kumar
  Date: 13/10/20
  Time: 2:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time-Epoch Converter </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Epoch to Time</h2>

    <form action="time" method="post">
        <div class="form-group">
            <label for="sec">Seconds:</label>
            <input class="form-control" type="number" name="sec" id="sec">
        </div>
        <input type="submit" class="btn btn-default">
    </form>
    <%
        if(request.getAttribute("time")!=null)
            out.println("<div class=\"alert alert-info\" role=\"alert\">\n" +
                    request.getAttribute("time")+
                    "</div>"
            );
    %>
</div>

<div class="container">
    <h2>Time to Epoch</h2>
    <form action="epoch" method="post">
        <div class="form-group">
            <label for="time">Seconds:</label>
            <input class="form-control" type="datetime-local" name="time" id="time">
        </div>
        <input type="submit" class="btn btn-default">
    </form>
    <%
        if(request.getAttribute("epoch")!=null)
            out.println("<div class=\"alert alert-info\" role=\"alert\">\n" +
                    request.getAttribute("epoch")+
                    "</div>"
            );
    %>
</div>

</body>
</html>
