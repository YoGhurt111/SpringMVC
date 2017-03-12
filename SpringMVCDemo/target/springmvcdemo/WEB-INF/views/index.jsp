<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>


</head>
<body>
<h1>请输入您的用户名</h1>
<form name="input" action="/selectUser" method="post">
    用户名：<input type="text"  id="username" name="name"><br>
    密码：<input  id="password" type="password" name="pwd">
    <input type="submit" value="Submit">
</form>

</body>
</html>
