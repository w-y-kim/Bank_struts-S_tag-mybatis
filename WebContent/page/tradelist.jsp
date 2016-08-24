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
			<h1>거래내역 조회<span></span></h1><!-- 내용제목 -->
			<ul class="basic_list">
				<li><span>&#47; 조회계좌번호</span> 2354-258-25891</li>
				<li><span>&#47; 조회기간선택</span><input type="text" class="wr_date" /> ~ <input type="text" class="wr_date"  /></li>
				<li><span>&#47; 조회내용</span><input type="radio" name="listcheck" checked />전체 <input type="radio" name="listcheck" />입금내역 <input type="radio" name="listcheck" />출금내역</li>
				<li><span>&#47; 조회결과순서</span> <input type="radio" name="listcheck2" />최근거래순서  <input type="radio" name="listcheck2" />과거거래순서</li>
			</ul>

			<p class="list_btn">
				<a href="page/haveaccount.action">이전</a><a href="#" class="select">조회</a>
			</p>
			<table>
				<tr>
					<th>거래일자</th>
					<th>시간</th>
					<th>출금</th>
					<th>입금</th>
					<th>내용</th>
					<th>잔액</th>
				</tr>
				<tr>
					<td>2016-01-06</td>
					<td>12:12:01</td>
					<td>45,000</td>
					<td></td>
					<td>이체</td>
					<td>450,000</td>
				</tr>
				<tr>
					<td>2016-01-03</td>
					<td>10:12:35</td>
					<td></td>
					<td>100,00</td>
					<td>월급</td>
					<td>495,000</td>
				</tr>
				<tr>
					<td>2016-01-01</td>
					<td>06:00:10</td>
					<td>5,000</td>
					<td></td>
					<td>점심</td>
					<td>395,000</td>
				</tr>
			</table>
			<p class="paging">
			<a href="#">&lt</a><a href="#" class="select">1</a><a href="#">2</a><a href="#">3</a>...<a href="#">&gt</a>
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