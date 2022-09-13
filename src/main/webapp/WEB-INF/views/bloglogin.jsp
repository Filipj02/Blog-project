<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 13.09.2022
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet"  type= "text/css" href="../../style.css">
    <title>Title</title>
</head>

<body>
<br>
<form method="post" action = "/login">
    <input type="text" name="login" placeholder="Imię">
    <br/><br>
    <input type="password" name="password" placeholder="Hasło">
    <br/><br/>
    <input type="submit" value="zaloguj" >
</form>
<p>${sessionScope.message}</p>

</body>
</html>
