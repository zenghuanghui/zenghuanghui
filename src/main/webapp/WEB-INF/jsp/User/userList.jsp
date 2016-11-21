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
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN EXAMPLE TABLE PORTLET-->
        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-dark">
                    <i class="icon-settings font-dark"></i>
                    <span class="caption-subject bold uppercase"> Managed Table</span>
                </div>
            </div>
            <div class="portlet-body">
                <table class="table table-striped table-bordered table-hover table-checkable order-column"
                       id="sample_1">
                    <thead>
                    <tr>
                        <th>
                            <input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes"/></th>
                        <th> UserName</th>
                        <th> Sex</th>
                        <th> NickName</th>
                        <th> Email</th>
                        <th> State</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:if test="${fn:length(lsUser)>0}">
                        <c:forEach var="list" items="${lsUser}" varStatus="s">
                            <tr class="odd gradeX">
                                <td>
                                    <input type="checkbox" class="checkboxes" value="1"/></td>
                                <td>${list.realName}</td>
                                <td>${list.sex}</td>
                                <td>${list.userName}</td>
                                <td>${list.email}</td>
                                <td>${list.state}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    </tbody>
                </table>
            </div>
        </div>
        <!-- END EXAMPLE TABLE PORTLET-->
    </div>
</div>
<!--
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
 -->
</body>
</html>
