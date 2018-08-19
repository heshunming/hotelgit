<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Language" content="zh-CN" />
		<meta name="Keywords" content="关键词1,关键词2，关键词3,关键词4,……" />
		<meta name="Description" content="你网页的简述" />
		<meta name="Robots" content="All" />
		<meta name="Generator" content="Dreamweaver" />
		<meta name="Author" content="第五只鼠，email" />
		<meta name="Copyright" content="本页版权归第五只鼠所有。All Rights Reserved" />
		<title>系统操作员管理！</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
	<html:javascript formName="viewByfjnoForm"/>
		<h3 id="subTitle">
			操作员管理
		</h3>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="tableSearch">
			<tr>
				<td align="center">
					<a href="/hotelh/add/addCzy.jsp"><h3 id="subTitle">
							添加操作员
						</h3>
					</a>
				</td>
			</tr>
			<tr>
				<html:form action="/viewCzyByName.do" onsubmit="return validateViewByfjnoForm(this)">
					<td width="10%" align="right">
						用户名
					</td>
					<td width="20%">
						<html:text property="username"></html:text>
					</td>
					<td width="10%">
						<html:submit value="查询" />
					</td>
				</html:form>

				<td width="10%" align="left">
					<a href="viewAllCzy.do"> 查询所有</a>
				</td>

			</tr>
		</table>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table2">
			<tr class="pt9" height="30">
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>用户名</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>密码</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>用户类型</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>修改密码</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>删除</b>
				</td>
			</tr>
			<logic:iterate id="czy" name="czy">
				<tr class="pt9" height="24">
					<td align="center" class="title2_style2">
						<bean:write name="czy" property="username" />
					</td>
					<td align="center" class="title2_style2">
						<bean:write name="czy" property="password" />
					</td>
					<td align="center">
						<bean:write name="czy" property="yhqs.qsmc" />
					</td>
					<td align="center">
						<a
							href='viewCzyByCzyid.do?czyid=<bean:write name="czy" property="czyid"/>'>修改</a>
					</td>
					<td align="center">
						<a
							href='deleCzy.do?czyid=<bean:write name="czy" property="czyid"/>'>删除</a>
					</td>
				</tr>
			</logic:iterate>
		</table>
	</body>
</html>
