<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
    图书管理 <br>
    <form id="form" name="form" action="libraryBook/add" method="post">
    <table border="1px" cellspacing="0" cellpadding="10" >
    <thead>
    <tr>
    <th>字段</th>
    <th>数据</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    <td>书名</td>
    <td><input type="text" name="name" id="name"/></td>
    </tr>
    <tr>
    <td>作者</td>
    <td><input type="text" name="author" id="author"/></td>
    </tr>
    <tr>
    <td>价格</td>
    <td><input type="text" name="price" id="price"/></td>
    </tr>
    <tr>
    <td>状态</td>
    <td><input type="text" name="state" id="state"/></td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
    <td colspan="2"><input type="submit" value="提交" />
    </td>
    </tr>
    </tfoot>
    </table>
    </form>
  </body>
</html>
