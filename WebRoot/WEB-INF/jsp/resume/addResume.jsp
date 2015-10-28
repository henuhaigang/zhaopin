<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>填写简历</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
  </head>
  <body>
 <div id="container"><!--  主框架 -->

 
 <form class="form-horizontal" action="resume/saveResume.action" method="post">
  <div class="control-group">
    <label class="control-label" for="inputworkMakRequire">期望工作性质：</label>
    <div class="controls">
      <input type="text" id="inputworkMakRequire" name="workMakRequire" placeholder="性质">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputcareerRequire">职业要求：</label>
    <div class="controls">
      <input type="text" name="careerRequire" id="inputcareerRequire" placeholder="Password">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputworkPlaceRequire">工作地点要求：</label>
    <div class="controls">
      <input type="text" name="workPlaceRequire" id="inputworkPlaceRequire" placeholder="工作地点要求">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputsalaryRequire">薪资要求：</label>
    <div class="controls">
      <input type="text" name="salaryRequire" id="inputsalaryRequire" placeholder="薪">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputstate">现在状态：</label>
    <div class="controls">
      <input type="text" name="state" id="inputstate" placeholder="现在状态">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputcareerRequire">自我介绍</label>
    <div class="controls">
      <!-- <input type="text" name="selfIntrduce" id="inputcareerRequire" placeholder="Password"> -->
      <textarea rows="10" name="selfIntrduce" id="inputcareerRequire" placeholder="Password"></textarea>
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputdegree">学历：</label>
    <div class="controls">
      <input type="text" name="degree" id="inputdegree" placeholder="本科、硕士、博士">
    </div>
  </div>
   <div class="control-group">
    <label class="control-label" for="inputinterest">兴趣爱好：</label>
    <div class="controls">
      <input type="text" name="interest" id="inputinterest" placeholder="">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputattachmentAddr">附件：</label>
    <div class="controls">
      <input type="file" name="attachmentAddr" id="inputattachmentAddr" placeholder="">
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
