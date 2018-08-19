<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>update kH</title>

	</head>

	<body> 
		<html:form action="/updateKh.do?khno=${kh.khno}" >
			<p>
				客户名称&nbsp;&nbsp;
				<html:text property="khmc" value="${kh.khmc}"></html:text>
				<br>
				<br> 
				客户类型 
				&nbsp;&nbsp;<html:select property="khlxno">
					<option value="1" selected>
						普通用户
					</option>
					<option value="2">
						会员
					</option>
					<option value="3">
						协义公司
					</option>
				</html:select>
			</p>
			<p> 
				客户性别 
				&nbsp;&nbsp;<html:select property="khxb">
					<option value="男" selected>
						男
					</option>
					<option value="女">
						女
					</option>
				</html:select>
			</p>
			<p> 
				证件类型 &nbsp; <html:select property="zjlx"><html:option value="身份证" key="身份证"></html:option>
					<html:option value="户口薄" key="户口薄"></html:option>
				</html:select>
			</p>
			<p>
				证件编号 &nbsp;
				<html:text property="zjbh" value="${kh.zjbh}"></html:text>
			</p> 
			地址&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="dz" value="${kh.dz}"></html:text>
			<br> 
		随行人数&nbsp;&nbsp;  <html:text property="rs" value="${kh.rs}"></html:text>
			<br>
			<p> 
				备注 &nbsp; &nbsp; &nbsp; 
				<html:text property="beizhu" value="${fj.beizhu}"></html:text>
			</p>&nbsp;<input type="submit" value="提交" name="Submit">

		</html:form>
	</body>
</html>
