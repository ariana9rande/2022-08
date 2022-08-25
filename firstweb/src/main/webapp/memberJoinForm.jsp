<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member join form</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="memberJoin" method="post">
		아이디 : <input type="text" name="id"><br>
		이름 : <input type="text" name="name"><br>
		비밀번호 : <input type="password" name="password"><br>
		이메일 : <input type="email" name="email"><br>
		<input type="submit" value="회원가입">
		<input type="reset" value="취소">
	</form>
</body>
</html>