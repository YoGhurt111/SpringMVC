<%@ page import="com.yoghurt.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>选择界面</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<h1>登录成功，请选择前往界面</h1>
<p id="name1">${user.getName()}</p>
<a href="/A?name=${user.getName()}" id="bt">链接甲</a>
<br>
<a>链接乙</a>
</body>
</html>
<%--<script>--%>
    <%--alert($('#name1').html());--%>
<%--</script>--%>


