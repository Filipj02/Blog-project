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
    <style>
        h1{
            text-align: center;
        }
        body{
            font-family: 'Share Tech', sans-serif;
            font-size:68px;
            color:white;
            /*display: flex;*/
            /*justify-content: center;*/
            /*align-items: center;*/
            margin: 0;
            width: 100vw;
            height: 100vh;
            text-shadow: 8px 8px 10px #0000008c;
            background-color: #343a40;

        }
        div{
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        a{
            text-align: center;
            text-decoration: none;
        }
        a:hover{
            color:white;
        }
        p{
            text-align: center;
        }


    </style>
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
