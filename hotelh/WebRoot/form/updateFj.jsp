<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@include file="../taglibs.jsp"%>
<html>
	<head>
		<title>��ӿͷ�修改房间信息</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
	<html:javascript formName="updateFjForm"/>
		<html:form action="/updateFj.do?fjid=${kf.fjid}" onsubmit="return validateUpdateFjForm(this)">
			<p>
				房间号&nbsp;&nbsp;
				<html:text property="fjno" value="${kf.fjno}"></html:text>
				<br>
				<br>
				房间类型
				<html:select property="fjlxno">
					<option value="1" selected>
						单人间
					</option>
					<option value="2">
						双人间
					</option>
				</html:select>
			</p>
			<p>
				房间状态
				<html:text property="fjzt" value="${kf.fjzt}" readonly="true"></html:text>
			</p>
			<p>
				楼层 &nbsp; &nbsp;
				<html:text property="lc" value="${kf.lc}"></html:text>
			</p>
			<p>
				房间电话
				<html:text property="fjdh" value="${kf.fjdh}"></html:text>
			</p>
			<p>
				备注 &nbsp; &nbsp;
				<html:text property="beizhu" value="${kf.beizhu}"></html:text>
			</p>&nbsp;<input type="submit" value="提交" name="Submit">

		</html:form>

	</body>
</html>
