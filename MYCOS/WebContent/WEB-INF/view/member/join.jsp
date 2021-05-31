<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<% 

%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/mycos/css/join.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/362425ceb9.js" crossorigin="anonymous">
</script>
<title>회원 가입 페이지</title>
</head>
<body>
	<section>
		<form class="join-form" action="/member/join" method="post"> <!-- 파라미터값을 전송하기 위한 태그 -->
			<h2>회원가입</h2>

			<strong>닉네임*</strong> 
			<input type="text" name="nicname" value="">
			<input type="submit" name="" value="중복 확인"> 
			
			<strong>아이디*</strong>
			<input type="text" name="id" value=""> 
			
			<strong>이메일*</strong>
			<input type="text" name="email" value=""> 
			
			<strong>비밀번호*</strong>
			<input type="password" name="password" value="">


			<div class="gender-form">
				<strong>성별</strong> 
				<label for="male">남성</label> 
				<input type="radio" id="male" name="gender" value=""> 
				
				<label for="female">여성</label>
				<input type="radio" id="female" name="gender" value="">
			</div>

			<div class="age-form">
				<strong>생년월일</strong> 
				<input type="date" name="birthday" required>
			</div>

			<div class="submit-btn">
				<input type="submit" value="제출">
			</div>
		</form>
	</section>
</body>
</html>