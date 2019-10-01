
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="./css/table2.css">
<style type="text/css">
/*table*/

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 1.5;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	border-radius: 20px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #E6E6E6;
	margin: 0 auto; /* 15% from the top and centered */
	padding: 20px;
	border: 1px solid #888;
	width: 45%; /* Could be more or less, depending on screen size */
	height: 85%;
	border-radius: 20px;
}
/* The Close Button */
.close {
	color: #aaa;
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: black;
	text-decoration: none;
	cursor: pointer;
}
</style>
<script src="./js/popup.js"></script>


<div class="w3-top w3-hide-small">
	<div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off"
		id="myNavbar">
		<ul>
			<li><a href="./main.jsp">Home</a></li>
			<li><a href="./loc_eat_deal.jsp">Eat Deal</a></li>
			<li><a href="./loc_foodstyle.jsp">맛집 리스트</a></li>
			<li class="dropdown"><a href="" id="dropmenu">More</a>
				<div class="dropdown-content">
					<c:if test="${empty login}">
						<a onclick="login()" class="drop_btn">Log-In</a>
					</c:if>
					<c:if test="${!empty login}">
						<a href="./logout.do" class="drop_btn">Log-out</a>
					</c:if>
					<c:if test="${empty login}">
						<a href="./join.html" class="drop_btn">Join</a>
					</c:if>
					<c:if test="${role =='admin'}">
						<a class="drop_btn" id="myBtn">regshop</a>
					</c:if>
				</div> <c:if test="${!empty login}">
					<li><a id="logininfo">${login} 님환영합니다.</a></li>
				</c:if>
				<div id="myModal" class="modal">
					<div class="modal-content">
						<span class="close">&times;</span>
						<h3>음식점 추가</h3>
						<form id="addshop" action="insertfoodshop.do" method="post"
							enctype="multipart/form-data">
							<table id="table" border="1">
								<tr>
									<td><label>이름</label></td>
									<td><input type="text" id="fname" name="fname"
										placeholder="가게 이름을 입력해주세요"></td>
								</tr>
								<tr>
									<td><label>주소</label></td>
									<td><input type="text" id="address" name="address"
										placeholder="주소를 입력해주세요"></td>
								</tr>
								<tr>
									<td><label>위도</label></td>
									<td><input type="text" id="latitude" name="latitude"
										placeholder="위도를 입력해주세요"></td>
								</tr>
								<tr>
									<td><label>경도</label></td>
									<td><input type="text" id="longitude" name="longitude"
										placeholder="경도를 입력해주세요"></td>
								</tr>
								<tr>
									<td><label>음식스타일</label></td>
									<td><select name="foodstyle" id="foodstyle">
											<option value="">스타일선택</option>
											<option value="한국">한국</option>
											<option value="일식">일식</option>
											<option value="중식">중식</option>
											<option value="양식">양식</option>
											<option value="동남아">동남아</option>
											<option value="베지테리언">베지테리언</option>
											<option value="디저트">디저트</option>
											<option value="바">바</option>
											<option value="무한리필">무한리필</option>
											<option value="파스타">파스타</option>
											<option value="고기">고기</option>
											<option value="브런치">브런치</option>
											<option value="햄버거">햄버거</option>
									</select></td>
								</tr>
								<tr>
									<td><label>이미지</label></td>
									<td><input type="file" name="img" multiple="multiple"></td>
								</tr>
								<tr>
									<td><label>위치한 지역</label></td>
									<td><select name="loc2" id="loc2">
											<option value="default">도시선택</option>
											<option value="강남역">강남역</option>
											<option value="가로수길">가로수길</option>
											<option value="동작/사당">동작/사당</option>
											<option value="방배/반포/잠원">방배/반포/잠원</option>
											<option value="송파/가락">송파/가락</option>
											<option value="여의도">여의도</option>
											<option value="신사/압구정">신사/압구정</option>
											<option value="영등포구">영등포구</option>
											<option value="광화문">광화문</option>
											<option value="연남동">연남동</option>
											<option value="홍대">홍대</option>
											<option value="종로">종로</option>
											<option value="이태원/한남동">이태원/한남동</option>
											<option value="합정/망원">합정/망원</option>
											<option value="용산/숙대">용산/숙대</option>
											
									</select></td>
								</tr>
								<tr>
									<td><label>할인</label></td>
									<td><select name="discount" id="discount">
											<option value="선택x">할인선택</option>
											<option value="0">0</option>
											<option value="10">10</option>
											<option value="15">15</option>
											<option value="20">20</option>
											<option value="30">30</option>
											<option value="50">50</option>
									</select></td>
								</tr>
								<tr>
									<td><label>휴일</label></td>
									<td><select name="holiday" id="holiday">
											<option value="선택x">휴일선택</option>
											<option value="월요일">월요일</option>
											<option value="화요일">화요일</option>
											<option value="수요일">수요일</option>
											<option value="목요일">목요일</option>
											<option value="금요일">금요일</option>
											<option value="토요일">토요일</option>
											<option value="일요일">일요일</option>
									</select></td>
								</tr>
								<tr>
									<td><label>운영시간</label></td>
									<td><input type="text" id="octime" name="octime"
										placeholder="00~00형식으로 운영시간을 입력해주세요"></td>
								</tr>
								<tr>
									<td><label>전화번호</label></td>
									<td><input type="text" id="tel" name="tel"
										placeholder="입력이 가능한 번호를 입력해주세요"></td>
								</tr>
								<tr>
									<td id="button" colspan="2"><input type="submit"
										value="추가"> <input type="reset" id="reset" value="취소"></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
		</ul>
	</div>
</div>
<script type="text/javascript">
	// Get the modal
	var modal = document.getElementById('myModal');

	// Get the button that opens the modal
	var btn = document.getElementById("myBtn");

	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];

	// When the user clicks on the button, open the modal 
	btn.onclick = function() {
		modal.style.display = "block";
	}

	// When the user clicks on <span> (x), close the modal
	span.onclick = function() {
		modal.style.display = "none";
	}

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
		if (event.target == modal) {
			modal.style.display = "none";
		}
	}
</script>

