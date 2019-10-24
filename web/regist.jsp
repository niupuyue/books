<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019/10/24
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册页面</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>注册新用户</h3></center>
    <form action="${pageContext.request.contextPath}/regist" method="post">
        <div class="form-group">
            <label for="username">姓名：</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
        </div>

        <div class="form-group">
            <label for="nickname">昵称：</label>
            <input type="text" class="form-control" id="nickname" name="nickname" placeholder="请输入昵称">
        </div>

        <div class="form-group">
            <label for="birthday">生日：</label>
            <input type="date" class="form-control" id="birthday" name="birthday" placeholder="请输入生日">
        </div>

        <div class="form-group">
            <label for="address">地址：</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="请输入地址">
        </div>

        <div class="form-group">
            <label for="telephone">电话：</label>
            <input type="tel" class="form-control" id="telephone" name="telephone" placeholder="请输入电话 ">
        </div>


        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱地址"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" />
        </div>
    </form>
</div>
</body>
</html>
