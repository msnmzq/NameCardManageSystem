<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除名片</title>
<style>
.col_9{
width:20%;
}

</style>
</head>
<body>
<%@ include file="common_admin.jsp"%>
<div class="find" style="margin:0 ;display:inline-block;position:absolute;top:125px;left:84%">

			<form action="SearchByMHUpdate" method="get">
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
 
 	<table class="tb">

				<tr class="row_t">
					<!-- 序号（id）、姓名、性别、登录账号、密码、电子邮箱等有关信息 -->
					
					
						<th class="col_1">id</th>
					<th class="col_2">姓名</th>
					<th class="col_3">性别</th>
					<th class="col_4">登录账号</th>
					<th class="col_5">密码</th>
						<th class="col_6">职业</th>
					<th class="col_9">电子邮箱</th>
					<th class="col_10">操作</th>
				</tr>

				<c:forEach var="c" items="${requestScope.list}" varStatus="status">


					<tr class="row hide">
						<td class="col_1">${c.id }</td>
						<td class="col_2">${c.name }</td>
						<td class="col_3">${c.sex }</td>
						<td class="col_4">${c.unumber }</td>
						<td class="col_5">${c.upassword }</td>
							<td class="col_6">${c.profession }</td>
						<td class="col_9">${c.email }</td>
						<td class="col_10">
							<form action="updating_admin.jsp" method="get">
								<input 
									type="hidden" name="id" value=${c.id}>
								 <input 
								 	type="hidden" name="name" value=${c.name}> 
								 <input
									type="hidden" name="sex" value=${c.sex}> 
								
									<input
									type="hidden" name="unumber" value=${c.unumber}> 
									<input
									type="hidden" name="upassword" value=${c.upassword}> 
									<input
									type="hidden" name="email" value=${c.email}> 
									<input
									type="hidden" name="profession" value=${c.profession}> 
									<input
									type="hidden" name="identity" value=${c.identity}> 
									<input
									class="deletebtn" type="submit" value="修改">
							</form>
						</td>
						
					</tr>
				</c:forEach>


			</table>
</body>
</html>