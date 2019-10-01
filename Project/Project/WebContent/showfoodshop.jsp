<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="json_jdbc.JsonDB"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width = device-width, initial-scale=1">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maps.google.com/maps/api/js?sensor=false"></script>
<link href="https://fonts.googleapis.com/css?family=Luckiest+Guy&display=swap" rel="stylesheet">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link href="https://fonts.googleapis.com/css?family=Julius+Sans+One|Luckiest+Guy&display=swap" rel="stylesheet">
<!-- <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=cf7b76e3a2c369d74d6fed8c89980981"></script> -->

<link rel="stylesheet" href="./css/foodie2.css"> 
<title>Restaurant Info.</title>
<style type="text/css">

@import url('https://fonts.googleapis.com/css?family=Do+Hyeon|Nanum+Gothic&display=swap');


body {
	background-color: #F2D283;
		font-family: 'Do Hyeon', sans-serif;
}
#map {
	width: 400px;
	height: 400px;
}
.h3 {
	text-align: center;
	
	/*
	font-family: 'Black Han Sans', sans-serif;
	font-family: 'Luckiest Guy', cursive;
	*/
	font-family: 'Do Hyeon', sans-serif;
	font-weight: bold;
	font-size: 30pt;
	letter-spacing: 10px;
}
.btn {
	margin: 0 auto;
	text-align: center;
	border-radius: 20px;
	height: 50px;
	width: 90px;
	font-size: 11pt;
	background-color: #EDA900;  
	border: 0px;
	color: white;
	font-family: 'Julius Sans One', sans-serif;
}
table {
	margin-left: 80px;
	font-size: 17pt;
	font-family: 'Do Hyeon', sans-serif;
	color: #353535;
	
}
.td {
	padding-right: 20px;
	padding-bottom: 13px;
}
.td2 {
	padding-right: 50px;
}
.tdc{
	padding-right: 80px;
}
</style>
</head>
<body>
	<div id="main">


<div id="header">
 	<%@include file="/common/header.jsp"%>
</div>

	<c:forEach var="data" items="${showfoodshop}">
	<table style="margin: 0 auto;">
	<tr>
	 <td class="tdc">
	 	<h3 class="h3">
			<i class='fas fa-drumstick-bite' style='font-size:30px'></i>
			${data.fname}
			<i class='fas fa-ice-cream' style='font-size:30px'></i>
		</h3>
	 </td> 
	
	<td>
		<c:forEach var="data" items="${showfoodshop}">
		<input type="button" onclick="location.href='review.jsp?fid=${data.fid}&fname=${data.fname}'" value="리뷰작성" class="btn">
		</c:forEach>
		<c:forEach var="data" items="${showfoodshop}">
		<input type="button" onclick="location.href='listreview.do?fid=${data.fid}&fname=${data.fname}'" value="리뷰보기" class="btn">
		</c:forEach>
	
	</td> 
	</tr>
	</table>
	</c:forEach>
	
	<hr> <br><br>
		<table id="table_show">
			<c:forEach var="data" items="${showfoodshop}">
				<tr>
					<td class="td">주소</td>
					<td class="td2">${data.address}</td>
					<td class="map" rowspan="5" id="map"
						style="width: 959px; height: 400px;"></td>
				</tr>
				<tr>
					<td class="td">전화번호</td>
					<td>${data.tel}</td>
				</tr>
				<tr>
					<td class="td">음식종류</td>
					<td>${data.foodstyle}</td>
				</tr>
				<tr>
					<td class="td">영업시간</td>
					<td>${data.octime}</td>
				</tr>
				<tr>
					<td class="td">휴일</td>
					<td>${data.holiday}</td>

				</tr>
			</c:forEach>
		</table>
		<br><br>
	
	
	<div id="footer">
 			<%@include file="/common/footer.jsp"%>
	</div>
	</div>
</body>

<script>
	let xname;
	let xlat;
	let xlng;

	navigator.geolocation.getCurrentPosition(initmap);
	
	function initmap() {
		$.ajax({
			url : "showfoodsdata.jsp?fname=${param.fname}",
			dataType : "json",
			type : "get",
			async: false,
			success : function(data) {

				xname = data.fname;
				xlat = data.latitude;
				xlng = data.longitude;
				
				xlat = parseFloat(xlat);
				xlng = parseFloat(xlng);
						
				console.log(data);
				console.log(xname);
				console.log("xlat"+xlat);
				console.log("xlng"+xlng);
				
			},
			error : function(error) {
				alert("에러..." + error)
			}
		});
		
		console.log("xlat1"+xlat);
		console.log("xlng1"+xlng);
		
		  let p = { 
			lat : xlat,
			lng : xlng
		
		}; 

		 let map = new google.maps.Map(document.getElementById("map"), {
			zoom : 14,
			center : p
		});

		let marker = new google.maps.Marker({
			position : p,
			map : map,
			label : xname
		});  
		
		/* var container = document.getElementById('map'), // 카카오 marker x
		options = {
				
				center : new kakao.maps.LatLng(xlat,xlng),
				level:3
				
		};
		var map = new kakao.maps.Map(container,options);
		
		var markerPosition = new kakao.maps.LatLng(xlat,xlng);
		
		var marker = new kakao.maps.Marker({
			position:markerPosition
		});
		
		marker.setMap(map); */
		 
		 
		/*  var markerPosition = new kakao.maps.LatLng(xlat,xlng);
		 
		 var markers = [
			 {
				 position:markerPosition,
				 text:xname
			 }
		 ];
		 
		 var staticmapcontainer = document.getElementById('map'),
		 	staticmapoption={
			 
			 center : new kakao.maps.LatLng(xlat,xlng),
			 level : 3,
			 marker : markers
	
		 };
		 
		 var map = new kakao.maps.StaticMap(staticmapcontainer,staticmapoption) ;
		  */
		
	} 
</script>

</html>