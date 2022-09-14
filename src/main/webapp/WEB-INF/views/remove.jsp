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
