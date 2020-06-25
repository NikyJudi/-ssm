<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/25
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
</head>
<style>
    .text-truncate {
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap
    }
    .card-text {
        line-height: 21px;
        height: 21px;
        overflow: hidden;
        width: 30%;
    }
</style>
<body>
<%--<form id="_form" method="post" action="/myinfo/${student.id}">--%>
<%--    <input type="hidden" name="name" value="value" />--%>
<%--    <a onclick="document.getElementById('_form').submit();">我的主页</a>--%>
<%--</form>--%>
<a href="/myinfo/${student.id}" >我的主页</a>
<div class="container">
    <div class="row">

        <c:forEach var="picture" items="${pictures}">
        <div >
            <div class="student-class">
                <div class="card-header">
                    <h3 class="card-title" ><a href="/author/${picture.student.id}">${picture.student.name}</a> </h3>
                </div>
                <img height="90" width="120" src="${picture.link}" class="card-img-top">
                <div class="picture-class" >
                    <p class="card-text text-truncate">${picture.content}</p>
                    <a class="card-link pull-right"  href="/a/${picture.id}">查看全文 »</a>
                </div>
            </div>
        </div>
        </c:forEach>
</div>
</div>
</body>
</html>
