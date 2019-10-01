<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<meta charset="UTF-8">
<title>Review List	</title>
<link type="text/css" rel="stylesheet" href="./css/foodie.css">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Do+Hyeon|Nanum+Gothic&display=swap');

*	{
	font-family: 'Do Hyeon', sans-serif;
}

body{
	margin: 0;
}



#wrapper {
	margin-top: 30px;
	margin-bottom: 50px;
	width: 100%;
	text-align: center;	
}


#btn1, #btn2{
	background-color: orange;
	color: white;
	font-size: 15pt;
	margin: 10px;
	padding: 10px;
	border-radius: 10px;
}



#header{

	height: 10%;
}

#main_body{

	height: 90%;
}


#fname{

	margin-top: 200px;
	width: 40%;
	height: 300px;
	margin: 0 auto;
}

#fname_text{
	padding-top: 140px;
	text-align: center;
	font-size: 40px;
	color: orange;
}


footer {
	position: absolute;
	text-align: center;
	left: 300px;
	bottom: 50px;
	font-family: 'Nanum Gothic', sans-serif;
}

img {
	width: 200px;
	height: 200px;
}


.div {
	border-top: 1px solid #BDBDBD;
}

.div0 {
	margin: 0 auto;
	text-align: center;
	height: 500px;
	width: 600px;
}

#td {
	width: 400px;
	height: 200px;
	font-size: 15pt;
	/* border: 1px solid #BDBDBD;  */
}

#td1 {
	text-align: center;
}

table {
	/* border-top: 1px solid #BDBDBD; */
	
}

.button.primary {
	background: #83d3c9;
	border-color: #83d3c9;
	color: #fff !important;
}

input[type="button"].primary, button.primary:hover, .button.primary:hover
	{
	background: #96dad1 !important;
	border-color: #96dad1 !important;
}




</style>
</head>
<body>

 <div id="main">

	<div id="header">

	<%@include file="/common/header.jsp"%>
	</div>
	
	<div id="main_body"> 

			<div class="w3-sidebar w3-bar-block w3-card" style="width: 15%; height: 400px; top: 30%; right: 0;">

			<fieldset id="search" style="background-color: #F6F7F5">
					<legend>Search it!</legend>
					
					<form action="fname.do" method="post">
					<input type="text" name="keyword" id="search_box" placeholder="Type to Search"/> 
					<input type="submit" value="search" id="search_btn"  />
					</form>
				</fieldset>

			<fieldset id="contact" style="background-color: #F6F7F5">
				<legend class="name">Contact us!</legend>

				<!--누르면 이메일 보낼 수 있는 링크-->
				<a href="mailto:juhyun.kim@lindsey.edu?subject=Feedback" id="email">Email
					to us <i style='font-size:20px' class='far'>&#xf044;</i></a> <br>

			</fieldset>
			
			<fieldset id="bookmark" style="background-color: #F6F7F5">
				<legend> Bookmark</legend>
				<div id="wrapper">
				<a id="btn1" onclick="location.href='Showfoodshop.do?fname=<%=request.getParameter("fname")%>'">돌아가기</a>
				<a id="btn2" onclick="window.scrollTo(0,0)"> 상단으로 </a>
			</div>
				
			
			</fieldset>
			
		</div>


	
		<section>
			
			<div id="fname">
			
					<p id="fname_text"><%= request.getParameter("fname") %> Reviews</p>
			</div>
			
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
		</section>
	
	</div>
	</div>
</body>
</html>