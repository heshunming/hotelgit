<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="khJieZhang.do?rzid=${rz.rzid }">
  <p>�ͻ�����
    <input name="khxm" type="text" id="khxm" value="${rz.kh.khmc }"/>
    �ͻ��Ա�
  <input name="khxb" type="text" id="khxb" value="${rz.kh.khxb }"/>
    ֤�����
  <input name="zjbh" type="text" id="zjbh" value="${rz.kh.zjbh }"/>
  </p>
  <p>�����
    <input name="fjno" type="text" id="fjno" value="${rz.fj.fjno }"/>
    ��������
  <input name="fjlx" type="text" id="fjlx" value="${rz.fj.fjlx.fjlx }"/>
    ����
  <input name="dj" type="text" id="dj" value="${rz.fj.fjlx.dj }"/>
  </p>
  <p> ��סʱ��
    <input name="rzsj" type="text" id="rzsj" value="${rz.rzsj }"/>
    Ԥס����
    <input name="yzts" type="text" id="yzts" value="${rz.yzts }"/>
    ʵס����
  <input name="szts" type="text" id="szts" value="${sz }" />
  </p>
  <p>Ԥ����
    <input name="yf" type="text" id="yfk" value="${rz.yj }"/>
    Ӧ����
  <input name="yfk" type="text" id="yfk" value="${ys }"/>
  </p>
  <p>
    <input type="submit" name="Submit2" value="�ύ����" />
  </p>
</form>
<p>&nbsp;</p>
</body>
</html>
