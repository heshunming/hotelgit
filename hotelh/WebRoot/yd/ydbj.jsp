<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<meta http-equiv="Content-Language" content="zh-CN" />
		<meta name="Keywords" content="关键词1,关键词2，关键词3,关键词4,……" />
		<meta name="Description" content="你网页的简述" />
		<meta name="Robots" content="All" />
		<meta name="Generator" content="Dreamweaver" />
		<meta name="Author" content="第五只鼠，email" />
		<meta name="Copyright" content="本页版权归第五只鼠所有。All Rights Reserved" />

		<title>预订管理</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
		<SCRIPT src="/hotelh/js/displat.js"></SCRIPT>
	</head>

	<body>
		<h3 id="subTitle">
			预订管理
		</h3>


		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="tableSearch">
			<tr>
				<html:form method="post" action="viewYdByKhmc.do">
					<td width="15%" align="right">
						客户姓名
					</td>
					<td width="15%">
						<input name="mc" type="text" class="input1" />

					</td>
					<td width="15%" align="center">
						<html:submit>查询</html:submit>
					</td>
				</html:form>
			</tr>
			<tr>
				<html:form method="post" action="viewYdByFjno.do">
					<td width="17%" align="right">
						客房编号
						<br>
					</td>
					<td width="13%">
						<input name="fjno" type="text" class="input1" />

						<br>
					</td>
					<td width="10%" align="center">
						<html:submit>查询</html:submit>
						<br>
					</td>
				</html:form>

				<td width="5%" align="center">
					<a href="viewAllYd.do">查询所有</a>
				</td>

			</tr>
		</table>


		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table">
			<tr>


				<th width="15%" nowrap="nowrap">
					客房类型
				</th>
				<th width="10%" nowrap="nowrap">
					客房编号
				</th>
				<th width="10%" nowrap="nowrap">
					客户姓名
				</th>
				<th width="10%" nowrap="nowrap">
					客户性别
				</th>
				<th width="15%" nowrap="nowrap">
					证件编号
				</th>
				<th width="10%" nowrap="nowrap">
					预住天数
				</th>
				<th width="15%" nowrap="nowrap">
					预定压金
				</th>
				<th width="10%" nowrap="nowrap">
					预定时间
				</th>
				<th width="10%" nowrap="nowrap" colspan="2">
					操作
				</th>

			</tr>
			<logic:present name="yd" scope="request">
				<logic:iterate id="yd" name="yd" scope="request">

					<tr>
						<td align="center">
							<bean:write name="yd" property="fj.fjlx.fjlx" />
						</td>
						<td align="center">
							<bean:write name="yd" property="fj.fjno" />
						</td>
						<td align="center">
							<bean:write name="yd" property="kh.khmc" />
						</td>
						<td>
							<bean:write name="yd" property="kh.khxb" />
						</td>
						<td align="center">
							<bean:write name="yd" property="kh.zjbh" />
						</td>
						<td align="center">
							<bean:write name="yd" property="yzts" />
						</td>
						<td>
							<bean:write name="yd" property="ydyj" />
						</td>
						<td align="center">
							<bean:write name="yd" property="ydsj" />
						</td>

						<td width="10%">
							<a href="xgYd.do?ydid=${yd.ydid }">修改</a>
						</td>
						<form method="post" action="deleYdByYdid.do">
						<td width="10%">
							<input type="hidden" name="ydid"
								value="<bean:write name='yd' property='ydid'/>">
							<html:submit>删除
						</html:submit>
						</td>
					</tr>
				</logic:iterate>
			</logic:present>
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
								<a href="/hotelh/fenYeYd.do?page=0"> 首页 </a>
							</div>
						</td>

						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeYd.do?page=${pagination.startPage-1}">
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
								<a href="/hotelh/fenYeYd.do?page=${pagination.startPage+1}">
									下一页 </a>
							</div>
						</td>
						<td width="49">
							<div align="center">
								<a href="/hotelh/fenYeYd.do?page=${pagination.pageNum-1}">
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
					<form name="formzd" action="/hotelh/fenYeYd.do"
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
