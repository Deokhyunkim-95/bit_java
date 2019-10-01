<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<body lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title> Food Style</title>

<link rel=" shortcut icon" href="./img/favicon.ico">
<link rel="icon" href="./img/favicon.ico">

<link type="text/css" rel="stylesheet" href="./css/foodie.css">
<link type="text/css" rel="stylesheet" href="./css/foodstyle.css">
<link
	href="https://fonts.googleapis.com/css?family=Merriweather&display=swap"
	rel="stylesheet">
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

		<%@include file="/common/header.jsp"%>

	<div id="main_body">
	
		<p id="title_foodstyle">
		<i style='font-size:40px' class='fas'>&#xf805;</i>
		맛집 리스트
		<i style='font-size:40px' class='fas'>&#xf818;</i>
		</p>
	
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
	
	
		<form action="foodstyle.do">
	
		<div id="foodstyle_bar">
		
		<span id="foodstyle">음식 종류 : </span> <select name="foodstyle_list" id="foodstyle_list">
			<option value="한식"  class="foodstyle_options" >한식</option>	
			<option value="일식" class="foodstyle_options" >일식</option>	
			<option value="중식" class="foodstyle_options" >중식</option>	
			<option value="양식" class="foodstyle_options" >양식</option>	
			<option value="동남아" class="foodstyle_options" >동남아</option>	
			<option value="베지테리언" class="foodstyle_options" >베지테리언</option>	
			<option value="디저트" class="foodstyle_options" >디저트</option>	
			<option value="바" class="foodstyle_options" >바</option>	
			<option value="무한리필" class="foodstyle_options" >무한리필</option>	
			<option value="파스타" class="foodstyle_options" >파스타</option>	
			<option value="고기" class="foodstyle_options" >고기</option>	
			<option value="브런치" class="foodstyle_options" >브런치</option>	
			<option value="햄버거" class="foodstyle_options" >햄버거</option>	
			</select>
			<input type="submit" value="찾기" id="submit_btn"> 
			<input type="reset" value="다시 찾기" id="reset_btn">			
		</div>
		</form>

		<p id="title_loc"><span>" ${loc} ${foodstyle}" &nbsp;</span>검색 결과</p>

		<!-- 지역 선택 시 결과 -->				
			
			
				<c:forEach var="data" items="${loc_foodstyle_list}">
				
				<div id="list_loc">
					<div id="loc_row">

						<div>
							<img alt="${data.fname}" src="${data.image}" id="loc_img" style="width: 400px; height: 400px;">
						</div>
						<div id="loc_fname" style="">
							<a href="Showfoodshop.do?fname=${data.fname}">${data.fname}</a>
						</div>

						<div id="loc_foodstyle">
						<span> 음식 종류: </span><a href="loc_eatdeal.do?foodstyle=${data.foodstyle}">${data.foodstyle}</a>
						</div>
						
						<div id="loc_loc">
						<span> 지역: </span> <a href="loc_eatdeal.do?loc=${data.loc}">${data.loc}</a>
						</div>
					</div>
				</div>
				</c:forEach>
		
		
		<!-- 음식 스타일 선택 시 결과 -->
	
				<c:forEach var="data" items="${foodstyle_list}">
					<div id="list_foodstyle">
					<div id="foodstyle_row">

						<div>
							<img alt="${data.fname}" src="${data.image}" id="foodstyle_img" style="width: 400px; height: 400px;">
						</div>
						<div id="foodstyle_fname">			
							<a id="foodstyle_fname2" href="Showfoodshop.do?fname=${data.fname}">${data.fname}</a>
						</div>

						<div id="foodstyle_foodstyle">
						<span> 음식 종류: </span><a href="foodstlye.do?foodstyle=${data.foodstyle}">${data.foodstyle}</a>
						</div>
						
						<div id="foodstyle_loc">
						<span> 지역: </span> <a href="loc_eatdeal.do?loc=${data.loc}">${data.loc}</a>
						</div>
						
					</div>
				</div>
				
				</c:forEach>

		</div>
	<%@include file="/common/footer.jsp"%>
	</div>
</body>
</html>