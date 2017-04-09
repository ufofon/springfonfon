<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>공지 사항 수정</h1>
	<form action="${ctx}/notice/${notice.id}" method="post">


	아이디 : ${notice.id } <br />
      제목 :<input type="text" name="title"	value="${notice.title}" /><br />
      내용 : <textarea rows="5" cols="50" name="contents">${notice.contents}
      </textarea>
		<br />
		<button type="submit">저장</button>
		<button type="reset">취소</button>
		<a href="${ctx}/notice/${notice.id}">뒤로가기</a>

	</form>


</body>
</html>