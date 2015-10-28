<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>用户基本信息添加</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
</head>
<body>

	<div class="container">



		<form class="form-horizontal" action="userInfo/saveUserInfo.action"
			method="post">
			<div class="control-group">
				<label class="control-label" for="inputName">姓名</label>
				<div class="controls">
					<input type="text" name="Name" id="inputName" placeholder="姓名">（请填写真实的姓名）
				</div>
			</div>
			<div class="control-group ">
				<label class="control-label" for="inputPassword">性别</label>
				<div class="controls control-row">
					<label class="radio"> <input type="radio" name="gender"
						id="optionsRadios1" value="0" checked> 男 </label> <label
						class="radio"> <input type="radio" name="gender"
						id="optionsRadios2" value="1">女 </label>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputPhoneNumber">电话号码</label>
				<div class="controls">
					<input type="text" name="phoneNumber" id="inputPhoneNumber "
						placeholder="电话号码">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputBirthday">出生日期</label>
				<div class="controls">
					<input type="text" name="birthday" id="inputBirthday "
						placeholder="出生日期">（格式yyyy-mm-dd）
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputEmail">邮件</label>
				<div class="controls">
					<input type="text" name="email" id="inputEmail " placeholder="邮件">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputNativeAddress">籍贯</label>
				<div class="controls">
					
	
					<select id="provinceId" name="nativeAddress">
					<c:forEach var="province" items="${provinceList}">
							<option value="${province.id}">${province.provinceName}</option>
						</c:forEach>	
					</select> 
					
					<select id="city" name="nativeAddress">
							<option value="1">东城区</option>
							<option value="2">西城区</option>
							<option value="3">崇文区</option>
							<option value="4">宣武区</option>
							<option value="5">朝阳区</option>
							<option value="6">丰台区</option>
							<option value="7">石景山区</option>
							<option value="8">海淀区</option>
							<option value="9">门头沟区</option>
							<option value="10">房山区</option>
							<option value="11">通州区</option>
							<option value="12">顺义区</option>
							<option value="13">昌平区</option>
							<option value="14">大兴区</option>
							<option value="15">怀柔区</option>
							<option value="16">平谷区</option>
							<option value="17">密云县</option>
							<option value="18">延庆县</option>
							
					</select>
				
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputprovinceId">居住地</label>
				<div class="controls">
				<select id="provinceId1" name="liveAddress">
					<c:forEach var="province" items="${provinceList}">
							<option value="${province.id}">${province.provinceName}</option>
						</c:forEach>	
					</select> 
					<select id="city1" name="liveAddress">
							<option value="1">东城区</option>
							<option value="2">西城区</option>
							<option value="3">崇文区</option>
							<option value="4">宣武区</option>
							<option value="5">朝阳区</option>
							<option value="6">丰台区</option>
							<option value="7">石景山区</option>
							<option value="8">海淀区</option>
							<option value="9">门头沟区</option>
							<option value="10">房山区</option>
							<option value="11">通州区</option>
							<option value="12">顺义区</option>
							<option value="13">昌平区</option>
							<option value="14">大兴区</option>
							<option value="15">怀柔区</option>
							<option value="16">平谷区</option>
							<option value="17">密云县</option>
							<option value="18">延庆县</option>
							
					</select>
					<!-- <input type="text" name="liveAddress" id="inputLiveAddress "
						placeholder="居住地"> -->
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputPoliticalStatus">政治面貌</label>
				<div class="controls">
					<input type="text" name="politicalStatus"
						id="inputPoliticalStatus " placeholder="政治面貌">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputPostAddress">通讯地址</label>
				<div class="controls">
					<input type="text" name="postAddress" id="inputPostAddress "
						placeholder="通讯地址">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputCarID">证件号码</label>
				<div class="controls">
					<input type="text" name="carID" id="inputCarID " placeholder="证件号码">
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
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	$(function(){
	$("#provinceId").change(function(){
	var proId=$("#provinceId").val();
	
      // var jsonStr = JSON.stringify(proId);
         $.ajax({
             type:"post",
             url:"city/findCity.action",  
             dataType:"json",
             //contentType: "application/json",  
             data: { //发送给数据库的数据
              id:proId
              },
          
        success:function(data) {
      
            $("#city").empty();
            var datas=eval(data);
            $.each(datas, function(index,item){
             $("#city").append("<option value="+item.id+">"+item.cityName+"</option>"); 

          }); 
          
      
        },
         error:function(){
  					alert("操作有误");
  					}
	
	});
  });
  $("#provinceId1").change(function(){
	var proId=$("#provinceId1").val();
	
      
         $.ajax({
             type:"post",
             url:"city/findCity.action",  
             dataType:"json",
             
             data: { //发送给数据库的数据
              id:proId
              },
          
        success:function(data) {
      
            $("#city1").empty();
            var datas=eval(data);
            $.each(datas, function(index,item){
             $("#city1").append("<option value="+item.id+">"+item.cityName+"</option>"); 

          }); 
          
      
        },
         error:function(){
  					alert("操作有误");
  					}
	
	});
  });
 });
</script> 
</body>
</html>
