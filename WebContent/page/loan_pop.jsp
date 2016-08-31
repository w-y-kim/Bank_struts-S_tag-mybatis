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

		<h2>출금계좌 선택</h2>

		<div style="">
			<table>

				<tr>
					<th>선택</th>
					<th>유형</th>
					<th>계좌번호</th>
					<th>잔고</th>
				</tr>

				<s:iterator value="accountList">
					<tr>
						<td><input type="radio" name="accountno"
							value="<s:property value="accountno"/>" /></td>
						<td><s:property value="accounttype" /></td>
						<td><s:property value="accountno" /></td>
						<td><s:property value="balance" /></td>
					</tr>
				</s:iterator>

			</table>
			<script type="text/javascript">
				
			function chk_radio() {
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
			<p class="list_btn">
				<a href="javascript:chk_radio();">선택</a>
			</p>
		</div>
	</div>



</body>

</html>