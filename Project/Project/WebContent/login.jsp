<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/login.css">
<style type="text/css">

h3{
text-align: center;
font-family: Poiret One;
}

#login{
text-align: center;
border-collapse: collapse;
border : 1px solid transparent;
border-radius: 30px 70px;
	background-color: #FDAD5E;
margin: 0 auto;
width: 300px;
height: 220px;
font-family: Darker Grotesque;
font-size: 14pt;
}
#id{
	border: 1px solid #FDAD5E;
}
#pw{
	border: 1px solid #FDAD5E;
}
.log{
width: 100px;
}

#tttr{
height: 70px;
}

.btn1{
width: 70px;
height: 30px;
border-radius: 7px;
border : 1px solid transparent;
background-color: white;
font-family: Darker Grotesque;
font-size: 12pt;
    font-weight: bold;
}

#btn2{

    color: black;
 
    }

</style>

</head>
<body>

<div id="output">
<section>

<h3> L O G I N </h3>

<form action="login.do" method="post" onsubmit="return check()">
   <table border="1" id="login">
      <tr>
         <td> <label for="id"> ID </label> </td>
         <td> <input type="text" id="id" name="id" value="${id}" class="log" /> </td>
      </tr>
      <tr id="ttr">
         <td> <label for="pw"> PASSWORD </label> </td>
         <td> <input type="password" id="pw" name="pw" value="" class="log" /> </td>
      </tr>
      <tr id="tttr">
         <td colspan="2"> 
             <input class="btn1" type="submit" value="LOGIN">
             <input class="btn1" type="reset" value="CLEAR"><br>
             <a href="join.html" id="btn2">CREATE ACCOUNT</a><br>
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
	  if(id.value.trim().length < 3 ){
		  alert("ID 3글자이상입력하세요");
		  id.focus();
	      return false;
	  }
	  
	  return true;
   }
</script>

</body>
</html>