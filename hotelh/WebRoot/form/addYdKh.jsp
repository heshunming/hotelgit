<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add kh</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />

	</head>

	<body>
		<p>
			&nbsp;
		</p>
		<p>
			&nbsp;
		</p>
		<p>
			&nbsp;
		</p>
		<p>
			&nbsp;
		</p>
		<html:javascript formName="addKhForm" />
		<html:form action="/addKh.do?yd=yd"
			onsubmit="return validateAddKhForm(this)">
			<table width="29%" height="218" border="0" align="center"
				cellpadding="0" cellspacing="0" id="tableSearch">
				<tr>
					<td width="28%">
						客户名称
					</td>
					<td width="72%">
						<html:text property="khmc"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						客户类型
					</td>
					<td>
					<html:select property="khlx">
						<html:option value="1">普通用户</html:option>
						<html:option value="2">会员</html:option>
						<html:option value="3">协议公司</html:option>
					</html:select>
					</td>
				</tr>
				<tr>
					<td>
						客户性别
					</td>
					<td>
						<html:select property="khxb">
							<html:option value="男" key="男"></html:option>
							<html:option value="女" key="女"></html:option>
						</html:select>
					</td>
				</tr>
				<tr>
					<td>
						证件类型
					</td>
					<td>
						<html:select property="zjlx">
							<html:option value="身份证" key="身份证"></html:option>
							<html:option value="户口薄" key="户口薄"></html:option>
						</html:select>
					</td>
				</tr>
				<tr>
					<td>
						证件编号
					</td>
					<td>
						<html:text property="zjbh"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						地址
					</td>
					<td>
						<html:text property="dz"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						随行人数
					</td>
					<td>
						<html:text property="rs"></html:text>
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
