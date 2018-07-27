<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<a href="getAllType.gyc">添加</a>
<form action="" method="post">
商品名称:<input name="proName" >
商品类型:<select name="typeId">
<c:forEach items="${allType }" var="t">
<option value="${t.tid }">${t.proTypeName }</option>
</c:forEach>
</select>
商品价格:<input name="price">
<input type="submit" value="查询">
</form>
</div>
<table border="1" align="center">
<tr>
<td>商品名称</td>
<td>商品价格</td>
<td>商品类型</td>
<td>操作</td>
</tr>
<c:forEach items="${allPro }" var="p">
<tr>
<td>${p.proName }</td>
<td>${p.price }</td>
<td>${p.proTypeName }</td>
<td><a href="getPro.gyc?pid=${p.pid }">查看详情</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>