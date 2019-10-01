<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#wrapper {
	width: 100%;
}

.btn {
	position: relative;
	margin: -20px -50px;
	top: 50%;
	left: 50%;
}

* {
	background-color:;
}

h3 {
	text-align: center;
}

img {
	width: 150px;
	height: 150px;
}

.div {
	border-top: 1px solid #BDBDBD;
}

.div0 {
	margin: 0 auto;
	text-align: center;
	height: 350px;
	width: 500px;
}

#td {
	width: 400px;
	height: 100px;
	/* border: 1px solid #BDBDBD;  */
}

#td1 {
	text-align: center;
}

table {
	/* border-top: 1px solid #BDBDBD; */
	
}
</style>
</head>
<body>
	<div>
		<section>
			<h3>리뷰</h3>
			<c:forEach var="data" items="${reviewlist}">
				<div class="div">
					<div class="div0">
						<table>
							<tr>
								<td rowspan="3" style="width: 70px;"><i
									class="material-icons" style="font-size: 60px; color: #BDBDBD">person_outline</i><br>
									&nbsp;&nbsp;&nbsp;${data.userid}</td>
								<td style="font-size: 12pt; color: #A6A6A6; padding-top: 15px;">${data.pubdate}</td>
								<td rowspan="2"><c:if test="${data.eval == 'good'}">
										<i class="material-icons"
											style="font-size: 60px; color: #FFBB00">sentiment_very_satisfied</i>
									</c:if> <c:if test="${data.eval == 'normal'}">
										<i class="material-icons"
											style="font-size: 60px; color: #FFBB00">sentiment_satisfied</i>
									</c:if> <c:if test="${data.eval == 'bad'}">
										<i class="material-icons"
											style="font-size: 60px; color: #FFBB00">sentiment_very_dissatisfied</i>
									</c:if></td>
							</tr>
							<tr>
								<td id="td">${data.text}
								<td>
							</tr>
							<tr>
								<td id="td1"><img alt="${data.rid}" src="${data.image}">
								<td>
							</tr>
						</table>
					</div>
				</div>
			</c:forEach>
			<div id="wrapper">
				<input class="btn" type="reset"
					onclick="location.href='Showfoodshop.do?fname=<%=request.getParameter("fname")%>'"
					value="가게로 돌아가기">
			</div>
		</section>
	</div>
</body>
</html>