<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>商品编号</td>
<td>商品名称</td>
<td>商品价格</td>
<td>商品描述</td>
<td>商品类型</td>
</tr>
<tr>
<td>${pro.pid }</td>
<td>${pro.proName }</td>
<td>${pro.price }</td>
<td>${pro.descri }</td>
<td>${pro.proTypeName }</td>
</tr>
</table>
</body>
</html>