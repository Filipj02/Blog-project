<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 13.09.2022
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../style.css">
    <title>Remove</title>
</head>
<body>
<h1>Remove</h1>
<form method="post" action="/delete_post">
    <input type="hidden" name="id" value="${post.getId()}">
    <button type="submit" name="delete" value="delete">Usuń</button>


</form>
<button name="" ><a href="/">Anuluj</a></button>
</body>
</html>
