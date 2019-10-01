<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <header>
       <hgroup>
		   <h1>Page Title </h1> 
		   <h2> Page SubTitle </h2>
		</hgroup>
	 </header>	
	 
		<nav>
		   <ul>
		      <li> <a href="index.jsp">Home</a></li>
		      <li class="dropbox"> 
		            <a id="etc" href="#">게시판</a>
		          <span class="dropmenu">
			          <span> <a href="table1.html" class="btn">자유</a></span>
				      <span> <a href="table2.html" class="btn">문의</a></span>
				      <span> <a href="listBook.do" class="btn">Book</a></span>
				      <span> <a href="#" class="btn">Link4</a></span>
				      <span> <a href="#" class="btn">Link5</a></span>
		          </span>
		      </li>
		      <li> <a href="#">Tutorials</a></li>
		      <li> <a href="#">About</a></li>
		      
		      <c:if test="${empty login}">
                 <li><a href="./login.jsp" > LOGIN</a></li> 
              </c:if>
              <c:if test="${!empty login}">
                 <li><a href="./logout.do" > LOGOUT </a></li> 
              </c:if>
		   </ul>
		</nav>
		