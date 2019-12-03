<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zi
  Date: 2019/11/27 0027
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="item">
    <tr>
        <td height="25" >${item.id}</td>
        <td >${item.usercode}</td>
        <td >${item.userpassword}</td>
    <br>
    </tr>

</c:forEach>
</body>
</html>
