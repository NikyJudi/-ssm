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
    <table class="table-view">
        <tbody>
        <tr>
            <td scope="row">${student.id}</td>
            <td>${student.name}</td>
            <td>${student.money}</td>
        </tr>
        </tbody>
    </table>
    <form class="form-signin" method="post" action="/list/${student.id}/update">
        <h1 class="h3 mb-3 font-weight-normal">请输入此学生新的信息</h1>
        <label for="id" class="sr-only">id</label>
        <input type="text" id="id" name="id" class="form-control" required="" autofocus="">
        <label for="name" class="sr-only">姓名</label>
        <input type="text" id="name" name="name" class="form-control" required="" autofocus="">
        <label for="money" class="sr-only">余额</label>
        <input type="text" id="money" name="name" class="form-control" required="" autofocus="">
        <button class="btn btn-lg btn-outline-secondary btn-block" type="submit">提交</button>
    </form>
</body>
</html>
