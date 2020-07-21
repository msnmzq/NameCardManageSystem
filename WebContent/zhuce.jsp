<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link type="text/css" rel="stylesheet" href="css/zhuce.css" />
<script type="text/javascript" src="zhuce.js"></script>

</head>

<body>
<div class="main">
  <div class="main0">
     <div class="main_left">
        <img src="images/login-image-3.png" class="theimg"/>
     </div>
     <form class="main_right" action="ZhuCeServlet" method="post">
        <div class="main_r_up">
            <img src="images/user.png" />
            <div class="pp">注册</div>
        </div>
        <div class="sub"><p>已注册<a href="login.jsp"><span class="blue">点击登录</span></a></p></div>
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
        <div class="txt">
            <span style=" float:left;letter-spacing:8px;">验证码:</span>
          
				 <input name="yzm" type="text" class="txtyzm" size="4" placeholder="请输入页面验证码"/>
          	     <img src="img.jsp" class="yzmimg"/>
        </div>
       
        <input type="submit" class="zc" value="注册">
     </form>
  </div>
</div>
	
	
</body>
</html>
