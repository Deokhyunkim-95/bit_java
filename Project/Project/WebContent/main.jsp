<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width = device-width, initial-scale=1">

<style type="text/css">
</style>
<link rel="stylesheet" href="./css/main.css">
<link rel="stylesheet" href="./css/foodie.css">
<link rel=" shortcut icon" href="./img/favicon.ico">
<link rel="icon" href="./img/favicon.ico">
<link rel='stylesheet'
	href='https://use.fontawesome.com/releases/v5.7.0/css/all.css'
	integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ'
	crossorigin='anonymous'>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<script src="./js/popup.js"></script>

<title>Eat Me Main Page</title>
</head>
<body>
	<div id="header">

		<%@include file="/common/header2.jsp"%>
	</div>


	<div class="backgroundTransition">
		<div class="jamie">
			<div id="title">
				<p id="main_title">
					Eat Me! <i style='font-size: 50px' class='fas'>&#xf818;</i>
				</p>

				<p id="main_description">솔직한 리뷰, 믿을 수 있는 평점!</p>

				<div id="cover">
					<form action="fname.do" method="post">
						<div class="tb">
							<div class="td">
								<input type="text" name="keyword" id="search_box">
							</div>
							<div class="td" id="s-cover">
								<button type="submit" value="검색">
									<div id="s-circle"></div>
									<span></span>
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>



	<div id="main1">
		<p class="menu">
			Eat Deal <i style="font-size: 40px" class="fa">&#xf155;</i>
		</p>

		<div id="eatdeal_frame">
			<div id="eatdeal_row1">
				<div class="eatdeal_data">
					<a href="./main_eatdeal.do?discount=10" class="btn"> <img
						class="img" src="./img/pizza.jpg"> <span>10% 할인 </span></a>
				</div>

				<div class="eatdeal_data">
					<a href="./main_eatdeal.do?discount=15" class="btn"> <img
						class="img" src="./img/salad.jpg"> <span>15% 할인 </span>
					</a>
				</div>

				<div class="eatdeal_data">
					<a href="./main_eatdeal.do?discount=20" class="btn"> <img
						class="img" src="./img/salmon.jpg"> <span>20% 할인 </span>
					</a>
				</div>

			</div>

			<div id="eatdeal_row2">
				<div class="eatdeal_data">
					<a href="./main_eatdeal.do?discount=30" class="btn"> <img
						class="img" src="./img/tomatoes.jpg"> <span>30% 할인 </span>
					</a>
				</div>

				<div class="eatdeal_data">
					<a href="./main_eatdeal.do?discount=50" class="btn"> <img
						class="img" src="./img/steak.jpg"> <span>50% 할인 </span></a>
				</div>

				<div class="eatdeal_data">
					<a href="loc_eat_deal.jsp" class="btn"> <img class="img"
						src="./img/salmon2.jpg"> <span>더보기 </span></a>
				</div>
			</div>

		</div>


	</div>
	<div id="main2">
		<p class="menu">
			맛집 리스트 <i style='font-size: 40px' class='fas'>&#xf80f;</i>
		</p>

		<div id="foodstyle_frame">
			<div id="foodstyle_row1">
				<div class="foodstyle_data">
					<a href="./main_foodstyle.do?food=한식" class="btn"> <img
						class="img" src="./img/koreanfood.jpg"> <span>한식 </span></a>
				</div>

				<div class="foodstyle_data">
					<a href="./main_foodstyle.do?food=브런치" class="btn"> <img
						class="img" src="./img/brunch.jpg"> <span>브런치 </span></a>
				</div>

				<div class="foodstyle_data">
					<a href="./main_foodstyle.do?food=양식" class="btn"> <img
						class="img" src="./img/italianfood.jpg"> <span>양식 </span></a>
				</div>

			</div>

			<div id="foodstyle_row2">
				<div class="foodstyle_data">
					<a href="./main_foodstyle.do?food=고기" class="btn"> <img
						class="img" src="./img/bbq.jpg"> <span>고기 </span></a>
				</div>

				<div class="foodstyle_data">
      			<a href="./main_foodstyle.do?food=무한리필"class="btn"> 
      			<img class="img" src="./img/buffet.jpg">
      			<span>무한리필</span></a>		
      		</div>
      		
      		<div class="foodstyle_data">
      			<a href="loc_foodstyle.jsp"class="btn">
      			<img class="img" src="./img/dessert.jpg">
      			<span>더보기</span></a>		
      		</div>
			</div>

		</div>


	</div>

	<div id="footer">
		<%@include file="/common/footer.jsp"%>
	</div>


	<script type="text/javascript">
		let images = new Array('./img/2.jpg', './img/3.jpg', './img/4.jpg',
				'./img/5.jpg', './img/6.jpg', './img/7.jpg', './img/8.jpg',
				'./img/9.jpg', './img/10.jpg', './img/11.jpg', './img/12.jpg');

		let nextimage = 0;

		doSlideshow();

		function doSlideshow() {
			if (nextimage >= images.length) {
				nextimage = 0;
			}
			$('.backgroundTransition').css('background-image',
					'url("' + images[nextimage++] + '")').fadeIn(1000,
					function() {
						setTimeout(doSlideshow, 2000);
					});
		}
	</script>

</body>
</html>