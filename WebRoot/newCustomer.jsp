<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML><HEAD><TITLE>中国移动业务管理系统</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<META content="MSHTML 6.00.2600.0" name=GENERATOR>
<link href="style.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY bgColor=#ffffff leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<form method="POST" action="newCustomer1.jsp">
      <p>证件类型：<select size="1" name="idtype">
        <option>居民身份证</option>
        <option>护照</option>
        <option>军官证</option>
      </select></p>
      <p>证件号码：<input type="text" name="idcard" size="20" value=""></p>
      
      <p>　</p>
      <p><input type="submit" value="下一步>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>
</BODY>
</HTML>
