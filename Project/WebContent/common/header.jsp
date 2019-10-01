	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="w3-top w3-hide-small">
			<div
				class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off"
				id="myNavbar" >
				<ul>
				<li><a href="./main.jsp" >Home</a></li> 
				<li><a href="./loc_eat_deal.jsp" >Eat Deal</a></li>
				<li><a href="./loc_foodstyle.jsp" >맛집 리스트</a></li>
				<li><c:if test="${empty login}">
					<a href="./login.jsp" class="drop_btn">Log-In</a>
					</c:if>
					<c:if test="${!empty login}">
					<a href="./logout.do" class="drop_btn">Log-out</a>
					</c:if>
				</li>
</ul>
</div>
</div>

