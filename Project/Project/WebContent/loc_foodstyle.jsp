<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Food Style - Select the Location</title>
<link rel=" shortcut icon" href="./img/favicon.ico">
<link rel="icon" href="./img/favicon.ico">


<link type="text/css" rel="stylesheet" href="./css/foodie.css">
<link type="text/css" rel="stylesheet" href="./css/loc.css">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link
	href="https://fonts.googleapis.com/css?family=Do+Hyeon&display=swap"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- 
<script src="./js/loc.js"></script>
-->

<script src="./js/select_loc.js"></script>

</head>

<body>
	<div id="main">

		<div id="header">
		<%@include file="/common/header.jsp"%>
		</div>
		
		<div id="select_box">

		<form action="loc_foodstyle.do">
			<div id="LocationFilter">
				<nav class="LocationFilter_RegionNav">

					<p>지역을 선택하세요</p>
					
					<div id="selection">	
					
					<select name="loc1" id="loc1" onchange="showLoc(this, 'loc2')">
						<option value="default">지역선택</option>
						<option value="강남">강남</option>
						<option value="강북">강북</option>
					</select> <select name="loc2" id="loc2">
						<option value="default">도시선택</option>
					</select> <input type="submit" value="선택" class="loc_btn"> <input type="reset"
						value="다시 선택" class="loc_btn">
						
					</div>
						
				</nav>
			</div>

		</form>


	</div>
	


</div>
</body>
</html>