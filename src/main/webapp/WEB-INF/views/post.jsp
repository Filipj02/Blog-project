<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 13.09.2022
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>${post.getTitle()}</title>
</head>
<body>
<h1>${post.getTitle()}</h1>
<p>${post.getDescription()}</p>

<form method="post" action="/create_comment?id_post=${post.getId()}">
    <input name="username" placeholder="nazwa użytkownika">
    <textarea name = "description" placeholder="dodaj komentarz"></textarea>
    ${sessionScope.captcha}
    <input name="captcha">
    <input type="submit" value="dodaj komentarz">
</form>
<c:forEach items="${comms}" var="comm">
    <p>  ${comm} </p>
    <br>

</c:forEach>
</body>
</html>
