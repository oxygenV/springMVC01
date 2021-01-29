<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/29
  Time: 6:06 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${cc}/user" method="post">
    编号:<input type="text" name="id"><br>
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    性别：<input type="text" name="gender"><br>
    省：<input type="text" name="address.province"><br>
    市：<input type="text" name="address.city"><br>
    区：<input type="text" name="address.town"><br>
    点此提交：<input type="submit" value="commit"/>
</form>
</body>
</html>
