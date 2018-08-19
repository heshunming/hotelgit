<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>update czy</title>
	</head>

	<body>
	<html:javascript formName="updateCzyForm"/>
		<html:form action="updateCzy.do?czyid=${czy.czyid }" onsubmit="return validateUpdateCzyForm(this)">
			<table width="50%" align="center" cellpadding="0" cellspacing="0"
				id="tableSearch" border="3" bordercolor="#0099CC">
				<tr>
					<td bordercolor="#0099CC">
						用户名
					</td>
					<td>
						<html:text property="username" value="${czy.username }"></html:text>
					</td>
				</tr>
				<tr>
					<td bordercolor="#0099CC">
						密码
					</td>
					<td>
						<html:text property="password" value="${czy.password }"></html:text>
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
