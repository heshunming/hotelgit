<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

	</head>

	<body>
	<html:javascript formName="updatePWDForm"/>
		<html:form action="updatePWD.do" onsubmit="return validateUpdatePWDForm(this)">
			<table width="50%" align="center" cellpadding="0" cellspacing="0"
				id="tableSearch" border="3" bordercolor="#0099CC">
				<tr>
					<td bordercolor="#0099CC">
						当前密码
					</td>
					<td>
						<html:text property="nowpwd"></html:text>
					</td>
				</tr>
				<tr>
					<td bordercolor="#0099CC">
						新密码密码
					</td>
					<td>
						<html:text property="pwd"></html:text>
					</td>
				</tr>
				<tr>
					<td bordercolor="#0099CC">
						确认新密码
					</td>
					<td>
						<html:text property="pwd1"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="提交" />
					</td>
					<td>
					</td>
				</tr>
			</table>

		</html:form>
	</body>
</html>
