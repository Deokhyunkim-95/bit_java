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

<h3> memu 클릭하세요</h3>

<div>

<c:if test="${empty login}">
   <h3><a href="./login.jsp" > LOGIN </a></h3> 
</c:if>

<c:if test="${!empty login}">
   <h3><a href="./logout.do" > LOGOUT</a> </h3>
   <h3><a href="./bookform.jsp" > 도서등록 폼</a></h3> 
   <h3><a href="./listBook.do" > 도서목록</a> </h3>
</c:if> 

</div>
</section>
</div>

<%@include file="common/footer.jsp" %>

</body>
</html>