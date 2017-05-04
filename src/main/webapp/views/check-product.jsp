<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<c:forEach var="item" items="${list}" varStatus="status">
    <p>Product name: <c:out value="${status.index}"/> = <c:out value="${item.name}"/></p>
    <p>Title:    <c:out value="${item.title}"/></p>
    <p>Quantity: <c:out value="${item.quantity}"/></p>
    <br>
</c:forEach>
</body>
</html>
