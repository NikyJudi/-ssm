<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/25
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>个人主页</title>
</head>
<body>
<h3>我的信息</h3>
<table class="table-view">
    <tbody>
    <tr>
        <td scope="row">id：${student.id}</td>
        <td>姓名：${student.name}</td>
        <td>年级：${student.grade}</td>
        <td><a href="/resetpw/${student.id}">修改密码</a> </td>
        <td><a href="/resetsig/${student.id}">修改签名</a> </td>
    </tr>
    </tbody>

</table>
<h3>我的图片</h3>
<c:forEach items="${list}" var="picture">
    <img height="90" width="120" src="${picture.link}" class="card-img-top">

    <p>${picture.content}</p>

    <a href="/delete/q/${picture.id}">删除</a>
    <a href="/editor/q/${picture.id}">修改</a>
    <br>
</c:forEach>
</body>
</html>
