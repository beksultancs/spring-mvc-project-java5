<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: beksultanmamatkadyruulu
  Date: 19/5/22
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>saving student</title>
</head>
<body>
<%--@elvariable id="newStudent" type="springmvcproject.Student"--%>
<form:form action="/student/save" method="post" modelAttribute="newStudent">
    <form:input type="text" path="name"/>
    <form:input type="text" path="email"/>
    <button type="submit">save</button>
</form:form>
</body>
</html>
