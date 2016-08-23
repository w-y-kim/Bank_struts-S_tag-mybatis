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
				<a href="join/info.action">회원정보수정</a><a href="login/login.action">로그아웃</a>&nbsp;&nbsp;&nbsp;
			</div>
			<div id="navi">
			<a href="#"><img src="images/logo.png" width="150" /></a>
			<div class="gnb"><!-- 네비게이션 -->
     
				 <ul>
					<li><a href="account/haveaccount.action" class="select">보유계좌현황</a>
						<!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> -->
					</li>

					<li><a href="account/addaccount_1.action">신규계좌개설</a>
						<ul>
						   <li><a href="account/addaccount_1.action">예금계좌</a></li>
						   <li><a href="account/addaccount_2.action">적금계좌</a></li>
						   <li><a href="account/addaccount_3.action">대출계좌</a></li>
						</ul>
					</li>
					<li><a href="bbs/cus/board_list.action">고객문의게시판</a>
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
			<h1>입금<span>입금정보를 입력해 주세요</span></h1><!-- 내용제목 -->
			<ul class="basic_list">
				<li><span>&#47; 계좌구분</span> 예금계좌 or 적금계좌</li>
				<li><span>&#47; 계좌번호</span><input type="text" class="wr_account" placeholder="2354-258-25891" /></li>
				<li><span>&#47; 입금금액</span><input type="text" class="wr_account" /></li>
			</ul>

			<p class="list_btn">
				<a href="page/haveaccount.action">이전</a><a href="#" class="select">입금</a>
			</p>
		


		</div>



		<div id="footer"><!-- 하단 -->
			서울시 강남구 삼성동 59-1 COEX 4F, 개인정보관리책임자: 홍길동<br />
			Copyright©2016 KITA-SESchool ICT Educational Center All rights reserved.			
		</div>



		</div>

	</div>




</body>

</html>