<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@include file="../taglibs.jsp"%>
<html>
	<head>
		<title>��ӿͷ�</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script src="/hotelh/js/fj.js"></script>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<html:javascript formName="addFjForm" />
		<html:form action="/addFj.do"
			onsubmit="return validateAddFjForm(this)">
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<table width="29%" height="218" border="0" align="center"
				cellpadding="0" cellspacing="0" id="tableSearch">
				<tr>
					<td width="28%">
						房间号
					</td>
					<td width="46%">
						<html:text property="fjno" onkeyup="validate();"></html:text>
					</td>
					<td width="0%">
						<div id="userIdMessage">
							<div align="left"></div>
						</div>
					</td>
				<tr>
					<td>
						房间类型
					</td>
					<td>
						<html:select property="fjlxno">
							<option value="1" selected>
								单人间
							</option>
							<option value="2">
								双人间
							</option>
						</html:select>
					</td>
				</tr>
				<tr>
					<td>
						房间状态
					</td>
					<td>
						<html:text property="fjzt"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						楼层
					</td>
					<td>
						<html:text property="lc"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						房间电话
					</td>
					<td>
						<html:text property="fjdh"></html:text>
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
