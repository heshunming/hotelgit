<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add czy</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
	<html:javascript formName="addCzyForm"/>
		<html:form action="addCzy.do" onsubmit="return validateAddCzyForm(this)">
		    <p><br>
              <br>
              </p>
		    <p><br>
              <br>
	        </p>
		    <table width="25%" height="170" border="0" align="center" cellpadding="0"
				cellspacing="0" id="tableSearch">
				<tr>
					<td height="37">
						用户名					</td>
					<td>
						<html:text property="username"></html:text>					</td>
				</tr>
				<tr>
					<td height="36">
						密码					</td>
					<td>
						<html:text property="password"></html:text>					</td>
				</tr>
				<tr>
					<td height="38">
						用户权限					</td>
					<td>
						<html:select property="yhqs">&nbsp; 
							<html:option value="1">操作员</html:option>
							<html:option value="2">经理</html:option>
						</html:select>					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="center">
						  <input type="submit" value="提交" />					
					  </div></td>
				</tr>
			</table>

		</html:form>
	</body>
</html>
