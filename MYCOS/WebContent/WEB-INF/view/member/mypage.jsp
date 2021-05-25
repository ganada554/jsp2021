<%@page import="com.mycos.web.service.JDBCMypageService"%>
<%@page import="com.mycos.web.entity.Member"%>
<%@page import="com.mycos.web.service.MypageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/mycos/css/mypage.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/362425ceb9.js"
	crossorigin="anonymous">
    </script>
<title>mypage-회원버전</title>
</head>
<body>
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
			<div>
				<i class="fas fa-folder fa-3x"></i> <span>English</span>
			</div>
			<div>
				<i class="fas fa-folder fa-3x"></i> <span>Java</span>
			</div>
			<div>
				<i class="fas fa-folder fa-3x"></i> <span>Pasta</span>
			</div>
		</section>



		<section class="best-course">
			<h1 class="d-none">나의 코스</h1>

			<ul class="course-title">
				<li>나의 코스</li>
				<div>
					(<span>4</span>)
				</div>
			</ul>


			<div class="option-btn">
				<div>
					인기순<i class="fas fa-caret-down"></i>
				</div>
			</div>

			<section>
				<div class="course">
					<div class="date">2020-03-15</div>
					<div class="title">
						<a href="">비전공자 백엔드 코스</a>
					</div>
					<section class="course-info">
						<div class="thumbs-up">
							<span><i class="fas fa-thumbs-up"></i></span>523
						</div>
						<span><i class="far fa-comment-dots"></i>2</span>
					</section>
				</div>
				<div class="course">
					<div class="date">2020-03-15</div>
					<div class="title truncate">
						<a href="">자료 구조</a>
					</div>
					<section class="course-info">
						<div class="thumbs-up">
							<span><i class="fas fa-thumbs-up"></i></span>523
						</div>
						<span><i class="far fa-comment-dots"></i>11</span>
					</section>
				</div>
				<div class="course">
					<div class="date">2020-03-15</div>
					<div class="title truncate">
						<a href="">포트폴리오에 쓸 미니 프로젝트를 예쁘게 만드는 법</a>
					</div>
					<section class="course-info">
						<div class="thumbs-up">
							<span><i class="fas fa-thumbs-up"></i></span>523
						</div>
						<span><i class="far fa-comment-dots"></i>4</span>
					</section>
				</div>
				<div class="course">
					<div class="date">2020-03-15</div>
					<div class="title truncate">
						<a href="">방정리하는 법</a>
					</div>
					<section class="course-info">
						<div class="thumbs-up">
							<span><i class="fas fa-thumbs-up"></i></span>523
						</div>
						<span><i class="far fa-comment-dots"></i>5</span>
					</section>
				</div>
			</section>
		</section>

	</section>
</body>
</html>