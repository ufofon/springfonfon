<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@  page import="com.oraclejava.alpha.security.LoginUser"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%
	LoginUser loginUser = LoginUser.getLoginUser();
	request.setAttribute("loginUser", loginUser);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Main fonfon33 Page</h1>

	<ul>
		<c:choose>
			<c:when test="${loginUser == null}">
				<li><a href="${ctx}/login">로그인2</a></li>
			</c:when>
			<c:otherwise>
			<li>${loginUser.username}: <a href="${ctx}/logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
	</ul>

	<ul>
		<li><a href="${ctx}/notice">공지사항</a></li>
		<li><a href="${ctx}/user">사용자</a></li>

	</ul>


</body>
</html>