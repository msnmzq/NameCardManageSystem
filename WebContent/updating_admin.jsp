<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>修改</title>
	<link type="text/css" rel="stylesheet" href="css/zhuce.css" />
	<script type="text/javascript" src="zhuce.js"></script>

</head>

<body>
	<%@ include file="common_admin.jsp"%>

	<form class="main_right" style="margin-right:29%;margin-top:2%" action="UpdateServletAdmin" method="post">


		<input type="hidden" name="id" value=${param.id}>

	

		<input type="hidden" name="unumber" value=${param.unumber}>
		<input type="hidden" name="upassword" value=${param.upassword}>

		<input type="hidden" name="identity" value=${param.identity}>
		<div class="txt">
			<span style="letter-spacing:8px;">真实姓名:</span>
			<input name="name" type="text" class="txtphone" placeholder="请输入真实姓名" />
		</div>
		<div class="txt">
			<span style="letter-spacing:8px;">性别:</span>
			<input style="margin-left:80px" name="sex" type="radio" class="txtphonevalue" value="男" />男
			<input name="sex" type="radio" class="txtphonevalue" value="女" />女
		</div>
		<div class="txt">
			<span style="letter-spacing:8px;">email:</span>
			<input style="margin-left:33px" name="email" type="text" class="txtphone" placeholder="请输入邮箱" />
		</div>
		<div class="txt">
			<span style="letter-spacing:8px;">目前职业:</span>
			<input name="profession" type="text" class="txtphone" placeholder="请输入职业" />
		</div>


		<input type="submit" class="zc" value="确认修改">
	</form>



</body>

</html>
