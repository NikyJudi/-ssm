<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎您！</title>
</head>

<body class="text-center">
<form class="form-signin" method="post" action="/login">
    <h1 class="h3 mb-3 font-weight-normal">请登录</h1>
    <label for="id" class="sr-only">用户名</label>
    <input type="text" id="id" name="id" class="form-control" placeholder="账号" required="" autofocus="">
    <br>
    <label for="password" class="sr-only">密<nbsp/> <nbsp/><nbsp/>码</label>
    <input type="password" id="password" name="password" class="form-control" placeholder="密码" required="">
    <br>
    <button class="btn btn-lg btn-outline-secondary btn-block" type="submit">登录</button>
</form>
<button class="btn btn-lg btn-outline-secondary btn-block"><a href="/register/form">管理员注册</a></button>

</body>

<%--</body>--%>
</html>
