<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link type="text/css" rel="stylesheet" href="css/login.css" />

</head>

<body>
<div class="main">
  <div class="main0">
     <div class="main_left">
        <img src="images/login-image-3.png" class="theimg"/>
     </div>
     <form class="main_right" action="LoginServlet" method="post">
        <div class="main_r_up">
            <img src="images/user.png" />
            <div class="pp">登录</div>
        </div>
        <div class="sub"><p>还没有账号？<a href="zhuce.jsp"><span class="blue">立即注册</span></a></p></div>
        <div class="txt">
            <span style="letter-spacing:8px;">用户名:</span>
            <input name="unumber" type="text" class="txtphone" placeholder="请输入用户名"/>
        </div>
        <div class="txt">
            <span style="letter-spacing:4px;">登录密码:</span>
            <input name="upassword" type="password" class="txtphone" placeholder="请输入密码"/>
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
       
          <input type="submit" class="zc" value="登录">
     </form>
  </div>
</div>

</body>
</html>
