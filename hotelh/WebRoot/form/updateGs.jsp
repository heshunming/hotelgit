<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add kh</title>
	</head>

	<body>
		<html:form action="/updateGs.do?gsno=${gs.gsno }">
		公司名称
		<html:text property="gsmc" value="${gs.gsmc }"></html:text>
			<br>
		客户类型
  		<html:text property="mm" value="${gs.mm }"></html:text>
			<br> 
		公司地址&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="gsdz" value="${gs.gsdz }"></html:text>
			<br>
		联系电话 <html:text property="gsdh" value="${gs.gsdh }"></html:text>
			<br>
		备注<html:text property="beizhu" value="${gs.beizhu }"></html:text>
			<input type="submit" value="提交" name="Submit">
		</html:form>
	</body>
</html>
