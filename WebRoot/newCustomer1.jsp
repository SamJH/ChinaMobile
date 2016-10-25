<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newCustomer1.jsp' starting page</title>
    
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
  <% request.setCharacterEncoding("utf-8"); %>
   <form method="POST" action="newUser.jsp">
      <p>证件类型：<%=request.getParameter("idtype") %></p>
      <p>证件号码：<%=request.getParameter("idcard") %></p>
      <p>姓名：<input type="text" name="customername" size="20" value=""></p>
      <p>性别：<input type="radio" value="男" checked name="sex">男&nbsp;&nbsp; <input type="radio" name="sex" value="女">女</p>
      <p>生日：<input type="text" name="birthday" size="20" value="1965/1/1"></p>
      <p>联系地址：<input type="text" name="address" size="20" value=""></p>
      <p><input type="hidden" value="<%=request.getParameter("idtype") %>" name="idtype"></p>
      <p><input type="hidden" value="<%=request.getParameter("idcard") %>" name="idcard"></p>
      <p>　</p>
      <p><input type="submit" value="下一步>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>
  </body>
</html>
