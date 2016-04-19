<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이미지 업로드</title>
</head>
<body>
	<form action="./complete" method="post" enctype="multipart/form-data">
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>제목</td> 
				<td><input type="text" name="name" /></td> 
			<tr>
			<tr>
				<td>내용</td> 
				<td><input type="text" name="content" /></td> 
			<tr>
			<tr>
				<td>라이터</td> 
				<td><input type="file" name="imageFile" /></td> 
			<tr>
			 
		</table>
		<input type="submit" value="전송">
	</form> 
</body>
</html>