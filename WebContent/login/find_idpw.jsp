<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<title>SESbank</title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />

</head>

<body><!-- 계좌현황서브 -->
	
	

	<div id="wrap"><!-- wrap -->
		
		<div id="header"><!-- 상단 -->
			<div id="top"><!-- 멤버 -->
				<a href="info.action">회원정보수정</a><a href="logout.action">로그아웃</a>&nbsp;&nbsp;&nbsp;
			</div>
			<div id="navi">
			<a href="#"><img src="images/logo.png" width="150" /></a>
			<div class="gnb"><!-- 네비게이션 -->
     
				 <ul>
					<li><a href="haveaccount.action">보유계좌현황</a>
						<!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> -->
					</li>

					<li><a href="addaccount_1.action">신규계좌개설</a>
						<ul>
						   <li><a href="addaccount_1.action">예금계좌</a></li>
						   <li><a href="addaccount_2.action">적금계좌</a></li>
						   <li><a href="addaccount_3.action">대출계좌</a></li>
						</ul>
					</li>
					<li><a href="board_list.action">고객문의게시판</a>
						<!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> -->
					</li>
				</ul>
			</div>
			</div>
			
		</div>


		<div id="contents"><!--내용-->
			<h1>고객센터<span>아이디, 패스워드 찾기</span></h1><!-- 내용제목 -->
			<div class="login_area">
				<img src="images/login_icon.png" class="login_icon" />
				<form action="find_Result.action" name="findForm">
					<ul style="display:;"><!-- 아이디찾기 -->
						<li class=""><img src="images/ico_login.png" width="14" /> Welcome SEBank</li>
						<li><a href="#" class="findtitle_btn tab">아이디 찾기</a>&nbsp;<a href="#" class="findtitle_btn">패스워드 찾기</a></li>
						<li><input type="text" placeholder="이름" class="login_write" name="customer.name" /></li>
						<li><input type="email" placeholder="이메일주소@도메인" class="login_write" name="customer.email" /></li>
						<li><a href="javascript:findForm.submit()" class="btn_idfind">아이디 확인</a></li>
					</ul>
					<ul style="display:none;"><!-- 비밀번호찾기 -->
						<li class=""><img src="images/ico_login.png" width="14" /> Welcome SEBank</li>
						<li><a href="#" class="findtitle_btn">아이디 찾기</a>&nbsp;<a href="#" class="findtitle_btn tab"> 패스워드 찾기</a></li>
						<li><input type="text" placeholder="아이디" class="login_write" name="customer.custid"/></li>
						<li><input type="text" placeholder="이름" class="login_write" name="customer.name"/></li>
						<li><input type="email" placeholder="이메일주소@도메인" class="login_write" name="customer.email"/></li>
						<li><a href="javascript:findForm.submit()" class="btn_idfind">비밀번호 찾기</a></li>
					</ul>
					
					
				</form>
			</div>


		</div>



		<div id="footer"><!-- 하단 -->
			서울시 강남구 삼성동 59-1 COEX 4F, 개인정보관리책임자: 홍길동<br />
			Copyright©2016 KITA-SESchool ICT Educational Center All rights reserved.			
		</div>



		</div>

	</div>




</body>

</html>