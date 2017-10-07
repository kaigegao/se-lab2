<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The result</title>
</head>

<body background="ChMkJlbKwaKIb92QAAhjIDNqIGgAALGbQM4gVIACGM4869.jpg">

<form action="enter">
<input type="submit" value="Back">
</form>
<h3 align="center"style="color:#ffffff">所查询の书:</h3>

<table align="center" width="600" border="0.5"style="color:#ffffff">
 <tr>
  <th align="center"style="color:#ffffff">ISBN</th>
  <th align="center"style="color:#ffffff">Title</th>
 </tr>
 <s:iterator value = "srst" var= 'it'>
 <tr>
 	<th align="right"style="color:#ffffff"><s:property value= '#it.ISBN'/></th>
	<th align="right"style="color:#ffffff"><a href ="QISBN.action?Isb=${it.ISBN}"><s:property value= '#it.Title'/></a></th>
	<th align="center"style="color:#ffffff"><a href ="Del.action?Dsb=${it.ISBN}">删除</a></th>
	<th align="center"style="color:#ffffff"><a href ="FindBook.action?Dsb=${it.ISBN}">更新</a></th>
 </tr>
</s:iterator>
</table>

</body>

</html>