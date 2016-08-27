<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>SESbank</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />
<script type="text/javascript">
	function loginch() {
		var login = '${result}'
		if (login != "ok") {
			location.href = "index";
		}
	}
</script>
</head>

<body onload="loginch();">
	<!-- 계좌현황서브 -->


	<div id="wrap">
		<!-- wrap -->

		<div id="header">
			<!-- 상단 -->
			<div id="top">
				<!-- 멤버 -->
				<s:if test="%{session.login == null}">
					<a href="index">로그인</a>
					<a href="joinform">회원가입</a>&nbsp;&nbsp;&nbsp;
				</s:if>
				<s:else>
				${login.custid}
				<a href="index">로그아웃</a>
					<a href="joinform">회원수정</a>&nbsp;&nbsp;&nbsp;
				</s:else>
			</div>
			<div id="navi">
				<a href="#"><img src="./images/logo.png" width="150" /></a>
				<div class="gnb">
					<!-- 네비게이션 -->

					<ul>
						<li><a href="haveaccountform.action">보유계좌현황</a> <!-- 
						<li><a href="#">서브메뉴1</a></li>
						<li><a href="#">서브메뉴2</a></li>
						<li><a href="#">서브메뉴3</a></li>
					</ul>
					--></li>

						<li class="select"><a href="addaccount_1.jsp" class="select">신규계좌개설</a>
							<ul>
								<li><a href="addaccount_1form.action">예금계좌</a></li>
								<li><a href="addaccount_2form.action">적금계좌</a></li>
								<li><a href="addaccount_3form.action">대출계좌</a></li>
							</ul></li>
						<li><a href="board_list.jsp">고객문의게시판</a> <!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> --></li>
					</ul>
				</div>
			</div>

		</div>
		<div id="contents">
			<form action="addaccount.action" name="insert">
				<!--내용-->
				<h1>
					신규계좌 개설<span>예금계좌정보를 입력해 주세요</span>
				</h1>

				<!-- 내용제목 -->
				<ul class="basic_list">
					<!-- 예금계좌 -->

					<li><span>&#47; 계좌구분</span> <input type="text" value="예금통장"
						readonly="readonly" name="account.accounttype"></li>
					<li><span>&#47; 계좌번호</span><input type="text"
						class="wr_account" placeholder="2354-258-25891"
						name="account.accountno" readonly="readonly"
						value="<s:property value="%{account.accountno}"/>" /> <!-- <a href="#">계좌번호 발급</a> --></li>
					<li><span>&#47; 초기잔고</span><input type="text"
						class="wr_account" name="account.balance" /></li>
					<li><input type="hidden" name="account.custid"
						value='<s:property value="#session.login.custid" />'></li>
				</ul>
				<p class="list_btn">
					<a href="javascript:insert.submit();" class="select">계좌개설</a>
				</p>
				<p class="extext">※ 대출계좌는 승인 완료 후 계좌현황에서 확인하실 수 있습니다</p>

			</form>

		</div>

		<div id="footer">
			<!-- 하단 -->
			서울시 강남구 삼성동 59-1 COEX 4F, 개인정보관리책임자: 홍길동<br /> Copyright©2016
			KITA-SESchool ICT Educational Center All rights reserved.
		</div>

	</div>
	</div>

</body>

</html>
