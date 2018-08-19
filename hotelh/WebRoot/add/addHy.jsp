<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../taglibs.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>add kh</title>
		<link href="/hotelh/css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
	<html:javascript formName="addHyForm"/>
		<html:form action="addHy.do" onsubmit="return validateAddHyForm(this)">		
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<table width="29%" height="218" border="0" align="center" cellpadding="0"
				cellspacing="0" id="tableSearch">
              <tr>
                <td bordercolor="#0099CC">客户名称</td>
                <td><html:text property="hyxm"></html:text></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">客户密码</td>
                <td><html:text property="hymm"></html:text></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">客户性别</td>
                <td><html:select property="hyxb">&nbsp; 
				<br><html:option value="男" key="男"></html:option>
				<html:option value="女" key="女"></html:option>
			</html:select>				</td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">证件类型</td>
                <td><html:select property="zjlb">
				<html:option value="身份证" key="身份证"></html:option>
				<html:option value="户口薄" key="户口薄"></html:option>
			</html:select></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">证件编号</td>
                <td><html:text property="zjbh"></html:text></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">地址</td>
                <td><html:text property="dz"></html:text></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">联系电话</td>
                <td><html:text property="lxdh"></html:text></td>
              </tr>
              <tr>
                <td bordercolor="#0099CC">备 注</td>
                <td><html:text property="beizhu"></html:text></td>
              </tr>
              <tr>
              <td colspan="2">
                <div align="center">
                  <input type="submit" value="提交"/>               
                </div></td>
              </tr>
            </table>
			
		</html:form>
	</body>
</html>
