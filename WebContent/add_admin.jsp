<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link type="text/css" rel="stylesheet" href="css/zhuce.css" />
<script type="text/javascript" src="zhuce.js"></script>
<style>

</style>
</head>

<body>
<%@ include file="common_admin.jsp"%>

     <form class="main_right" style="margin-right:29%;margin-top:2%" action="AddAdminServlet" method="post">
     
      
   
         <div class="txt">
            <span style="letter-spacing:8px;">用户账号:</span>
            <input name="unumber" type="text" class="txtphone" placeholder="请输入账号"/>
        </div>
        <div class="txt">
              <span style="letter-spacing:8px;">登录密码:</span>
            <input name="upassword" type="password" class="txtphone" placeholder="请输入密码"/>
        </div>
        <div class="txt">
           <span style="letter-spacing:8px;">真实姓名:</span>
          <input name="name" type="text" class="txtphone" placeholder="请输入真实姓名"/>
      </div>
       <div class="txt">
           <span style="letter-spacing:8px;">性别:</span>
          <input style="margin-left:80px" name="sex" type="radio" class="txtphonevalue" value="男"/>男
          <input name="sex" type="radio" class="txtphonevalue" value="女"/>女      
      </div>
      <div class="txt">
        <span style="letter-spacing:8px;">email:</span>
        <input style="margin-left:33px" name="email" type="text" class="txtphone" placeholder="请输入邮箱"/>
    </div>
      <div class="txt">
        <span style="letter-spacing:8px;">目前职业:</span>
        <input name="profession" type="text" class="txtphone" placeholder="请输入职业"/>
    </div>
      <div class="txt">
           <span style="letter-spacing:8px;">身份:</span>
          <input style="margin-left:80px" name="identity" type="radio" class="txtphonevalue" value="管理员"/>管理员
          <input name="identity" type="radio" class="txtphonevalue" value="普通用户"/>普通用户      
      </div>
     
       
        <input type="submit" class="zc" value="添加">
     </form>

	
	
</body>
</html>
