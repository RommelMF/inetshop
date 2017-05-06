<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<div>
    <c:if test="${test != null}">
        <p>${test}</p>
        <a href="/inetshop/admin/add-product">To add another product</a>
        <a href="/inetshop/admin">Return to main page</a>
    </c:if>
</div>
<div>
    <c:if test="${test == null}">
        <p>Something went wrong :(</p>
        <a href="/inetshop/admin">Return to main page</a>
    </c:if>
</div>

</body>
</html>
