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
