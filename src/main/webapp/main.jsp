<%--
  Created by IntelliJ IDEA.
  User: IT Class
  Date: 22.04.2021
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <p>Value str: ${message}</p>
    <p>User: ${us}</p>
    <p>id: ${us.id}</p>
    <p>Name: ${us.name}</p>
    <p>user doSmth: ${us.doSmth()}</p>
    <a href="/webapp1/main">Get value</a>
</body>
</html>
