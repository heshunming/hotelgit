<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<title>普通客户管理！</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
		<SCRIPT src="/hotelh/js/displat.js"></SCRIPT>
	</head>

	<body>
		<h3 id="subTitle">
			普通客户管理
		</h3>
		${error }

		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="tableSearch">
			<tr>
				<html:form action="/viewKhByKhmc.do">
					<td width="10%" align="right">
						客户名称
					</td>
					<td width="20%">
						<html:text property="khmc"></html:text>
					</td>
					<td width="10%">
						<html:submit value="查询" />
					</td>
				</html:form>

				<td width="10%" align="left">
					<a href="viewKh.do">	查询所有</a>
				</td>

			</tr>
		</table>
		
		
		<table width=80% border=0 align="center" cellpadding=0 cellspacing="1"
			bgcolor="#CCCCCC">
			<tr class="pt9" height="30">
				<td bgcolor="#FFFFFF">
					<b>客户名称</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>客户类型</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>客户性别</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>证件类型</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>证件编号</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>地址</b>
				</td>
				<td bgcolor="#FFFFFF">
					<b>随行人数</b>
				</td>
			</tr>
			<logic:iterate id="list" name="list">
				<tr class="pt9" height="24">
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="khmc" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="khlx.khlx" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="khxb" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="zjlx" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="zjbh" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="dz" />
					</td>
					<td bgcolor="#FFFFFF">
						<bean:write name="list" property="rs" />
					</td>
					<td bgcolor="#FFFFFF">
						<a
							href='viewBykhno.do?khno=<bean:write name="list" property="khno"/>'>修改</a>
					</td>
					<td bgcolor="#FFFFFF">
						<a
							href='deleKhByKhno.do?khno=<bean:write name="list" property="khno"/>'>删除</a>
					</td>
				</tr>
			</logic:iterate>
		</table>
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table">
			<tr>
				<td>
					共有 ${pagination.allJlNum} 条记录， 当前第 ${pagination.startPage+1} 页， 共
					${pagination.pageNum} 页
				</td>
				<c:choose>
					<c:when test="${pagination.startPage>0}">
						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeKh.do?page=0"> 首页 </a>
							</div>
						</td>
						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeKh.do?page=${pagination.startPage-1}">
									上一页 </a>
							</div>
						</td>
					</c:when>
					<c:otherwise>
						<td width="49">
							<div align="center">
								首页
							</div>
						</td>
						<td width="49">
							<div align="center">
								上一页
							</div>
						</td>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${pagination.startPage<pagination.pageNum-1}">
						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeKh.do?page=${pagination.startPage+1}">
									下一页 </a>
							</div>
						</td>
						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeKh.do?page=${pagination.pageNum-1}">
									尾页 </a>
							</div>
						</td>
					</c:when>
					<c:otherwise>
						<td width="49">
							<div align="center">
								下一页
							</div>
						</td>
						<td width="49">
							<div align="center">
								尾页
							</div>
						</td>
					</c:otherwise>
				</c:choose>
				<td>
					<form name="formzd" action="/hotelh/fenYeKh.do"
						onsubmit="return zds()" method="post">
						跳转到
						<input name="zzpage" value="${pagination.pageNum}" type="text"
							style="width: 20px; height: 16px; font-size: 12px; border: solid 1px #7aaebd;" />
						<input type="submit" value="提交" />
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>