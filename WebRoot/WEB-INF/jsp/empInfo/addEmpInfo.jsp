<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">  
    <title>招聘信息发布</title>  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">

  </head>
  
  <body>
  
  
   <div class="container">  <!-- 主控div -->
  <form class="form-horizontal" action="empInfo/saveEmpInfo.action" method="post">
        <div class="control-group">
			<label class="control-label" for="inputpositionName">职位名称：</label>
			<div class="controls">
				<input type="text"  name="positionName"  id="inputpositionName"  placeholder="职位名称">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputpositionMark">职位类别：</label>
			<div class="controls">
				<input type="text" name="positionMark"  id="inputpositionMark " placeholder="职位类别">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputpositionIntroduce">职位介绍：</label>
			<div class="controls">
			 <textarea rows="10" name="positionIntroduce" id="inputpositionIntroduce" placeholder="在此输入内容...."></textarea>
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputworkPlacel">工作地点：</label>
			<div class="controls">
				<input type="text" name="workPlace"  id="inputworkPlacel " placeholder="工作地点">
			</div>
		</div>
		
		<div class="control-group "  >
			<label class="control-label" for="inputexperienceRequire">工作经验要求：</label>
			<div class="controls">
				<input type="text" name="experienceRequire"  id="inputexperienceRequire " placeholder="工作经验要求">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputdegreeRequire">学历要求：</label>
			<div class="controls">
				<input type="text" name="degreeRequire"  id="inputdegreeRequire " placeholder="">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputworkProperty">工作性质：</label>
			<div class="controls">
				<input type="text" name="workProperty"  id="inputworkProperty " placeholder="工作性质">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputEmpNumber">招聘人数：</label>
			<div class="controls">
				<input type="text" name="EmpNumber"  id="inputEmpNumber" placeholder="招聘人数">
			</div>
		</div>
		<div class="control-group "  >
			<label class="control-label" for="inputsalary">薪资范围：</label>
			<div class="controls">
				<input type="text" name="salary"  id="inputsalary " placeholder="薪资范围">
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
