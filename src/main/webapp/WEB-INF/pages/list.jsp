
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理</title>
</head>
<body>

<table class="table">
        <table class="table">
            <thead>
            <th scope="col">用户账户</th>
            <th scope="col">用户名</th>
            <th scope="col">余额</th>
            <th scope="col">删除</th>
            <th scope="col">修改</th>
            </thead>
            <tbody>
                    <c:forEach items="${list}" var="student">
                <tr>
                    <td scope="row">${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.money}</td>
                    <td><a href="/list/${student.id}/delete">删除</a></td>
                    <td><a href="/list/${student.id}/update/form">修改</a></td>
                </tr>
                    </c:forEach>
            </tbody>
        </table>
</body>
</html>
