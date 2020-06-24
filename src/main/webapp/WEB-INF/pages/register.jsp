<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/24
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<form class="form-signin" method="post" action="/register">
    <h1 class="h3 mb-3 font-weight-normal">请输入您的信息</h1>
    <label for="id" class="sr-only">id</label>
    <input type="text" id="id" name="id" class="form-control" required="" autofocus="">
    <label for="password" class="sr-only">密码</label>
    <input type="password" id="password" name="password" class="form-control" required="" autofocus="">
    <button class="btn btn-lg btn-outline-secondary btn-block" type="submit" onclick="" >提交</button>
</form>
</body>
</html>
