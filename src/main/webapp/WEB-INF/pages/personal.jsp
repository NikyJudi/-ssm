<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/25
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
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
<head>
    <title>Title</title>
</head>

<body>
    <h3>${student.name}的首页</h3>
    <c:forEach items="${list}" var="picture">
        <div class="col-4 mt-3">
            <div class="card">
                <img height="300" width="400" src="${picture.link}" class="card-img-top">
                <div class="card-body">
                    <p class="card-text text-truncate">${picture.content}</p>
                    <a class="card-link pull-right"  href="/a/${picture.id}">查看全文 »</a>
                    <p class="card-text text-truncate">---------------------------------</p>
                </div>
            </div>
        </div>
    </c:forEach>
</body>
</html>
