<%--
  Created by IntelliJ IDEA.
  User: codeup
  Date: 2020-01-08
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    }
%>
<html>
<head>
    <title>Login Page</title>
    <form action="/login.jsp" method="post">
        <label for="username">Username</label>
        <input type="text" name="username" id="username">

        <label for="password">Password</label>
        <input type="text" name="password" id="password">

        <button type="submit">Login</button>
    </form>
</head>
<body>

</body>
</html>