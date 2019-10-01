

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Proxy Server의 역할을 하는 rss.jsp -->


<!-- 선언한 변수 data 안에 url이 들어감 -->
<c:import var="data" 
		  url="http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108">
</c:import>

${data}