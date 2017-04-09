<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
 <c:set  var="ctx"  value="${pageContext.request.contextPath}"/> 
    
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>공지 사항</title>
</head>
<body>

<h1> 공지 사항 </h1>

<table>
 <thead>
  <tr>
    <th>아이디</th>
    <th>제목</th>
    <th>내용</th>
    <th>작성자</th>
    <th>등록일</th>
  </tr>
 </thead>
 
 <tbody>
  <c:forEach var="notice"  items="${notices}" >
   <tr>
    <td>${notice.id}</td>
    <td><a href="${ctx}/notice/${notice.id}">${notice.title}</a></td>
    <td>${notice.contents}</td>
    <td>테스트</td>
  </tr>
  </c:forEach>
</tbody>

</table>

<a href="notice/new">등록</a>

</body>
</html>