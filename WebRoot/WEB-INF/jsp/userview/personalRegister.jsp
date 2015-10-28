<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>个人用户注册</title>   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <div class="container">
  <form class="form-horizontal" action="user/register.action">
        <div class="control-group">
			<label class="control-label" for="inputEmail">用户名</label>
			<div class="controls">
				<input type="text"  name="userName"  id="inputEmail"  placeholder="邮箱/手机号">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputPassword">密码</label>
			<div class="controls">
				<input type="password" name="password"  id="inputPassword " placeholder="请输入密码">
			</div>
		</div>
		<!-- <div class="control-group "  >
			<label class="control-label" for="rePassword">再次输入密码</label>
			<div class="controls">
				<input type="password"   id="rePassword " placeholder="请输入密码">
			</div>
		</div> -->
		
		<div class="control-group hide"  >
			<label class="control-label" for="inputType">用户类型</label>
			<div class="controls">
				<input type="text" value="1" name="type"  id="inputType " >
			</div>
		</div>
		
		
		<div class="control-group">
			<div class="controls">
				<button type="submit" class="btn">提交</button>
			</div>
		</div>
  
  </form>
  
  </div>
       <!-- 加载js文件 -->
     <script src="js/jquery-1.7.1.min.js"></script>
     <script src="bootstrap/js/bootstrap.js"></script>
  </body>
</html>
