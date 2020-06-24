
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理</title>
</head>
<body>
<form method="post" action="/list/add">
    <h3 class="h3 mb-3 font-weight-normal">请输入新增学生信息</h3>
    <label for="id" class="sr-only">id</label>
    <input type="text" id="id" name="id" class="form-control" required="" autofocus="">
    <label for="name" class="sr-only">姓名</label>
    <input type="text" id="name" name="name" class="form-control" required="" autofocus="">
    <label for="money" class="sr-only">余额</label>
    <input type="text" id="money" name="money" class="form-control" required="" autofocus="">
    <button class="btn btn-lg btn-outline-secondary btn-block" type="submit">提交</button>
</form>
<h3 class="h3 mb-3 font-weight-normal">学生列表信息</h3>
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
