<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户修改</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUsers" method="post">
    <table>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><input name="users[0].id" value="1" type="checkbox"/></td>
            <td><input name="users[0].username" value="tome" type="text"/></td>
        </tr>
        <tr>
            <td><input name="users[1].id" value="2" type="checkbox"/></td>
            <td><input name="users[1].username" value="lucy" type="text"/></td>
        </tr>

    </table>
<input type="submit" value="修改"/>
</form>

</body>
</html>
