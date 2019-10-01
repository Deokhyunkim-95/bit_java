<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Eat Deal</title>



<link type="text/css" rel="stylesheet" href="./css/foodie.css">
<link type="text/css" rel="stylesheet" href="./css/eat_deal.css">

<link rel=" shortcut icon" href="./img/favicon.ico">
<link rel="icon" href="./img/favicon.ico">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Amatic+SC">


<script src='https://kit.fontawesome.com/a076d05399.js'></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="./js/foodie.js"></script>

</head>

<body>
	<div id="main">
		<div id="header">

		<%@include file="/common/header.jsp"%>
		</div>
		<div id="main_body">
		
			<p id="title_eatdeal">
			<i style='font-size:40px' class='fas'>&#xf805;</i>
			Eat Deal 
			<i style='font-size:40px' class='fas'>&#xf818;</i></p>

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
			

			<form action="eatdeal.do">
			
				<div id="discount_bar">

					<span id="discount_rate">할인율 : </span> <select name="discount_list"
						id="discount_list">
						<option value="ALL" class="discount_options" selected>ALL</option>
						<option value="10" class="discount_options">10% OFF</option>
						<option value="15" class="discount_options">15% OFF</option>
						<option value="20" class="discount_options">20% OFF</option>
						<option value="30" class="discount_options">30% OFF</option>
						<option value="50" class="discount_options">50% OFF</option>
					</select> 
					  <input type="submit" value="찾기" id="submit_btn"> 
					  <input type="reset" value="다시 찾기" id="reset_btn">
				</div>
			</form>
			

			<p id="title_loc"><span>" ${loc} ${discount}" &nbsp;</span>검색 결과</p>

			
			 <!-- 지역 선택 시 결과 -->				
			
				<c:forEach var="data" items="${loc_eatdeal_list}">
				<div id="list_loc">
					<div id="loc_row">

						<div>
							<img alt="${data.fname}" src="${data.image}" id="loc_img" style="width: 450px; height: 450px;">
						</div>
						<div id="loc_fname">
							<a href="Showfoodshop.do?fname=${data.fname}">${data.fname}</a>
						</div>

						<div id="loc_foodstyle">
						<a href="Showfoodshop.do?fname=${data.fname}"> <span> 음식 종류: </span>${data.foodstyle}</a>
						</div>
						
						<div id="loc_loc">
						<a href="Showfoodshop.do?fname=${data.fname}"> <span> 지역: </span> ${data.loc}</a>
						</div>
					</div>
					</div>
				</c:forEach>
		
			
			
			<!-- 할인율 선택 시 결과 -->
			
				<c:forEach var="data" items="${eat_deal_list}">
				<div id="list_discount">
					<div id="discount_row">

						<div id="discount_discount">
							<a href="Showfoodshop.do?fname=${data.fname}">${data.discount}</a>
							<span>% 할인</span>
						</div>

						<div>
							<img alt="${data.fname}" src="${data.image}" id="eat_deal_img" style="width: 400px; height: 400px;">
						</div>
						<div id="discount_fname">
							<a href="Showfoodshop.do?fname=${data.fname}">${data.fname}</a>
						</div>

						<div id="discount_foodstyle">
						<a href="Showfoodshop.do?fname=${data.fname}"> <span> 음식 종류: </span>${data.foodstyle}</a>
						</div>
						
						<div id="discount_loc">
						<a href="Showfoodshop.do?fname=${data.fname}"> <span> 지역: </span> ${data.loc}</a>
						</div>
					</div>
					</div>
				</c:forEach>           
		



		</div>
		<div id="footer">
			<%@include file="/common/footer.jsp"%>
		</div>
	</div>
</body>
</html>