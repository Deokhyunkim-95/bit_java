<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isErrorPage="true" %>

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

<h3> Error page</h3>
<h4 style="color: red;"> 서버 점검 중입니다. </h4>
<div style="color: red;"> <%= exception %> </div>
<div style="color: red;"> ${exception} </div>

</section>
</div>
<%@include file="common/footer.jsp" %>

</body>
</html>


