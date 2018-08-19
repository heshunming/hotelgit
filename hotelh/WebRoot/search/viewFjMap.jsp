<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<style type="text/css">
<!--
.STYLE1 {	font-size: x-large;
	font-weight: bold;
}
.STYLE2 {	font-size: xx-large; 
	font-weight: bold;
}
-->
</style>
</head>

<body>
<form id="form1" name="form1" method="post" action="">
  <p><span class="STYLE2">房型图</span></p>
  	<%
		Integer n = 0;
						%>
<table width="953" height="452" border="0">

    <tr>
    
				<logic:iterate name="fj" id="element">
		<%
			Integer a = n / 10;
				   					%>
		<!--<c:forEach items="${sessionScope.list1}" var="i"> -->	 
     	 <td bgcolor="<bean:write name="element" property="fjzt" />"><div align="center" class="STYLE1"><bean:write name="element" property="fjno" /></div></td>
  		
  		<%
			n++;
				if (a == 1)
				out.print("</tr>");
									%>
  		
  		</logic:iterate>
    <tr>
    
    <table width="572" height="43" border="0">
      <tr>
        <td width="89" height="37" bgcolor="#176B0E">&nbsp;</td>
        <td width="94" bgcolor="#FF6600">&nbsp;</td>
        <td width="92" bgcolor="#999900">&nbsp;</td>
        <td width="90" bgcolor="#959595">&nbsp;</td>
        <td width="90" bgcolor="#333333">&nbsp;</td>
        <td width="91" bgcolor="#00CCFF">&nbsp;</td>
      </tr>
    </table>
    <table width="573" border="0">
      <tr>
        <td width="89"><div align="center">空房</div></td>
        <td width="96"><div align="center">入住</div></td>
        <td width="91"><div align="center">脏房</div></td>
        <td width="92"><div align="center">预定</div></td>
        <td width="90"><div align="center">维修</div></td>
        <td width="89"><div align="center">自用</div></td> 
      </tr>
    </table>
					<table width="568" border="1">
						<tr>
							<td colspan="12">
								<div align="center" class="STYLE1">
									客房统计
								</div>
							</td>
						</tr>
						<tr>
							<td width="24" bgcolor="#176B0E">
								&nbsp;
							</td>
							<td width="56">
								${kx}
							</td>
							<td width="25" bgcolor="#FF6600">
								&nbsp;
							</td>
							<td width="57">
								${rz}
							</td>
							<td width="23" bgcolor="#999900">
								&nbsp;
							</td>
							<td width="59">
								${zf}
							</td>
							<td width="24" bgcolor="#959595">
								&nbsp;
							</td>
							<td width="59">
								${yd}
							</td>
							<td width="24" bgcolor="#333333">
								&nbsp;
							</td>
							<td width="59">
								${wx}
							</td>
							<td width="24" bgcolor="#00CCFF">
								&nbsp;
							</td>
							<td width="58">
								${zy}
							</td>
						</tr>
					</table>
				<tr>
					<p>
						&nbsp;
					</p>
				</tr>
			</table>
</form>
</body>
</html>