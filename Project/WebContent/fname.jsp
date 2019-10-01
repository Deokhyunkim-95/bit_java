<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<body lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title> Search by Name Result</title>



<link type="text/css" rel="stylesheet" href="./css/foodie.css">
<link type="text/css" rel="stylesheet" href="./css/fname.css">
<link
	href="https://fonts.googleapis.com/css?family=Merriweather&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Amatic+SC">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>

<body>
	<div id="main">
		<div id="header">
		<%@include file="/common/header.jsp"%>
	</div>
	<div id="main_body">
	
		<p id="title_fname"><span>" ${fname} " &nbsp;</span>검색 결과</p>
	
	
		<div class="w3-sidebar w3-bar-block w3-card" style="width: 15%; height: 250px; right: 0;">

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
		</div>
	
	
	
	
	

		<!-- 가게 이름 검색 시 결과 -->				
			<div id="list_fname">
			
				<c:forEach var="data" items="${fname_list}">
					<div id="fname_row">

						<div>
							<img alt="${data.fname}" src="${data.image}" id="loc_img" style="width: 400px; height: 400px;">
						</div>
						<div id="fname_fname">
							<a href="Showfoodshop.do?fname=${data.fname}">${data.fname}</a>
						</div>

						<div id="fname_foodstyle">
						<span> 음식 종류: </span><a href="fname.do?foodstyle=${data.foodstyle}">${data.foodstyle}</a>
						</div>
						
						<div id="fname_loc">
						<span> 지역: </span> <a href="fname.do?loc=${data.loc}">${data.loc}</a>
						</div>
					</div>

				</c:forEach>
			</div>

		</div>
<!-- 		<div id="footer"> -->
<%-- 		<%@include file="/common/footer.jsp"%> --%>
<!-- 		</div> -->
	</div>
</body>
</html>