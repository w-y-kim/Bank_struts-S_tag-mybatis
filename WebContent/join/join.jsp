<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>SESbank</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />
<script>
	function check() {
		var id = document.getElementById('txt');
		window
				.open('join_pop.action?param=' + id.value, 'pop',
						'resizable=no scrollbars=yes top=300 left=500 width=300 height=180');
	}
	
	
	function idChecked() {
		var checked = document.getElementById('idchecked');
		if (checked.value == 'true') {
			alert('체크완료');
			return true;
		} else {
			alert('중복체크를 해주세요22');
		}
		return false;
	}

</script>
</head>

<body>
	<!-- 계좌현황서브 -->


	<div id="wrap">
		<!-- wrap -->

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


		<div id="contents">
			<!--내용-->
			<h1>
				회원가입<span>가입항목을 입력해 주세요</span>
			</h1>
			<!-- 내용제목 -->
			<div class="login_area">
				<img src="./images/login_icon.png" class="login_icon" />
				<form action="joinResult.action" method="post" name="joinform">
					<input type="hidden" id="idchecked">
					<ul>
						<!-- 회원가입 -->
						<li
							style="border-bottom: 1px dotted #e7121c; padding-bottom: 5px;"><img
							src="images/ico_login.png" width="14" /> Welcome SEBank</li>
						<li class="grp_area"><label for="">회원구분</label><input
							type="radio" name="customer.division" value="personal" checked />
							개인 <input type="radio" name="customer.division" value="company" />
							법인</li>
						<li><input type="text" id="txt" placeholder="아이디"
							class="join_write" name="customer.custid" /> <a href="#"
							class="id_check" onclick="javascript:check();document.getElementById('idchecked').value = 'true'">중복체크</a></li>
						<li><input type="password" placeholder="비밀번호"
							class="login_write" name="customer.password" /></li>
						<li><input type="password" placeholder="비밀번호 확인"
							class="login_write" /></li>
						<li><input type="text" placeholder="이름" class="login_write"
							name="customer.name" /></li>
						<li><input type="text" placeholder="주민(사업자)번호"
							class="login_write" name="customer.idno" /></li>
						<li><input type="email" placeholder="이메일주소@도메인"
							class="login_write" name="customer.email" /></li>
						<li><input type="text" placeholder="주소" class="login_write"
							name="customer.address" /></li>
						<li><a href="javascript:if(idChecked()){joinform.submit();}else{}" class="btn_join">회원가입</a>
						</li>
					</ul>


				</form>
			</div>


		</div>



		<div id="footer">
			<!-- 하단 -->
			서울시 강남구 삼성동 59-1 COEX 4F, 개인정보관리책임자: 김완길<br /> Copyright©2016
			KITA-SESchool ICT Educational Center All rights reserved.
		</div>



	</div>

	</div>
</body>

</html>