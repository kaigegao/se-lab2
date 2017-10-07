<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body background="ChMkJlbKwaKIb92QAAhjIDNqIGgAALGbQM4gVIACGM4869.jpg">
<form action="enter">
<input type="submit" value="Back">
</form>
<h1 align="center" style="color:#ffffff">更新</h1>
<p align="center" style="color:#ffffff">你现在可以更改信息</p>
 <form action="UpBook" method="get">
<table align="center" width="600" border="2" style="color:#ffffff">
 <tr>
  <th align="center" style="color:#ffffff">ISBN</th>
  <th align="center" style="color:#ffffff">Title</th>
  <th align="center" style="color:#ffffff">AuthorID</th>
  <th align="center" style="color:#ffffff">Publisher</th>
  <th align="center" style="color:#ffffff">PublishDate</th>
  <th align="center" style="color:#ffffff">Price</th>

 </tr>

 <s:iterator value = "srst" var= 'it'>
 <input type="hidden" name="ISt" value ='${it.ISBN}'/>
 <tr>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.ISBN'/></th>
	<th align="right" style="color:#ffffff"><s:property value= '#it.Title'/></th>
 	<th><input type="text" name="Aut" value ='${AuthorID}'/></th>
 	<th><input type="text" name="Pst" value ='${Publisher}'/></th>
 	<th><input type="text" name="Pdt" value ='${PDate}' /></th>
 	<th><input type="text" name="Prt" value ='${Price}'/></th>
 	<th><input type="submit" value="确认" /></th>
 </tr>
</s:iterator>
</table>
</form>

</body>
</html>