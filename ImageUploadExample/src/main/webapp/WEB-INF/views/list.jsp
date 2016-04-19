<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
test
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr> 
		<td>이름</td>
		<td>내용</td>
		<td>첨부파일</td> 
	<tr>
	<c:forEach items="${list}" var="dto">
	<tr>  
		<td>${dto.name}</td>
		<td>${dto.content}</td>   
		<td><img src="${pageContext.request.contextPath}/resources/temp/${dto.fileData}.gif" /></td>
		
	<tr>
	</c:forEach>
</table>
<p><a href="write">글작성</a></p>
</body>
</html>