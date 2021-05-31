<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/mycos/css/login.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/362425ceb9.js"
	crossorigin="anonymous">
    </script>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<section class="login-form">
		<h1>로그인</h1>

		<form class="id-form" method="post">
			<strong>아이디*</strong> <input type="text" name="userid" value="">
		

		
			<strong>비밀번호*</strong> <input type="password" name="password"
				value="">
		

		<section class="btn">
			<div class="search-btn">
				<a href="search-id.jsp"><input type="submit" value="아이디 찾기"></a>
				<a href="/searchPsd"><input type="submit" value="비밀번호 찾기"></a>
				<input type="hidden" value="${returnURL}">
			</div>

			<div class="submit-btn">
				<input type="submit" value="제출">
			</div>
		</section>
		</form>
	</section>

</body>
</html>