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
<form action="addPro.gyc" method="post">
商品名称:<input name="proName"><br>
商品价格:<input name="price"><br>
商品描述:<input name="descri"><br>
商品名称:<select name="typeId">
<c:forEach items="${allType }" var="t">
<option value="${t.tid }">${t.proTypeName }</option>
</c:forEach>
</select><br>
<input type="submit" value="保存">
</form>
</body>
</html>