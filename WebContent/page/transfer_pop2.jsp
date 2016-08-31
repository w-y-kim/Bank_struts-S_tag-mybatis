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
/* 부모창으로 값 전달 */
function sendChildValue() {
	var myCk;
	var elements = document.getElementsByName("accountno");
	for (i = 0; i < elements.length; i++) {
		if (elements[i].checked == true) {
			var chkVal = elements[i].value;
			myCk = chkVal;
			window.close();
			opener.setChildValue(myCk);/* 자신을 닫은 다음에 부모에 보내줘야함 그전에하면 이 코드에서 종료되서 자식이 안닫힘 */
			break;
		}
	}
}
</script>
</head>

<body>

	<div class="popwrap">

		<h2>입금계좌 입력</h2>
		<div>
			<form action="transfer_pop2_Result.action" method="post"
				name="myform">
				<p class="list_btn">
					<input type="text" class="wr_idcheck" name="accountno" /> <a
						href="#">조회</a><br />
					<br />




					<s:if test="accountno != null">
						<s:if test="account == null">
							<span style="display:;"> <span>위 계좌는 유효한 계좌입니다</span><br />
							<br />
							<br />
							<a href="javascript:sendChildValue();" class="select">적용</a>
							</span>
						</s:if>
						<s:if test="account != null">
							<span style="display:;"> <span>위 계좌는 존재하지않는
									계좌입니다</span><br />
							<br />
							<br />
							</span>
						</s:if>
					</s:if>

					<s:if test="accountno == null">
						<span>조회할 계좌를 입력해주세요.</span><br />
					</s:if>


				</p>
			</form>

		</div>
	</div>



</body>

</html>