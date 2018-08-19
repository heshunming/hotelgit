<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Language" content="zh-CN" />
		<meta name="Keywords" content="关键词1,关键词2，关键词3,关键词4,……" />
		<meta name="Description" content="你网页的简述" />
		<meta name="Robots" content="All" />
		<meta name="Generator" content="Dreamweaver" />
		<meta name="Author" content="第五只鼠，email" />
		<meta name="Copyright" content="本页版权归第五只鼠所有。All Rights Reserved" />

		<title>无标题文档</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<h3 id="subTitle">
			历史入住查询
		</h3>
		<form id="form1" name="form1" method="post" action="searchLsrzByZd.do">
			<table width="90%" border="0" align="center" cellpadding="0"
				cellspacing="0" id="tableSearch">
				<tr>
					<td width="20%">
						<select name="zd" class="select2">
							<option value="fj">
								房间号
							</option>
							<option value="kh">
								客户名称
							</option>
						</select>
					</td>
					<td width="30%">
						<input name="bl" type="text" class="input1" />
					</td>
					<td>
						<input type="submit" value="查询" />
					</td>
					<td width="10%" align="left">
						<a href="searchAllLsrz.do"> 查询所有</a>
					</td>
				</tr>
			</table>
		</form>
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table">
			<tr>
				<th width="5%" nowrap="nowrap"></th>
				<th width="5%" nowrap="nowrap" class="th">
					房间号
				</th>
				<th width="15%" nowrap="nowrap">
					客房类型
				</th>
				<th width="10%" nowrap="nowrap">
					客户名称
				</th>
				<th width="10%" nowrap="nowrap">
					客户类型
				</th>
				<th width="10%" nowrap="nowrap">
					入住时间
				</th>
				<th width="10%" nowrap="nowrap">
					结算时间
				</th>
				<th width="10%" nowrap="nowrap">
					实收金额
				</th>
			</tr>
			<logic:iterate id="r" name="lsrz">
				<tr>
					<td align="center">
						<input type="radio" name="lsid"
							value="<bean:write name="r" property="lsid"/>" />
					</td>
					<td align="center">
						<bean:write name="r" property="fjno" />
					</td>
					<td align="center">
						<bean:write name="r" property="fjlx" />
					</td>
					<td align="center">
						<bean:write name="r" property="khmc" />
					</td>
					<td align="center">
						<bean:write name="r" property="khlxno" />
					</td>
					<td align="center">
						<bean:write name="r" property="rzsj" />
					</td>
					<td align="center">
						<bean:write name="r" property="jssj" />
					</td>
					<td align="center">
						<bean:write name="r" property="ssje" />
					</td>
				</tr>

			</logic:iterate>
		</table>
		<br />
	</body>
</html>
