<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="output">
<section>

<h3> login form </h3>

<form action="login.do" method="post" onsubmit="return check()">
   <table border="1">
      <tr>
         <td> <label for="id"> ID </label> </td>
         <td> <input type="text" id="id" name="id" value="${id}" /> </td>
      </tr>
      <tr>
         <td> <label for="pw"> PW </label> </td>
         <td> <input type="password" id="pw" name="pw" value="" /> </td>
      </tr>
      <tr>
         <td colspan="2"> 
             <input type="submit" value="로그인">
             <input type="reset" value="취소">
             <a href="join.html">회원 가입</a>      
             <span style="color: red;">${msg}</span>   
         </td>
      </tr>
   </table>
</form>




</section>
</div>

<script>
   function check() {
	  let id =  document.querySelector("#id");
	  let pw =  document.querySelector("#pw");
	  if(id.value.trim().length < 5 ){
		  alert("ID 5글자이상입력하세요");
		  id.focus();
	      return false;
	  }
	  
	  return true;
   }
</script>

</body>
</html>