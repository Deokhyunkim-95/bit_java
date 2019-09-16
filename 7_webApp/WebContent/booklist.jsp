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

<h3>book list</h3>

<table class="tablea">
<tr> <th>bookid</th><th>bookname</th><th>publisher</th><th>price</th></tr>
<c:forEach var="data" items="${booklist}">
   <tr> 
        <td> ${data.bookid} </td>
        <td> ${data.bookname} </td>
        <td> ${data.publisher} </td>
        <td> ${data.price} </td>
   </tr>
</c:forEach>
<%-- ${}->el표현식  --%>
</table>


</section>
</div>

<%@include file="common/footer.jsp" %>

</body>
</html>