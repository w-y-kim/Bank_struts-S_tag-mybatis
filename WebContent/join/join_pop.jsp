<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>SESbank</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body>

	<div class="popwrap">

		<h2>ID중복확인</h2>

		<div style="display:;">

<s:if test="custid != null">
			<s:if test="%{duplicated}">
				[<span>${custid}</span>] 아이디는 사용가능합니다.
				<p class="list_btn">
					<a href="javascript:self.close()">적용</a>
				</p>
			</s:if>



			<s:if test="!duplicated">
				[<span>${custid}</span>] 아이디는 이미 사용중입니다.
			
			</s:if>
</s:if>

		</div>



		<form action="join_pop_Result.action" name="popform">
			<p class="list_btn">
				<input type="text" id="txt" class="wr_idcheck" name="custid"  value="${param.param}" /> <a
					href="javascript:popform.submit();">중복확인</a>
			</p>
		</form>
	</div>



</body>

</html>