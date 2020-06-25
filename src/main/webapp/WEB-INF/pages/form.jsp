<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/23
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<h3>原信息</h3>
<table class="table-view">
    <tbody>
    <tr>
        <td scope="row">学生id${student.id}</td>
        <td>学生姓名${student.name}</td>
        <td>年级${student.grade}</td>
    </tr>
    </tbody>
</table>
<h3>学生图片</h3>
<c:forEach items="${list}" var="picture">
    <img height="90" width="120" src="${picture.link}" class="card-img-top">

    <p>${picture.content}</p>

    <a href="/delete/${picture.id}">删除</a>
    <br>
</c:forEach>
<form class="form-signin" method="post" action="/list/${student.id}/update">
    <h3 class="h3 mb-3 font-weight-normal">请输入此学生新的信息</h3>
    <label for="id" class="sr-only">id</label>
    <input type="text" id="id" name="id" class="form-control" required="" autofocus="">
    <label for="name" class="sr-only">姓名</label>
    <input type="text" id="name" name="name" class="form-control" required="" autofocus="">
    <label for="grade" class="sr-only">年级</label>
    <input type="text" id="grade" name="grade" class="form-control" required="" autofocus="">
    <button class="btn btn-lg btn-outline-secondary btn-block" type="submit">提交</button>
</form>
</body>
</html>
