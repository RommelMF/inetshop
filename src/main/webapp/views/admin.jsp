<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<h1>Welcome, Admin</h1>
<div>
    <c:if test="${list.size() == 0}" >
        <p>While in the store, no items :(</p>
    </c:if>
</div>
<div>
    <a href="/inetshop/admin/add-product">Add product</a>
</div>
<div>
    <c:forEach var="item" items="${list}" varStatus="status">
        <p>Product name: <c:out value="${status.index}"/> = <c:out value="${item.name}"/></p>
        <p>Title:    <c:out value="${item.title}"/></p>
        <a href="/inetshop/admin/${item.id}/delete">delete</a>
        <a href="/inetshop/admin/${item.id}/edit">edit</a>
        <br>
        <br>
    </c:forEach>
</div>

</body>
</html>
