<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>登记入住</title>
		<script src="/hotelh/js/dzbl.js"></script>
		<script type="text/javascript">
function getFjlxno(){
alert(document.getElementsById("fjlxno"));
return document.getElementsById("fjlxno")
}
	function fjlx(){
	document.getElementsByName("kflxno")
	}

	function a(){
	
	document.submit();
	}

</script>
	</head>

	<body>
	<h3 id="subTitle">
			调房管理
		</h3>
		客户名称
		<html:text property="khmc" value="${kh.khmc}"></html:text>
		客户类型
		<html:text property="khlx" value="${kh.khlx.khlx}"></html:text>
		客户性别
		<html:text property="khxb" value="${kh.khxb}"></html:text>
		证件类型
		<html:text property="zjlx" value="${kh.zjlx}"></html:text>
		<br>
		证件编号
		<html:text property="zjbh" value="${kh.zjbh}"></html:text>
		<br>
		<br>
		<html:form action="viewFjByFjlx.do?khno=${kh.khno}&xgyd=xgyd">
		客房类型
		<select name="fjlxno" id="fjlxno">
			<option value="0">
				请选择房间类型..
			</option>
			<option value="1">
				单人间
			</option>
			<option value="2">
				标准间
			</option>
		</select>
		<input type="submit" value="查询">
		${error }
		</html:form>
		
		<html:form action="updateRzTiaoFang.do?khno=${kh.khno}&rzid=${rz.rzid}">
		预住天数<html:text property="yzts"></html:text>
		
		打折<select name="dz" id="dz">
				<option value="1">
					不打折
				</option>
				<option value="0.95">
					95%
				</option>
				<option value="0.9">
					90%
				</option>
				<option value="0.8">
					80%
				</option>
			</select>


			<br>收取预付押金<html:text property="yj" readonly="true"></html:text>
			<br>
			<table width=80% border=0 align="center" cellpadding=0
				cellspacing="1" bgcolor="#CCCCCC">
				<tr class="pt9" height="30">
					<td bgcolor="#FFFFFF">
						<b></b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>房间号</b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>房间类型</b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>单价</b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>房间状态</b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>楼层</b>
					</td>
					<td bgcolor="#FFFFFF">
						<b>房间电话</b>
					</td>
				</tr>
				<logic:iterate id="kf" name="kf">
					<tr class="pt9" height="24">
						<td bgcolor="#FFFFFF">
							<input name="fjid" type="radio" id="fjid" onclick="validate();"
								value="<bean:write name="kf" property="fjid"/>" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="fjno" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="fjlx.fjlx" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="fjlx.dj" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="fjzt" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="lc" />
							<br>
						</td>
						<td bgcolor="#FFFFFF">
							<bean:write name="kf" property="fjdh" />
						</td>
					</tr>
				</logic:iterate>
			</table>
			<input type="submit" value="提交">
		</html:form>
	</body>
</html>
