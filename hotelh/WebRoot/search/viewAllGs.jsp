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
		<title>查询所有协议公司！</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<h3 id="subTitle">
			协议公司管理
		</h3>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="tableSearch">
			<tr>
				<td align="center">
					<a href="/hotelh/add/addGs.jsp"><h3 id="subTitle">
							添加协议公司
						</h3>
					</a>
				</td>
			</tr>
			<tr>
				<html:form action="/viewGsByGsmc.do">
					<td width="10%" align="right">
						公司名称
					</td>
					<td width="20%">
						<html:text property="gsmc"></html:text>
					</td>
					<td width="10%">
						<html:submit value="查询" />
					</td>
				</html:form>

				<td width="10%" align="left">
					<a href="viewAllGs.do"> 查询所有</a>
				</td>

			</tr>
		</table>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table2">
			<tr class="pt9" height="30">
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>公司名称</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>公司密码</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>公司地址</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>公司电话</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>备注</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>修改</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>删除</b>
				</td>
			</tr>
			<logic:iterate id="gs" name="gs">
				<tr class="pt9" height="24">

					<td align="center" class="title2_style2">
						<bean:write name="gs" property="gsmc" />
					</td>
					<td align="center">
						<bean:write name="gs" property="mm" />
					</td>
					<td align="center">
						<bean:write name="gs" property="gsdz" />
					</td>
					<td align="center">
						<bean:write name="gs" property="gsdh" />
					</td>
					<td align="center">
						<bean:write name="gs" property="beizhu" />
					</td>
					<td align="center">
						<a
							href='viewGsByGsno.do?gsno=<bean:write name="gs" property="gsno"/>'>修改</a>
					</td>
					<td align="center">
						<a
							href='deleGs.do?gsno=<bean:write name="gs" property="gsno"/>'>删除</a>
					</td>
				</tr>
			</logic:iterate>
		</table>
	</body>
</html>
