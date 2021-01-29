<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/28
  Time: 10:26 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="${cc}/apple/hello">
    <input type="text" value="username">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
