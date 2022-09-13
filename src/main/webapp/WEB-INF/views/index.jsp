<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<c:if test="${not empty sessionScope.logged}">
    <form>
        <input type="text" name="title">
        <input type="textarea" name="textarea">
    </form>

</c:if>

<br/>
<c:forEach items="${posts}" var="post">
    <p>${post}</p>
    <c:if test="${not empty sessionScope.logged}">
        <p>${post.getId()}</p>
        <a href="/edit_post?id=${post.getId()}">Edit</a>
        <a href="/delete_post?id=${post.getId()}">Delete</a>
    </c:if>
</c:forEach>
</body>
</html>