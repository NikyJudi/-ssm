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
<head>
    <title>Title</title>
</head>
<body>
    <h3>${student.name}的首页</h3>
    <c:forEach items="${list}" var="picture">
        <div class="col-4 mt-3">
            <div class="card">
                <img height="90" width="120" src="${picture.link}" class="card-img-top">
                <div class="card-body">

                    <p class="card-text text-truncate">${picture.content}</p>

                    <a class="card-link pull-right"  href="/a/${picture.id}">查看全文 »</a>
                </div>
            </div>
        </div>
    </c:forEach>
</body>
</html>
