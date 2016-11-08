<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>User List</title>
</head>

<body>
<table border="1px" cellspacing="0" cellpadding="10">
    <thead>
    <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>昵称</th>
        <th>状态</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${fn:length(lsUser)>0}">
        <c:forEach var="list" items="${lsUser}" varStatus="s">
            <tr>
                <td>${list.realName}</td>
                <td>${list.sex}</td>
                <td>${list.userName}</td>
                <td>${list.state}</td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</body>
</html>
