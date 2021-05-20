<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="login.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/362425ceb9.js" crossorigin="anonymous">
</script>
<title>Insert title here</title>
</head>
<body>
    <section class="login-form" action=""> 
        <h1>로그인</h1>

        <form class="id-form">
            <strong>아이디*</strong>
            <input type="text" name="id" value="">
        </form>

        <form>
            <strong>비밀번호*</strong>
            <input type="password" name="password" value="">
        </form>

        <section class="btn">
            <div class="search-btn">
                <input type="submit" value="아이디/비밀번호 찾기">
            </div>

            <div class="submit-btn">
                <input type="submit" value="제출">
            </div>
        </section>
    </section>
</body>
</html>