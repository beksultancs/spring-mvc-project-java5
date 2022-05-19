<%--
  Created by IntelliJ IDEA.
  User: beksultanmamatkadyruulu
  Date: 19/5/22
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>students</title>
</head>
<body>
<h1>All students</h1>
<div>
    <table>
        <thead>
        <tr>
            <th>name</th>
            <th>email</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
