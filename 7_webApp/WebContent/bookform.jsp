<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="css/prob1.css">
<link rel="stylesheet" href="css/table.css">
<link rel="stylesheet" href="css/button.css">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div id="output">
<section>
<h3> book 등록 폼</h3>
<form action="insertBook.do" method="post">
   제 목 : <input type="text" id="bookname" name="bookname"> <br><br>
  출 판 사 : <input type="text" id="publisher" name="publisher"> <br><br>
  가 격 : <input type="number" id="price" name="price"> <br><br>
  <input type="submit" value="등록">
  <input type="reset" value="초기화">
  
</form>

</section>
</div>
<%@include file="common/footer.jsp" %>

</body>
</html>