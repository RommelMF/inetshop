<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/web-resources/"/>/css/bootstrap.min.css" rel = "stylesheet"/>
    <title>Edit Product</title>
</head>
<body>
<h2>Edit Product</h2>

<form:form class="form-inline" method="POST" commandName="stone" action="/inetshop/admin/save-product">
    <div class="form-group">
        <form:label for="exampleInputName" path="name">Name Product</form:label>
        <form:input type="text" class="form-control" id="exampleInputName" placeholder="" path="name"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputTitle" path="title">Product description</form:label>
        <form:input type="text" class="form-control" id="exampleInputTitle" placeholder="" path="title"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputQuantity" path="quantity">The quantity of goods</form:label>
        <form:input type="long" class="form-control" id="exampleInputQuantity" placeholder="" path="quantity"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputCost" path="cost">The cost of stoneSort</form:label>
        <form:input type="double" class="form-control" id="exampleInputCost" placeholder="" path="cost"/>
    </div>
    <div class="form-group">
        <c:forEach items="${stone.mapCharacters}" var="item">
            <label>${item.key}</label>
            <input type="text" name="mapCharacters['${item.key}']" value="${item.value}"/>
            <br>
        </c:forEach>
    </div>

    <button type="submit" class="btn btn-default" value="stone">Save</button>
</form:form>

</body>
</html>

