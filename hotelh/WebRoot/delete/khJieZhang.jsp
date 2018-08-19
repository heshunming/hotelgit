<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="khJieZhang.do?rzid=${rz.rzid }">
  <p>客户姓名
    <input name="khxm" type="text" id="khxm" value="${rz.kh.khmc }"/>
    客户性别
  <input name="khxb" type="text" id="khxb" value="${rz.kh.khxb }"/>
    证件编号
  <input name="zjbh" type="text" id="zjbh" value="${rz.kh.zjbh }"/>
  </p>
  <p>房间号
    <input name="fjno" type="text" id="fjno" value="${rz.fj.fjno }"/>
    房间类型
  <input name="fjlx" type="text" id="fjlx" value="${rz.fj.fjlx.fjlx }"/>
    单价
  <input name="dj" type="text" id="dj" value="${rz.fj.fjlx.dj }"/>
  </p>
  <p> 入住时间
    <input name="rzsj" type="text" id="rzsj" value="${rz.rzsj }"/>
    预住天数
    <input name="yzts" type="text" id="yzts" value="${rz.yzts }"/>
    实住天数
  <input name="szts" type="text" id="szts" value="${sz }" />
  </p>
  <p>预付款
    <input name="yf" type="text" id="yfk" value="${rz.yj }"/>
    应付款
  <input name="yfk" type="text" id="yfk" value="${ys }"/>
  </p>
  <p>
    <input type="submit" name="Submit2" value="提交结账" />
  </p>
</form>
<p>&nbsp;</p>
</body>
</html>
