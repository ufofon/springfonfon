<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles"  uri="http://tiles.apache.org/tags-tiles" %>    
<c:set var="ctx" value="${pageContext.request.contextPath}" />  
 
    
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
  <link  rel="stylesheet"  href="${ctx}/css/common.css">
<%-- 
<title> <tiles:insertAttribute  name="title" /></title> --%>
</head>
<body>
   <tiles:insertAttribute  name="header" />
   
  <hr>
  
  <tiles:insertAttribute name="body" />
  <hr>

  <tiles:insertAttribute name="footer" />

</body>
</html>