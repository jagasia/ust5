<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello welcome to MVC project
<form action="add">
Number 1: <input type="number" name="no1" value="${no1 }" /><br/>
Number 2: <input type="number" name="no2" value="${no2 }" /><br/>
<input type="submit" value="Add" />
<div>
${result }
<br/>
<a href="branch" >Branch Page</a>
</div>
</form>
</body>
</html>