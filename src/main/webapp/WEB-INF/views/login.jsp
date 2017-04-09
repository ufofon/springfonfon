<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 로그인 </h1>
<p>
   <%
     String  errCode = request.getParameter("err");
   
      if(errCode !=  null)
      {
    	  out.println(" 아이디 또는 비밀번호가 틀렸습니다.");
      }
   %>
</p>

<form   action="doLogin"  method="post">
   아이디 : <input  type="text"  name="loginId" /><br/>
   패스워드 : <input  type="password"  name="password" /><br/>
   <input   type="submit"  value="로그인" />
   <input   type="reset"  value="취소" />

</form>



</body>
</html>