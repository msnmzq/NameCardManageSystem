<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
img {
    position: absolute;
    left: 500px;
    top: 200px;
}
</style>
</head>
<body>
<%@ include file="common_admin.jsp"%>
<div class="find" style="margin:0 ;display:inline-block;position:absolute;top:125px;left:84%">

			<form action="SearchByMH" method="get">
				<span> 
				<input id="find_text" type="text" placeholder="请输入用户姓名"
					name="uname" >
				<!--
				<input type="hidden" name="start" value=0>
				<input type="hidden" name="content" value=8> 
				 --> 
				</span>
				 <input id="find_btn" type="submit" value="查找">
			</form>

 </div>
<img src="images/logo1.png">
</body>
</html>