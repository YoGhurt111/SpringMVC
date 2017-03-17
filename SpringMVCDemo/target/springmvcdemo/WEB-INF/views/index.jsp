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
<style>
    .fff {
        color: #ff0000;
    }
    #ffff{
         margin-left: 200px;
     }
</style>

<body>
<h1>请输入您的用户名</h1>
<form name="input" action="/selectUser" method="post">
    用户名：<input type="text"  id="username" name="name"><br>
    密码：<input  id="password" type="password" name="pwd">
    <input type="submit" value="Submit">
    <%--<button id="t666">ttt</button>--%>
</form>
<%--<button id="bt">666</button>--%>
<%--<p class="fff">ajsdklf</p>--%>
<%--<p id="ffff">ajkdjflkasdf</p>--%>
<%--<p>alksdjf</p>--%>

</body>
</html>

<%--<script>--%>
    <%--var name=$('#username').val();--%>
    <%--var pass=$('#password').val();--%>
    <%--$('#t666').click(function () {--%>
        <%--$.ajax({--%>
            <%--url:'uuuu',--%>
            <%--type:'get',--%>
            <%--data:{'name':name,'pass':pass},--%>
            <%--dataType:'json',--%>
            <%--success:function (data) {--%>

            <%--},--%>
            <%--error:function () {--%>
                <%--alert(5555);--%>
            <%--}--%>

        <%--});--%>
    <%--});--%>
<%--</script>--%>
