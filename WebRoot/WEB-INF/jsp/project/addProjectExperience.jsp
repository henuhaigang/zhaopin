<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>项目经验添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">

  </head>
  
  <body>
  <div id="container"><!-- 主框架 -->
 <form class="form-horizontal" action="projectExperience/saveProjectExperience.action" method="post">
  <div class="control-group">
    <label class="control-label" for="inputentprojectName">项目名称</label>
    <div class="controls">
      <input type="text" id="inputentprojectName" name="projectName" placeholder="企业名称">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputprojecetPeriod">项目周期：</label>
    <div class="controls">
      <input type="text" name="projecetPeriod" id="inputprojecetPeriod" placeholder="企业性质">
    </div>
  </div>
   <div class="control-group">
    <label class="control-label" for="inputprojectDescribe">项目描述：</label>
    <div class="controls">
         <textarea rows="10" name="projectDescribe" id="inputprojectDescribe" placeholder="Password"></textarea>
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputduty">项目职责：</label>
    <div class="controls">
         <textarea rows="10" name="duty" id="inputduty" placeholder="Password"></textarea>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <button class="btn">继续添加项目经验</button>
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
