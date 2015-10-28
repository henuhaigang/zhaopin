<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>证书添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">

  </head>
  
  <body>
    <div id="container"><!-- 主框架 -->
 <form class="form-horizontal" action="certificate/saveCertificate.action" method="post">
  <div class="control-group">
    <label class="control-label" for="inputcertificateMark">证书类别</label>
    <div class="controls">
      <input type="text" id="inputcertificateMark" name="certificateMark" placeholder="证书类别">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputcertificateName">证书名称：</label>
    <div class="controls">
      <input type="text" name="certificateName" id="inputcertificateName" placeholder="证书名称">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputauthority">颁发机构：</label>
    <div class="controls">
      <input type="text" name="authority" id="inputauthority" placeholder="颁发机构">
    </div>
  </div>
   <div class="control-group">
    <label class="control-label" for="inputissueDate">发证时间：</label>
    <div class="controls">
      <input type="text" name="issueDate" id="inputissueDate" placeholder="年-月-日">
    </div>
  </div>
  
  <div class="control-group">
    <div class="controls">
      <button class="btn">继续添加证书 </button>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <button type="submit" class="btn btn-primary">保存并进行下一步</button>
    </div>
  </div>
</form>
 
</div> <!--  主控 -->
   <!-- 加载js文件 -->
	<script src="js/jquery-1.7.1.min.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script> 
  </body>
</html>
