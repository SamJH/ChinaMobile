<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newUser.jsp' starting page</title>
    
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
    <form method="POST" action="kaiHu">
      <p>手机号码：<input type="text" name="phonenum" size="20"></p>
      <p>漫游状态：<input type="radio" name="manyou" value="省内漫游" checked>省内漫游 <input type="radio" name="manyou" value="国内漫游 ">国内漫游 
      <input type="radio" name="manyou" value="国际漫游">国际漫游</p>
      <p>通话级别：<input type="radio" value="本地通话 " checked name="tonghua">本地通话 
      <input type="radio" name="tonghua" value="国内长途">国内长途 <input type="radio" name="tonghua" value="国际长途">国际长途</p>
      <p>客户ID：<input type="text"  size="20" value="<%=request.getParameter("idcard") %>" readonly></p>
      <p><input type="hidden" value="<%=request.getParameter("idcard") %>" name="idcard"></p>
      <p><input type="hidden" value="<%=request.getParameter("idtype") %>" name="idtype"></p>
      <p><input type="hidden" value="<%=request.getParameter("customername") %>" name="customername"></p>
      <p><input type="hidden" value="<%=request.getParameter("sex") %>" name="sex"></p>
      <p><input type="hidden" value="<%=request.getParameter("birthday") %>" name="birthday"></p>
      <p><input type="hidden" value="<%=request.getParameter("address") %>" name="address"></p>
      <p><input type="submit" value="完成>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>  </body>
</html>
