<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">   
    <title>企业用户信息添加</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
  </head>  
  <body>
  
   <div class="container">  <!-- 主控div -->
  <form class="form-horizontal" action="enterpriseInfo/saveEnterpriseInfo.action" method="post">
        <div class="control-group">
			<label class="control-label" for="inputName">企业名称：</label>
			<div class="controls">
				<input type="text"  name="enterpriseName"  id="inputName"  placeholder="邮箱/手机号">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputProperty">企业性质：</label>
			<div class="controls">
				<input type="text" name="property"  id="inputProperty " placeholder="企业性质">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputClassification">企业类别：</label>
			<div class="controls">
				<input type="text" name="classification"  id="inputClassification " placeholder="企业类别">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputEmail">邮箱：</label>
			<div class="controls">
				<input type="text" name="email"  id="inputEmail " placeholder="邮箱">
			</div>
		</div>
		
		<div class="control-group "  >
			<label class="control-label" for="inputlinkman">公司联系人：</label>
			<div class="controls">
				<input type="text" name="linkman"  id="inputlinkman " placeholder="联系人">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputregisterDate">公司注册日期：</label>
			<div class="controls">
				<input type="text" name="registerDate"  id="inputregisterDate " placeholder="yyyy-mm-dd">(格式：年-月-日)
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputphoneNumber">电话：</label>
			<div class="controls">
				<input type="text" name="phoneNumber"  id="inputphoneNumber " placeholder="联系电话">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputnumber">公司规模：</label>
			<div class="controls">
				<input type="text" name="number"  id="inputnumber" placeholder="人数">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputintroduce">公司介绍：</label>
			<div class="controls">
				<input type="text" name="introduce"  id="inputintroduce " placeholder="">
			</div>
		</div>
		
		
		<div class="control-group "  >
			<label class="control-label" for="inputAddress">公司地址：</label>
			<div class="controls">
				<input type="text" name="Address"  id="inputAddress " placeholder="地址">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputlicensePhptoAddress">执照照片：</label>
			<div class="controls">
				<input type="file" name="licensePhptoAddress"  id="inputlicensePhptoAddress " placeholder="">
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
