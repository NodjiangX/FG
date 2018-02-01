<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>demo</title>
</head>
<body>
<table>
<tr>
    <td>Id</td>
    <td>书名</td>
</tr>
<c:forEach items="${list}" var="book">
    <td>${book.bookId}</td>
    <td>${book.name}</td>
</c:forEach>
</table>
</body>
</html>