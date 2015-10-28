<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>语言水平</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
  </head>
  
  <body>
    
  <div id="container"><!-- 主框架 -->
 <form class="form-horizontal" action="language/saveLanguage.action" method="post">
  <div class="control-group">
    <label class="control-label" for="inputlanguageMark">语种</label>
    <div class="controls">
      <input type="text" id="inputlanguageMark" name="languageMark" placeholder="语种">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputentlevel">级别：</label>
    <div class="controls">
      <input type="text" name="level" id="inputentlevel" placeholder="级别">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputscore">分数：</label>
    <div class="controls">
      <input type="text" name="score" id="inputscore" placeholder="分数">
    </div>
  </div>
  
  <div class="control-group">
    <div class="controls">
      <button class="btn">继续添加语言能力 </button>
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
