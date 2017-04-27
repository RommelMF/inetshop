<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/web-resources/"/>/css/bootstrap.min.css" rel = "stylesheet"/>
    <title>Admin</title>
</head>
<body>
<form:form class="form-inline" method="POST" commandName="stone" action="check-product">
    <div class="form-group">
        <form:label for="exampleInputName" path="name">Name Product</form:label>
        <form:input type="text" class="form-control" id="exampleInputName" placeholder="Botinki" path="name"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputTitle" path="title">Product description</form:label>
        <form:input type="text" class="form-control" id="exampleInputTitle" placeholder="product description" path="title"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputQuantity" path="quantity">The quantity of goods</form:label>
        <form:input type="long" class="form-control" id="exampleInputQuantity" placeholder="the quantity of goods" path="quantity"/>
    </div>
    <div class="form-group">
        <form:label for="exampleInputCost" path="cost">The cost of product</form:label>
        <form:input type="double" class="form-control" id="exampleInputCost" placeholder="The cost of product" path="cost"/>
    </div>
   <div class="form-group">
       <c:forEach items="${stone.mapCharacters}" var="item">
           <label>${item.key}</label>
           <input type="text" name="nameMap['${item.key}']" value="${item.value}">
           <br>
       </c:forEach>
   </div>
    <button type="submit" class="btn btn-default" value="stone">Send</button>
</form:form>

</body>
</html>
