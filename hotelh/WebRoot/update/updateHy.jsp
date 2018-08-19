<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add kh</title>
	</head>

	<body>
		<html:form action="updateHy.do?hyno=${hy.hyno }">
		客户名称
		<html:text property="hyxm" value="${hy.hyxm }"></html:text>
			<br>
		客户密码
  		<html:text property="hymm" value="${hy.hymm }"></html:text>
			<br> 
		客户性别&nbsp;<html:select property="hyxb">
				<html:option value="男" key="男"></html:option>
				<html:option value="女" key="女"></html:option>
			</html:select>
			<br> 
		证件类型&nbsp;<html:select property="zjlb">
				<html:option value="身份证" key="身份证"></html:option>
				<html:option value="户口薄" key="户口薄"></html:option>
			</html:select>
			<br> 
		证件编号 <html:text property="zjbh" value="${hy.zjbh }"></html:text>
			<br> 
		地址&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="dz" value="${hy.dz }"></html:text>
			<br>
		联系电话 <html:text property="lxdh" value="${hy.lxdh }"></html:text>
			<br>
			备注<html:text property="beizhu" value="${hy.beizhu }"></html:text>
			<input type="submit" value="提交" name="Submit">
		</html:form>
	</body>
</html>
