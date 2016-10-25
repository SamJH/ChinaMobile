<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<CENTER>
<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
  <TBODY>
  
  <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    <form method="POST" action="newOperator">
      <p>登录ID：<input type="text" name="id" size="20" value=""></p>
      <p>姓 名：<input type="text" name="username" size="20" value=""></p>
      <p>密码：<input type="password" name="password" size="20" value=""></p>
      <p>密码确认：<input type="password" name="passwordagain" size="20" value=""></p>
      <p>是否管理员：<input type="radio" value="true" checked name="ifmanager">是&nbsp;&nbsp;&nbsp; 
      <input type="radio" name="ifmanager" value="false">否</p>
      <p><input type="submit" value="提交" name="B1"></p>
    </form>
    <font color="red">${falsemanage }</font>
    </TD>
    </TR>
  </TBODY></TABLE>
  </BODY></HTML>
