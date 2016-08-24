<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<title>SESbank</title>
	<link rel="stylesheet" type="text/css" href="./css/style.css" />

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
			<h1>회원정보 수정<span></span></h1><!-- 내용제목 -->
			<div >
				<form action="infoResult.action" method="post" name="infoForm" >
					<ul class="member_info"><!-- 회원가입 -->
									
						<li><label for="" id="" >회원구분</label><input type="radio" name="customer.division" value="personal"  checked /> 개인 <input type="radio" value="company" name="customer.division" /> 법인</li>
						<li><label for="wr_id">아이디</label><input type="text" id="wr_id" readonly name="customer.custid" placeholder="${LOGIN_ID}" value="${LOGIN_ID}" class="login_write" /></li>
						<li><label for="wr_pass">비밀번호</label><input type="password" id="wr_pass"  name="customer.password" class="login_write" /></li>
						<li><label for="wr_passchk">비밀번호 확인</label><input type="password" id="wr_passchk"  class="login_write" /></li>
						<li><label for="wr_name">이름</label><input type="text" id="wr_name" class="login_write" name="customer.name"/></li>
						<li><label for="wr_birnum">주민(사업자)번호</label><input type="text" id="wr_birnum" name="customer.idno" placeholder="" class="login_write" /></li>
						<li><label for="wr_email">이메일</label><input type="email" id="wr_email" class="login_write" name="customer.email" /></li>
						<li><label for="wr_address">주소</label><input type="text" id="wr_address" class="login_write" name="customer.address"/></li>
						
					</ul>
								
					
				</form>
				<p class="list_btn">
						<a href="javascript:infoForm.submit();" class="select">회원정보수정</a>
				</p>	
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