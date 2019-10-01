<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/table.css">
<script src="./js/addshop.js"></script>

<title>음식점 추가</title>

<style type="text/css">
#table {
	width: 400px;
	text-align: center;
	margin: 0 auto;
}
</style>

</head>
<body>
	<h3>음식점 추가</h3>
	<form id="addshop" action="insertfoodshop.do" method="post" enctype="multipart/form-data">
		<table id="table" border="1">
			<tr>
				<td><label>이름</label></td>
				<td><input type="text" id="fname" name="fname" value="가게 이름을 입력해주세요"
					style="text-align: center; width: 250px;" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td><label>주소</label></td>
				<td><input type="text" id="address" name="address" value="주소를 입력해주세요"
					style="text-align: center; width: 250px;" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td><label>위도</label></td>
				<td><input type="text" id="latitude" name="latitude" value="위도를 입력해주세요"
					style="text-align: center; width: 250px;" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td><label>경도</label></td>
				<td><input type="text" id="longitude" name="longitude" value="경도를 입력해주세요"
					style="text-align: center; width: 250px;" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td><label>음식스타일</label></td>
				<td><select name="foodstyle" id="foodstyle" style="width: 250px; height: 23px">
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
				<td><input type="file" name="img" multiple="multiple" ></td>
			</tr>
			<tr>
				<td><label>위치한 지역</label></td>
				<td><select name="loc1" id="loc1"
					onchange="doChange(this, 'loc2')">
						<option value="default">지역선택</option>
						<option value="강남">강남</option>
						<option value="강북">강북</option>
				</select> <select name="loc2" id="loc2">
						<option value="default">도시선택</option>
				</select></td>
			</tr>
			<tr>
				<td><label>할인</label></td>
				<td><select name="discount" id = "discount">
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
				<td><select name="holiday" id = "holiday">
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
					style="text-align: center; width: 250px;"
					value="00~00형식으로 운영시간을 입력해주세요" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td><label>전화번호</label></td>
				<td><input type="text" id="tel" name="tel"
					style="text-align: center; width: 250px;"
					value="입력이 가능한 번호를 입력해주세요" onblur="checkField(this)"
					onfocus="clearField(this)"></td>
			</tr>
			<tr>
				<td id="button" colspan="2"><input type="submit" value="추가">
					<input type="reset" id="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>