<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>图书管理系统</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>
图书管理${data}
<fmt:formatDate value="${data}" pattern="yyyy-MM-dd"/>
<form id="form" name="form" action="libraryBook/add" method="post">
    <table border="1px" cellspacing="0" cellpadding="10">
        <thead>
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>价格</th>
            <th>状态</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${fn:length(list)>0}">
            <c:forEach var="list" items="${list}" varStatus="s">
                <tr>
                    <td>${list.name}</td>
                    <td>${list.author}</td>
                    <td>${list.price}</td>
                    <td>${list.state}</td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</form>
</body>
</html>
