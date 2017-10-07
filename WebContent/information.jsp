<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>作者的书</title>
</head>
<body background= "ChMkJlbKwaKIb92QAAhjIDNqIGgAALGbQM4gVIACGM4869.jpg">
<form action="enter">
<input type="submit" value="Back">
</form>
<s:iterator value = "srst1" var= 'it'>
<h1 align="center" style="color:#ffffff">书和作者の详细信息</h1>
</s:iterator>
<table align="center" width="700" border="1">
 <tr>
  <th align="center" width="100" style="color:#ffffff">ISBN</th>
  <th align="center" width="400" style="color:#ffffff">Title</th>
  <th align="center" width="100" style="color:#ffffff">Publisher</th>
  <th align="center" width="50" style="color:#ffffff">PublishDate</th>
  <th align="center" width="50" style="color:#ffffff">Price</th>
  <th align="center" width="50" style="color:#ffffff">AuthorID</th>
  <th align="center" width="100" style="color:#ffffff">Name</th>
  <th align="center" width="50" style="color:#ffffff"> Age</th>
  <th align="center" width="100" style="color:#ffffff">Country</th>
 </tr>
 <s:iterator value = "srst1" var= 'it'>
 <tr>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.ISBN'/></th>
	<th align="right" style="color:#ffffff"><s:property value= '#it.Title'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.Publisher'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.PDate'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.Price'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.AuthorID'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.Name'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.Age'/></th>
 	<th align="right" style="color:#ffffff"><s:property value= '#it.Country'/></th>
 	<th align="center" style="color:#ffffff"><a href ="Del.action?Dsb=${it.ISBN}">删除</a></th>
 	<th align="center" style="color:#ffffff"><a href ="FindBook.action?Dsb=${it.ISBN}">更新</a></th>
 </tr>

</s:iterator>

</table>
</body>
</html>