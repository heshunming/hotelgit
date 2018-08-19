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
<h3 id="subTitle">客房查询</h3>
<ul id="button">
	<li><a href="#">修改</a></li>
	<li><a href="#">删除</a></li>
	<li><a href="#">打印</a></li>
</ul>
<form id="form1" name="form1" method="post" action="viewRzByZd.do">
<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0" id="tableSearch">
        <tr>
            <td width="20%"><select name="zd" class="select2">
                <option value="fj">房间号</option>
                <option value="kh">客户名称</option>
                <option>客房状态</option>
            </select>            </td>
            <td width="30%"><input name="bl" type="text" class="input1" /></td>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
</form>
<form id="form2" name="form2" method="post" action="khTuiFang.do">
    <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0" id="table">
        <tr>
            <th width="5%" nowrap="nowrap"></th>
            <th width="5%" nowrap="nowrap" class="th">房间号</th>
            <th width="15%" nowrap="nowrap">客房类型</th>
            <th width="10%" nowrap="nowrap">客户名称</th>
            <th width="10%" nowrap="nowrap">压金</th>
            <th width="10%" nowrap="nowrap">入住时间</th>
			<th width="10%" nowrap="nowrap">预定天数</th>
        </tr>
        <logic:iterate id="r" name="rz">
        <tr>
	            <td align="center"><input type="radio" name="rzid" value="<bean:write name="r" property="rzid"/>" /></td>
            <td align="center"><bean:write name="r" property="fj.fjno"/></td>
            <td align="center"><bean:write name="r" property="fjlxno"/></td>
            <td align="center"><bean:write name="r" property="kh.khmc"/></td>
            <td><bean:write name="r" property="yj"/></td>
            <td align="center"><bean:write name="r" property="rzsj"/></td>
            <td><bean:write name="r" property="yzts"/></td>
        </tr>
        
        </logic:iterate>
    </table><br/>
    &nbsp;&nbsp;&nbsp;&nbsp;  <input type="submit" value="提交到结账" class="input1"/>
</form>
</body>
</html>
