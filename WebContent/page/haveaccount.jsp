<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>SESbank</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />

</head>

<body>
	<!-- 계좌현황서브 -->


	<div id="wrap">
		<!-- wrap -->

		<div id="header">
			<!-- 상단 -->
			<div id="top">
				<!-- 멤버 -->
				<a href="info.action">회원정보수정</a><a href="logout.action">로그아웃</a>&nbsp;&nbsp;&nbsp;
			</div>
			<div id="navi">
				<a href="#"><img src="images/logo.png" width="150" /></a>
				<div class="gnb">
					<!-- 네비게이션 -->

					<ul>
						<li><a href="haveaccount.action">보유계좌현황</a> <!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> --></li>

						<li><a href="addaccount_1.action">신규계좌개설</a>
							<ul>
								<li><a href="addaccount_1.action">예금계좌</a></li>
								<li><a href="addaccount_2.action">적금계좌</a></li>
								<li><a href="addaccount_3.action">대출계좌</a></li>
							</ul></li>
						<li><a href="board_list.action">고객문의게시판</a> <!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> --></li>
					</ul>
				</div>
			</div>

		</div>



		<div id="contents">
			<!--내용-->


			<h1>보유계좌 현황</h1>
			<!-- 내용제목 -->


			<table>

				<tr>
					<th>선택</th>
					<th>계좌종류</th>
					<th>계좌번호</th>
					<th>잔고</th>
					<th>납입(상환)기간</th>
					<th>대출(이율)</th>
				</tr>
				<s:iterator value="accountList">
					<!-- 				<tr>
					<td><input type="radio" name="backingname" checked /></td>
					<td>예금계좌</td>
					<td>250</td>
					<td>-</td>
					<td></td>
					<td></td>
				</tr>
 -->
					<tr>
						<td><input type="radio" name="mychoice"
							value="<s:property value="accountno"/>" /></td>
						<td><s:property value="accounttype" /></td>
						<td><s:property value="accountno" /></td>
						<td><s:property value="balance" /></td>
						<td><s:property value="startdeposit" /> ~ <s:property
								value="enddeposit" /></td>
						<td><s:property value="interest" /></td>
					</tr>


				</s:iterator>

			</table>
			<script type="text/javascript">
				function chk_radio(uri) {
					var num_temp = document.all.mychoice.length;
					for (i = 0; i < num_temp; i++) {
						if (document.all.mychoice[i].checked == true) {
							var chkVal = document.all.mychoice[i].value
							location.href = uri + chkVal;
							break;
						}

					}
				}
			</script>
			<p class="list_btn">
				<a href="#" onclick="chk_radio('deposit.action?mychoice=')">입금</a> <a
					href="#" onclick="chk_radio('withdraw.action?mychoice=')">출금</a> <a
					href="#" onclick="chk_radio('transfer.action?mychoice=')">이체</a> <a
					href="#" onclick="chk_radio('transferlist.action?mychoice=')">거래내역</a>
				<a href="#" onclick="chk_radio('loan.action?mychoice=')">대출상환</a>
			</p>



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