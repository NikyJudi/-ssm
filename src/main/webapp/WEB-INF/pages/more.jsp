<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/25
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>


<head>
    <title>详细信息</title>
</head>

<body>
<div class="container">
    <div class="d-flex justify-content-end align-items-center">
        <a class="btn btn-block btn-lg btn-outline-secondary" href="/login">首页</a>
    </div>
    <div>
    <a>
        <img height="300" width="400" src="${picture.link}">
    </a>
</div>
    <p class="text-center center">${picture.content}</p>

</div>
</body>
</html>
