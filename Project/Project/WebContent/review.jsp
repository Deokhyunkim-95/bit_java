<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>       
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="./css/foodie.css"> 
<meta charset="UTF-8">
<title>리뷰를 작성하세요</title>

<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Do+Hyeon|Nanum+Gothic&display=swap');

*	{
	font-family: 'Do Hyeon', sans-serif;
}


body{
font-family: 'Do Hyeon', sans-serif;
}


#h3 {
	margin-top: 0px;
	height: 80px;
	padding-top: 15px;
	background-color: ;
	color: #FFBB00;
	font-size: 2.5em;
	text-align: center;
	border-bottom: 1px solid #BDBDBD;
}
#span1 {
	color: #FFBB00;
	font-size: 20pt;
}
#span2 {
	font-size: 15pt;

}

#text {
	border: 1px solid #BDBDBD;
	height: 200px;
	width: 900px;
	padding: 8px;
	font-size: 13pt;
	resize: none;
	
}
#div0{
	height: 50px;
}
#div1 {
	margin-left: 350px;
	float: left;
}
#div2 {
	margin-left: 100px;
	float: left;
}
#div3{
	text-align: center;
}
.btn {
	width: 100px;
	height: 40px;
	border-radius: 20px;
	background-color: white;
	border: 1px solid #BDBDBD;
	color: #BDBDBD;
	font-size: 16pt;
}


#fileinput{
	font-size: 12pt;
	width: 40%;
	float: right;	

}

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel=" shortcut icon" href="./img/favicon.ico">
<link rel="icon" href="./img/favicon.ico">
</head>
<body>
<div id="header">
 	<%@include file="/common/header.jsp"%>
</div>
	<h3 id="h3">eat me!</h3> <br>
	<form action="insertReview.do?fid=<%= request.getParameter("fid") %>&fname=<%=request.getParameter("fname")%>" method="post" enctype="multipart/form-data">
		<div id="div0">
			<div id="div1">
				<span id="span1"><%=request.getParameter("fname") %>에 대한 솔직한 리뷰를 써주세요</span><br>
				
			</div>
				
			<div id="div2">
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="material-icons" style="font-size:50px; color:#BDBDBD">sentiment_very_satisfied</i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<i class="material-icons" style="font-size:50px; color:#BDBDBD">sentiment_satisfied</i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<i class="material-icons" style="font-size:50px; color:#BDBDBD">sentiment_very_dissatisfied</i>
				</div>
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="eval" id="good" value="good"/>맛있다 &nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="eval" id="normal" value="normal" />괜찮다&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="eval" id="bad" value="bad" />별로 <br>
				</div> 
			</div> 
		</div><br><br>
		<div id="div3">
		<input type="hidden">
			<i class="material-icons" style="font-size:60px; color:#BDBDBD">person_outline</i>
			<textarea id="text" name="text" >  </textarea> <br><br><br>
		
		<input type="file" name="image" multiple="multiple" id="fileinput" > <br><br><br>
		
		<input class="btn" type="submit" value="완료">
 		<input class="btn" type="reset" onclick="location.href='Showfoodshop.do?fname=<%= request.getParameter("fname") %>'" value="취소">
		</div>
	</form>
</body>
</html>