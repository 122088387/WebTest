<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<!-- 引用javascript界面 -->
<script type="text/javascript" language="javascript"
	src="Scripts/login.js">
	<% String s ="abc";%>
	 var n="<%=s%>"
</script>
<T99vLE> 登录成功测试： </T99vLE>
</HEAD>
<BODY BGCOLOR="#FFFFFF" text="#00ff00" onload="checkOk()">
	<!-- <script type="text/javascript" language="javascript" src="Scripts/login.js" ></script> -->
	
	<%
		out.println("登录成功，请继续浏览此网站!");
	%>
</BODY>
</HTML>