<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
 <c:set  var="ctx"  value="${pageContext.request.contextPath}"/> 
   
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>공지사항 등록</title>
</head>
<body>
<h1> 공지 사항 등록   </h1>
<form   action="${ctx}/notice"  method="post">
  제목 :    <input  type="text"  name="title"><br/>
  내용 :   <textarea 
           name="contents"  rows="5"  cols="80">
          </textarea><br/>
   <input   type="submit"  value="등록" />
   <input   type="reset"  value="취소" />
    
</form>


</body>
</html>