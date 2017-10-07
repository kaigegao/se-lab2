<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>加入作者</title>
</head>
<body background="ChMkJlbKwaKIb92QAAhjIDNqIGgAALGbQM4gVIACGM4869.jpg">


<h3 align="center" style="color:#ffffff">此作者ID不存在: ${Aut}</h3>

<h4 align="center" style="color:#ffffff">请输入作者信息:</h4>

<form action="ADD_A" method="get">
  <p align="center" style="color:#ffffff"><input type="hidden" name="Aut" value="${Aut}"/></p>
  <p align="center" style="color:#ffffff">Name   : <input type="text" name="AName" /></p>
  <p align="center" style="color:#ffffff">Age    : <input type="text" name="AAge" /></p>
  <p align="center" style="color:#ffffff">Country: <input type="text" name="ACountry" /></p>
  <p align="center" style="color:#ffffff"><input type="submit" value="添加" /></p>
</form>


<form action="enter">

<p align="center"style="color:#ffffff">只创建AuthorID，其余为null</p>
 <p align="center"><input type="submit" value="仅创建ID号"></p>
</form>


</body>
</html>