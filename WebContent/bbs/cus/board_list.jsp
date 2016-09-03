<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<title>SESbank</title>
	<link rel="stylesheet" type="text/css" href="./css/style.css" />
<script type="text/javascript">
	function page(num) {
		var page=num;
		location.href="listBoard.action?currentPage="+num;
	}
</script>
</head>

<body><!-- 계좌현황서브 -->
	
	
	<div id="wrap"><!-- wrap -->
		
		<div id="header"><!-- 상단 -->
			<div id="top"><!-- 멤버 -->
				
				
				<a href="logout">로그아웃</a>
					<a href="infoform">회원수정</a>&nbsp;&nbsp;&nbsp;
				
			</div>
			<div id="navi">
			<a href=""><img src="./images/logo.png" width="150" /></a>
			<div class="gnb"><!-- 네비게이션 -->
     
				<ul>
						<li><a href="haveaccountform">보유계좌현황</a> <!-- <ul>
						   
						</ul> --></li>

						<li><a href="addaccount_1form">신규계좌개설</a>
							<ul>
								<li><a href="addaccount_1form.action">예금계좌</a></li>
								<li><a href="addaccount_2form.action">적금계좌</a></li>
								<li><a href="addaccount_3form.action">대출계좌</a></li>
							</ul></li>
						<li><a href="listBoard.action">고객문의게시판</a> <!-- <ul>
						   <li><a href="#">서브메뉴1</a></li>
						   <li><a href="#">서브메뉴2</a></li>
						   <li><a href="#">서브메뉴3</a></li>
						</ul> --></li>
					</ul>
			</div>
			</div>
			
		</div>



		<div id="contents"><!--내용-->
			<h1>고객문의 게시판<span></span></h1><!-- 내용제목 -->
			
						<table>
				<tr>

					<th>No.</th>
					<th>문의내용</th>
					<th>일자</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
				
			<s:iterator value="boardlist" status="status">			
				<tr>
					<td><s:property value="pagenavi.totalRecordsCount -  pagenavi.startRecord - #status.index" /></td>
					
					<td  class="board_title">
						<s:url id="readurl" value="/readBoard.action">
   							<s:param name="boardno" value="%{boardno}" />
						</s:url>
						<s:a href="%{readurl}"><s:property value="title" /></s:a>
					</td>
					
					
					<td><s:property value="regdate"/></td>
					<td><s:property value="custid"/></td>
					<td><s:property value="hitcount"/></td>
				</tr>
			</s:iterator> 
			</table>
			<p class="paging">
				<s:url id="readur2" value="/listBoard.action">
   				<s:param name="currentPage" value="currentPage-1" />
				</s:url>
				<s:a href="%{readur2}">&lt</s:a>
				
				  <s:iterator begin="pagenavi.startPageGroup" end="pagenavi.endPageGroup"  status="b" var="i">
					<s:if test="currentPage == #i">
					<a onclick="page('<s:property value="i"/>')" class="select"> <s:property value="i"/></a>			
					</s:if>
					<s:else>					
					<a onclick="page('<s:property value="i"/>')" > <s:property value="i"/></a>			
					</s:else>
					
				</s:iterator>  
				
				<s:url id="readur" value="/listBoard.action">
   							
   							<s:param name="currentPage" value="currentPage+2" />
				</s:url>
			
				<s:a href="%{readur}">&gt</s:a>
				<a href="board_writeform.action" class="btn_write">글쓰기</a>
			</p>
			
			
			<form action="board_list.action" method="post" name="search">
			<p class="board_search">
				<select name="searchField">
					<option value="all">전체</option>
					<option value="title">제목</option>
					<option value="content">내용</option>
					<option value="custid">작성자</option>
				</select>
				<input type="text" name="searchText"/> <a href="javascript:search.submit()">검색</a>
			</p>
			</form>

		</div>


		<div id="footer"><!-- 하단 -->
			서울시 강남구 삼성동 59-1 COEX 4F, 개인정보관리책임자: 홍길동<br />
			Copyright©2016 KITA-SESchool ICT Educational Center All rights reserved.			
		</div>



		</div>

	</div>




</body>

</html>