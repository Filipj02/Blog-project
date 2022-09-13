<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>Blog</title>
    <link rel="stylesheet" href="../../style.css">

</head>
<body>
<h1>Blog</h1>
<c:if test="${not empty sessionScope.logged}">
    <div>
    <p>Dodaj nowy post</p>
    <form method="post" action="/">
        <input type="text" name="title" placeholder="tytuł">
        <input type="textarea" name="content" placeholder="wpisz treść posta">
        <button type="submit" name="">Zatwierdź</button>


    </form>
    </div>
</c:if>

<br/>
<c:forEach items="${posts}" var="post">
    <a href="/show_post?id=${post.getId()}">${post.getTitle()}</a>
    <c:if test="${not empty sessionScope.logged}">
        <a href="/edit_post?id=${post.getId()}">Edit</a>
        <a id="delete" href="/delete_post?id=${post.getId()}">Delete</a>



    </c:if><br>
</c:forEach>

</body>
</html>