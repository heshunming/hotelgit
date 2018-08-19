<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add kh</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />

	</head>

	<body>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<html:javascript formName="addGsForm" />
		<html:form action="/addGs.do"
			onsubmit="return validateAddGsForm(this)">
			<table width="29%" height="218" border="0" align="center"
				cellpadding="0" cellspacing="0" id="tableSearch">
				<tr>
					<td width="28%">
						公司名称
					</td>
					<td width="72%">
						<html:text property="gsmc"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						客户密码
					</td>
					<td>
						<html:text property="mm"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						公司地址
					</td>
					<td>
						<html:text property="gsdz"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						联系电话
					</td>
					<td>
						<html:text property="gsdh"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						备注
					</td>
					<td>
						<html:text property="beizhu"></html:text>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="center">
							<input type="submit" value="提交" name="Submit">
						</div>
					</td>
				</tr>
			</table>
		</html:form>
	</body>
</html>
