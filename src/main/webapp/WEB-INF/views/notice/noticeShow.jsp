<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
 <c:set  var="ctx"  value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 공지 사항</h1>


  아이디 : ${notice.id } <br/>
  제목 : ${notice.title } <br/>
  내용 : ${notice.contents } <br/>

<form   id="deleteForm"
        action="${ctx}/notice/${notice.id}/delete"
        method="post">
</form>

<button  onclick="document.getElementById('deleteForm').submit();">삭제</button>
<a href="${ctx}/notice/${notice.id}/edit">수정</a>
<a href="${ctx}/notice">뒤로가기</a>


</body>
</html>