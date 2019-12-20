<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/cms.css">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/tupian">

<title>Cms后台登录</title>
</head>
<body style="background:url(/tupian/123.jpg) no-repeat center center fixed">  
   <div class="container-fluid" >
		<div class="col-4 offset-4 loginForm">
			<h3>欢迎使用CMS系统</h3>
			<div class="alert alert-danger" role="alert" style="display: none">
			</div>
			<form action="/admin/home"  id="loginForm">
			  <div class="form-group">
			    <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名...">
			    <small id="emailHelp" class="form-text text-muted"></small>
			  </div>
			  <div class="form-group">
			    <!-- <label for="exampleInputPassword1">密码</label> -->
			    <input type="password" class="form-control" id="password" name="password"  placeholder="请输入用户名...">
			  </div>
			  <input type="button" class="btn btn-primary" value="登录" onclick="login()">
			  <!-- <label for="exampleInputPassword1">没有帐号，去<a href="/">注册</a></label> -->
			</form>
		</div>
	</div>
	<script type="text/javascript" src="/js/jquery.min.1.12.4.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function login(){
		//空判断
		var username = $("#username").val();
		var password = $("#password").val();
		if(username==null || password==""){
			$(".alert").html("请输入用户名和密码");
			$(".alert").show();
			return;
		}
		$(".alert").hide();
		//后台验证
		var formData = $("#loginForm").serialize();
		$.post("/admin/user/login",formData,function(res){
			if(res.result){
				//验证通过跳转到后台首页
				location.href="/admin/home";
			}else{
				//否则提示错误信息
				$(".alert").html(res.message);
				$(".alert").show();
			}
		});
	}
</script>
</body>
</html>