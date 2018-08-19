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
		<title>查询所有会员！</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<h3 id="subTitle">
			会员管理
		</h3>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="tableSearch">
			<tr>
				<td align="center">
					<a href="/hotelh/add/addHy.jsp"><h3 id="subTitle">
							添加会员
						</h3>
					</a>
				</td>
			</tr>
			<tr>
				<html:form action="/viewHyByHyxm.do">
					<td width="10%" align="right">
						会员姓名
					</td>
					<td width="20%">
						<html:text property="hyxm"></html:text>
					</td>
					<td width="10%">
						<html:submit value="查询" />
					</td>
				</html:form>

				<td width="10%" align="left">
					<a href="viewAllHy.do"> 查询所有</a>
				</td>

			</tr>
		</table>

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table2">
			<tr class="pt9" height="30">
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>会员姓名</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center" class="th">
					<b>会员性别</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>证件类型</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>证件编号</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>地址</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>联系电话</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>修改</b>
				</td>
				<td width="10%" nowrap="nowrap" align="center">
					<b>删除</b>
				</td>
			</tr>
			<logic:iterate id="hy" name="hy">
				<tr class="pt9" height="24">
					<td align="center" class="title2_style2">
						<bean:write name="hy" property="hyxm" />
					</td>
					<td align="center" class="title2_style2">
						<bean:write name="hy" property="hymm" />
					</td>
					<td align="center">
						<bean:write name="hy" property="zjlb" />
					</td>
					<td align="center">
						<bean:write name="hy" property="zjbh" />
					</td>
					<td align="center">
						<bean:write name="hy" property="dz" />
					</td>
					<td align="center">
						<bean:write name="hy" property="lxdh" />
					</td>
					<td align="center">
						<a
							href='viewHyByHyno.do?hyno=<bean:write name="hy" property="hyno"/>'>修改</a>
					</td>
					<td align="center">
						<a
							href='deleHy.do?hyno=<bean:write name="hy" property="hyno"/>'>删除</a>
					</td>
				</tr>
			</logic:iterate>
		</table>
	</body>
</html>
