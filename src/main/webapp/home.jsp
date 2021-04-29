
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
    <h2>List items</h2>

    <table>
        <tr>
            <th>Name</th>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item}</td>
            </tr>
        </c:forEach>
    </table>

    <h2>Users list</h2>
    <table>
        <tr>
            <th>id</th>
            <th>login</th>
            <th>name</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.login}</td>
                <td>${user.name}</td>
            </tr>
        </c:forEach>
    </table>

    <!-- ><=, or, and, not, empty-->
    <c:if test="${not empty user or not empty list}">
        <h3>not empty user or not empty list</h3>
    </c:if>

    <c:choose>
        <c:when test="${2 < 3}">
            <h3>c:when</h3>
        </c:when>
        <c:otherwise>
            <h3>c:otherwise</h3>
        </c:otherwise>
    </c:choose>

    <c:url var="mail" value="http://mail.ru"/>
    <c:url var="page" value="page.html">
        <c:param name="testParam" value="TEST"/>
    </c:url>

    <a href="${mail}">mail.ru</a>
    <a href="${page}">page</a>
    <a href="<c:url value="/myCont"/>">my cont</a>

    <c:set var="pageName" value="home.jsp" scope="request"/>
    <h2>${pageName}</h2>
    <c:remove var="pageName" scope="request"/>
    <h2>${pageName}remove</h2>

    <c:catch var="exp">
        <p>2 + 3 = ${2 / 0}</p>
    </c:catch>

    <c:if test="${not empty exp}">
        <h3>${exp.message}</h3>
    </c:if>

    <c:redirect url="http://mail.ru">
        <c:param name="test" value="IT Class"/>
    </c:redirect>

<%--    <c:import url="header.jsp"/>--%>
</body>
</html>
