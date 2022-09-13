<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 13.09.2022
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../style.css">
    <title>Edit post</title>
</head>
<body>
<p>edytuj post</p>
<form method="post" action="/edit_post">
    <input type="text" name="title" value="${post.getTitle()}">
    <input type="hidden" name="id" value="${post.getId()}">
    <input type="textarea" name="content" value="${post.getDescription()}">
    <button type="submit" name="">Zatwierdź</button>
</form>
</body>
</html>
