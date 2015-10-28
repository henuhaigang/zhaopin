<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>用户登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container">

		<form class="form-horizontal" action="user/userLogin.action"
			method="post">
			<div class="control-group">
				<label class="control-label" for="inputEmail">用户名</label>
				<div class="controls">
					<input type="text" name="userName" id="inputEmail"
						placeholder="邮箱/手机号">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">密码</label>
				<div class="controls">
					<input type="password" name="password" id="inputPassword "
						placeholder="请输入密码">
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<label class="checkbox"> <input type="checkbox">
						记住我 </label>
					<button type="submit" class="btn">登录</button>
					<button type="reset" class="btn">重置</button>
				</div>
			</div>
		</form>


	</div>
	<!------------------------------- js文件加载----------------------------------------- -->
	<script src="js/jquery-1.7.1.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
