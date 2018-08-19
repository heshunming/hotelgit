<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html:html>
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
	<SCRIPT src="/hotelh/js/displat.js"></SCRIPT>
</head>

<body>
	<h3 id="subTitle">
		客房状态修改
	</h3>
	<br>



	<table width="90%" border="0" align="center" cellpadding="0"
		cellspacing="0" id="tableSearch">
		<tr>
			<html:form action="/viewFjByFjno.do">
				<td width="10%" align="right">
					房间号
				</td>
				<td width="20%">
					<html:text property="fjno"></html:text>
				</td>
				<td width="10%">
					<html:submit value="查询" />
				</td>
			</html:form>
			<html:form method="post" action="viewFjByFjzt.do">
				<td width="10%" align="right">
					客房状态
				</td>
				<td width="20%">
					<select name="fjzt" class="select2">
						<option value="空闲">
							空闲
						</option>
						<option value="入住">
							入住
						</option>
						<option value="预定">
							预定
						</option>
						<option value="维修">
							维修
						</option>
						<option value="脏房">
							脏房
						</option>
					</select>
				</td>
				<td width="10%">
					<html:submit value="查询" />
				</td>
			</html:form>

			<td width="10%" align="left">
				<a href="viewAllFj.do?zt=zt">查询所有</a>
			</td>

		</tr>
	</table>
	<html:form action="/xgFjzt.do?zt=zt">
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table2">
			<tr>
				<th width="5%" nowrap="nowrap" class="th">

				</th>
				<th width="5%" nowrap="nowrap" class="th">
					房间号
				</th>
				<th width="10%" nowrap="nowrap">
					房间状态
				</th>
				<th width="10%" nowrap="nowrap">
					房间类型
				</th>
				<th width="15%" nowrap="nowrap">
					楼层
				</th>
				<th width="15%" nowrap="nowrap">
					房间电话
				</th>
			</tr>


			<logic:iterate id="kf" name="kf">
				<tr>
					<td align="center" class="title2_style2">
						<input name="fjid" type="checkbox" id="fjid"
							value="<bean:write name='kf' property='fjid'/>" />
					</td>
					<td align="center" class="title2_style2">
						<bean:write name="kf" property="fjno" />

					</td>
					<td align="center">
						<bean:write name="kf" property="fjzt" />
					</td>
					<td align="center">
						<bean:write name="kf" property="fjlx.fjlx" />
					</td>
					<td align="center">
						<bean:write name="kf" property="lc" />
					</td>
					<td align="center">
						<bean:write name="kf" property="fjdh" />
					</td>
				</tr>
			</logic:iterate>
		</table>
		<br>
		<br>
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0" id="table">
			<tr>
				<td width="90">
					将所选房间改为
				</td>
				<td width="10">
					<html:select property="xgzt">
						<html:option value="空闲">空闲</html:option>
						<html:option value="入住">入住</html:option>
						<html:option value="预定">预定</html:option>
						<html:option value="维修">维修</html:option>
						<html:option value="脏房">脏房</html:option>
					</html:select>
				</td>
				<td width="10">
				<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</html:form>
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
							<a href="/hotelh/fenYeFjzt.do?page=0"> 首页 </a>
						</div>
					</td>

					<td width="49">
						<div align="center">
							<a href="/hotelh/fenYeFjzt.do?page=${pagination.startPage-1}">
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
							<a href="/hotelh/fenYeFjzt.do?page=${pagination.startPage+1}">
								下一页 </a>
						</div>
					</td>
					<td width="49">
						<div align="center">
							<a href="/hotelh/fenYeFjzt.do?page=${pagination.pageNum-1}">
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
				<form name="formzd" action="/hotelh/fenYeFjzt.do"
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
</html:html>
