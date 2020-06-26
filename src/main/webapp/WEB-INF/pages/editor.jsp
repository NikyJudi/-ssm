<%--
  Created by IntelliJ IDEA.
  User: ning
  Date: 2020/6/26
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>编辑</title>
    <style>
        .form-group {
            margin-bottom: 1rem
        }
        body {
            margin-top: 15px;
            background-image: url(/images/email-pattern.png);
        }
    </style>
</head>

<body>
<main class="container-fluid">
    <form method="post" action="/editor/writer/${id}">
            <div>
                <button type="submit" class="btn btn-primary">发布</button>
            </div>
        <div>
            <div id="editor">
                <label>
                    <textarea id="content" name="content"  cols="80%" placeholder="正文">${picture.content}</textarea>
                </label>
            </div>
        </div>
    </form>
</main>

</body>
</html>
