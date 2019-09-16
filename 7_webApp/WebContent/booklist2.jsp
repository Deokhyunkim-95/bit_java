
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book list</title>
<link type="text/css" rel="stylesheet" href="./css/table.css">
</head>
<body>

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
</table>




</body>
</html>