<%@page import="com.mycos.web.service.JDBCMypageService"%>
<%@page import="com.mycos.web.entity.Member"%>
<%@page import="com.mycos.web.service.MypageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../../mycos/css/mypage-member.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/362425ceb9.js" crossorigin="anonymous"></script>
<script src="/js/mypage.js"></script>
<script src="/js/slideIn.js"></script>
<title>mypage-회원버전</title>
</head>
<body>
    <header id="header">
        <h1 class="d-none">헤더 버튼들</h1>
        <a href=""><h2>MYCOS</h2></a>
        <a href=""><i class="fas fa-bars fa-2x"></i></a>
    </header>
	<section id="root">

		<section class="user-info">
			<h1 class="d-none">프로필</h1>
			<i class="fas fa-user-circle fa-4x"></i>
			<div class="name">${member.nicname}</div>
			<div class="status">${member.status}</div>
			<!-- <ul class="sns">
                <li style="color:rgb(39, 39, 189)"><i class="fab fa-facebook-square"></i></li>
                <li style="color: rgb(111, 214, 255);"><i class="fab fa-twitter"></i></li>
                <li><i class="fab fa-github"></i></li>
                <li style="color: rgb(53, 53, 53);"><i class="far fa-envelope"></i></li>
            </ul> -->
		</section>

		<section class="group">
		<c:forEach var="g" items="${group}">
			<div>
				<i class="fas fa-folder fa-3x"></i> <span>${g.name }</span>
			</div>
		</c:forEach>
		</section>



		<section class="best-course">
			<h1 class="d-none">나의 코스</h1>

			<ul class="course-title">
				<li>나의 코스</li>
				<div>
					(<span>${courseCount}</span>)
				</div>
			</ul>


			<div class="option-btn">
				<div>
					인기순<i class="fas fa-caret-down"></i>
				</div>
			</div>

			<section>
			<c:forEach var="c" items="${course}">
				<div class="course">
					<div class="date">${c.regdate}</div>
					<div class="title">
						<a href="">${c.title}</a>
					</div>
					<section class="course-info">
						<div class="thumbs-up">
							<span><i class="fas fa-thumbs-up"></i></span>523
						</div>
						<span><i class="far fa-comment-dots"></i>2</span>
					</section>
				</div>
			</c:forEach>
			</section>
		</section>

	</section>
</body>
</html>