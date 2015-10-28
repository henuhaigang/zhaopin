<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户工作经验添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">   
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
  </head>
  <body>
  
  
  <div id="container"><!-- 主框架 -->
 <form class="form-horizontal" action="userExperience/saveUserExperience.action" method="post">
  <div class="control-group">
    <label class="control-label" for="inputenterpriseName">企业名称</label>
    <div class="controls">
      <input type="text" id="inputenterpriseName" name="enterpriseName" placeholder="企业名称">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputenterpriseMark">企业性质：</label>
    <div class="controls">
      <input type="text" name="enterpriseMark" id="inputenterpriseMark" placeholder="企业性质">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputworkenterpriseNumber">规模：</label>
    <div class="controls">
      <input type="text" name="enterpriseNumber" id="inputworkenterpriseNumber" placeholder="大约人数">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputdepartment">工作部门：</label>
    <div class="controls">
      <input type="text" name="department" id="inputdepartment" placeholder="工作部门">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputposition">职位：</label>
    <div class="controls">
      <input type="text" name="position" id="inputposition" placeholder="职位">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputworkTime">工作时间</label>
    <div class="controls">
      <!-- <input type="text" name="selfIntrduce" id="inputcareerRequire" placeholder="Password"> -->
      <input  type="text" name="workTime" id="inputworkTime" placeholder="工作时间">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputdegree">薪资水平：</label>
    <div class="controls">
      <input type="text" name="salary" id="inputdegree" placeholder="薪资">
    </div>
  </div>
   <div class="control-group">
    <label class="control-label" for="inputworkDescribe">工作描述：</label>
    <div class="controls">
         <textarea rows="10" name="workDescribe" id="inputworkDescribe" placeholder="Password"></textarea>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <button class="btn">继续添加经验</button>
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
