<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2022/6/29
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录页面</h1>

<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="登录">
</form>

</body>
</html>
