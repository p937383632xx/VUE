<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>展示账户数据列表</h1>
<table border="1">
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.id}</td>
            <td>${user.id}</td>


        </tr>
    </c:forEach>

</table>
</body>
</html>
