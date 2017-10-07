<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <html lang="en-US"> -->

<head>
<title>Library System</title>
<meta charset="UTF-8">


</head>


<body background= "ChMkJlbKwaKIb92QAAhjIDNqIGgAALGbQM4gVIACGM4869.jpg">

<h1 align="center"style="color:#ffffff">Database Of Book</h1>
<hr>

<p align="center"style="color:#FF1493">提示：${tishi}</p>

<br>

<hr>
<h2 align="center"style="color:#ffffff">搜索</h2>
<p align="center"style="color:#ffffff">输入作者の名字</p>
<form action="Search" method="get">
    <p align="center"style="color:#ffffff">name: <input type="text" name="AthrNmS" /></p>
    <p align="center"align="center"><input type="submit" value="确认" /></p>
</form>


<hr>
<h2 align="center"style="color:#ffffff">插入</h2>
<p align="center"style="color:#ffffff">输入书本の信息</p>
<form action="ADD" method="get">
  	<p align="center"style="color:#ffffff">ISBN: <input type="text" name="ISt"   required="required"/></p>
 	<p align="center"style="color:#ffffff">Title: <input type="text" name="Tit" required="required"/></p>
	<p align="center"style="color:#ffffff">AuthorID: <input type="text" name="Aut"  pattern="[0-9]*" required="required"/></p>
 	<p align="center"style="color:#ffffff">Publisher: <input type="text" name="Pst"  required="required"/></p>
  	<p align="center"style="color:#ffffff">PublishDate: <input type="text" name="Pdt" placeholder="20160925(8 numbers only)"  required="required"/></p>
  	<p align="center"style="color:#ffffff">Price: <input type="text" name="Prt" pattern="^[0-9]+(.[0-9])?([0-9])?$"required="required"/></p>
  	<p align="center"><input type="submit"  value="添加"/></p>
</form>



<hr>
<h2 align="center"style="color:#ffffff">查看所有の书本</h2>
<form action="Searchall" method="get">
    <p align="center"><input type="submit" value="确认" /></p>
</form>



</body>
</html>