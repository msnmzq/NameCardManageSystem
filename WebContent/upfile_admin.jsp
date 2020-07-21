<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传实例 - 菜鸟教程</title>
<style>
.con {
    position: absolute;
    top: 215px;
    left: 450px;
}
</style>
</head>
<body>
<%@ include file="common_admin.jsp"%>
<div  class="con">
<h2>请选择上传的Excel文件</h2>
<form method="post" action="UploadServlet" enctype="multipart/form-data">
    选择一个文件:
    <input type="file" name="uploadFile" />
    <br/><br/>
    <input type="submit" class="deletebtn" value="上传" />
</form>

</div>

</body>
</html>