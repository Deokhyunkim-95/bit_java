<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:query var="rs" dataSource="jdbc/oracle">
	select * from emp
</sql:query>

<table border="1">
	<c:forEach var="data" items="${rs.rows}">
		<tr>
			<td> ${data.ename} </td> 	
			<td> ${data.job} </td> 	
		</tr>
	</c:forEach>
</table>

</body>
</html>