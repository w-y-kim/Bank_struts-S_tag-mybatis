<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>SESbank</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript">
	/* 페이지 이동 스크립트 */
	function pagingFormSubmit(currentPage) {

		document.getElementById("currentPage").value = currentPage;
		document.getElementById("pagingForm").submit();
		/* 	대체 DOM 코드 좋은 코드는 아님 
		 document.pagingForm.currentPage.value = currentPage;document.pagingForm.submit(); 
		 */
	}
</script>

</head>

<body>
	<!-- 계좌현황서브 -->


	<div id="wrap">
		<!-- wrap -->

		<div id="header">
			<!-- 상단 -->
			<div id="top">
				<!-- 멤버 -->
				<a href="info.action">회원정보수정</a><a href="login.action">로그아웃</a>&nbsp;&nbsp;&nbsp;
			</div>
			<div id="navi">
				<a href=""><img src="images/logo.png" width="150" /></a>
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
						<li><a href="board_list.action" class="select">고객문의게시판</a> <!-- <ul>
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
			<h1>
				고객문의 게시판<span></span>
			</h1>
			<!-- 내용제목 -->

			<table>
				<tr>
					<th>No.</th>
					<th>문의내용</th>
					<th>일자</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
				<tr>
					<td>3</td>
					<td class="board_title"><a href="board_view.action">계좌개설은
							어떻게...</a></td>
					<td>2016-01-06</td>
					<td>test1</td>
					<td>10</td>
				</tr>
				<tr>
					<td>2</td>
					<td class="board_title"><a href="board_view.action">계좌개설은
							어떻게...</a></td>
					<td>2016-01-06</td>
					<td>test1</td>
					<td>10</td>
				</tr>
				<tr>
					<td>1</td>
					<td class="board_title"><a href="board_view.action">계좌개설은
							어떻게...</a></td>
					<td>2016-01-06</td>
					<td>test1</td>
					<td>10</td>
				</tr>
			</table>
			<!-- 페이징 처리 view단 -->
			<p class="paging">
				<a href="javascript:pagingFormSubmit(${pagenavi.currentPage -1})"
					class="select">&lt;</a>
				<%-- <s:iterator var="i" value="list"> --%>
				<s:iterator value="list" var="counter"
					begin="pagenavi.startPageGroup" end="pagenavi.endPageGroup">
					<!-- step=2 하면 2개씩 증가 -->
					<a
						href="javascript:pagingFormSubmit(<s:property value="#counter"/>)"
						<s:if test="#counter == pagenavi.currentPage">class="select"</s:if>>
						<!-- 내가 보고있는 것과 같은 경우만 class 부여 --> 
						<%-- <s:property value=#counter /> --%>
					</a>&nbsp;
				</s:iterator>
				<a href="javascript:pagingFormSubmit(${pagenavi.currentPage +1})">&gt;</a>
				<!--  -->



				<a href="board_write.action" class="btn_write">글쓰기</a>
			</p>
			<!-- 			<p class="paging">
				<a href="#">&lt</a><a href="#" class="select">1</a><a href="#">2</a><a href="#">3</a>...<a href="#">&gt</a>
				<a href="board_write.action" class="btn_write">글쓰기</a>
			</p> -->
			<!-- 검색폼 -->
			<%-- 			<p class="board_search">
				<select>
					<option value="">전체</option>
					<option value="">제목</option>
					<option value="">내용</option>
					<option value="">작성자</option>
				</select> <input type="text" /> <a href="#">검색</a>

			</p>
 --%>
			<s:form id="pagingForm" method="post" action="listBoard" theme="simple">
				<p class="board_search">
				<s:hidden id="currentPage" value="%{pagenavi.currentPage}"/>
				<s:select name="searchField" list="#{'title':'제목','content':'내용'}"></s:select>
				<s:textfield name="searchText"> </s:textfield>&nbsp<a href="javascript:pagingFormSubmit(1)">검색</a>
				</p>
			</s:form>

			<!--  -->
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