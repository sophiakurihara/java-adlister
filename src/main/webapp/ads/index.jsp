<%--
  Created by IntelliJ IDEA.
  User: codeup
  Date: 2020-01-09
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display Ads</title>
</head>
<body>
    <h1>Here are all your ads:</h1>
    <div>
        <c:forEach items="${ads}" var="ad">
            <div class="row">
                <div class="col">Title: ${ad.title}</div>
                <div class="col">Description: ${ad.description}</div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
