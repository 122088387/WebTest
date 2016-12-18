<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>

<!-- 引用javascript界面 -->
<!-- <script type="text/javascript" src="Scripts/login.js"></script> -->

</head>
<body>
	<!--  <form id="form1" name="form1" method="post" action="httpServer"> -->
	<form id="form1" name="form1" method="post" action="httpServer">
		<table width="260" border="1" align="center">
			<tr>
				<td width="64">用户：</td>
				<td width="180"><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Submit2" value="登录" /> <input
					type="reset" name="Submit" value="重置" /></td>
			</tr>
		</table>
	</form>
	<!-- 验证的页面 -->
	<%-- <%
		if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("123")) {
			out.println("登录成功");
			response.sendRedirect("test2.jsp");
		} else {
			out.println("用户名或者密码错误！");
		}
	%> --%>
	<br>
</body>

</html>