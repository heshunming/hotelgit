<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page language="java"%>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<title>提前加载分页文章</title>

<style type="text/css">
/* 页面字体样式 */
body, td, input {
    font-family:Arial;
    font-size:12px;
}

/* 表格基本样式 */
table.default {
    border-collapse:collapse;
}

/* 表格单元格样式 */
table.default td {
    border:1px solid black;
    padding:3px;
    height:27px;
}

/* 列头样式 */
table.default td.item {
    background:#006699;
    color:#fff;
    text-align:center;
}

/* 分页链接span样式 */
span.pageLink {
    font-size:12px;
    margin:3px;
    font-weight:bold;
    padding:2px;
    border:1px solid #003366;
}

/* 分页链接样式 */
span.pageLink a {
    color:#003366;
    font-weight:normal;
    text-decoration:none;
}

/* div统一样式 */
div {
    margin-top:10px;
}

/* 文章容器样式 */
#container {
    width:600px;
    font-size:14px;
}

/* 分页div样式 */
#pageDiv {
    text-align:right;
}
</style>

<script type="text/javascript">

var xmlHttp;

function createXMLHttpRequest() {
	// 判断浏览器类型
    if (window.ActiveXObject) {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    } 
    else if (window.XMLHttpRequest) {
        xmlHttp = new XMLHttpRequest();
    }
}

function callback() {

	if(xmlHttp.readyState == 4) {
		if(xmlHttp.status == 200) {
   			var domObj = xmlHttp.responseXML;
            var message = domObj.getElementsByTagName("message")[0].firstChild.data;
            
            var responseDiv =document.getElementById("textDiv");
   			responseDiv.appendChild(message);
		} 
	}
}

function validate() {

   var no = document.getElementById("select").value;

   createXMLHttpRequest();
   
   var url = "/hotelh/ajaxLX?no=" + no;

   xmlHttp.onreadystatechange = callback;

   xmlHttp.open("GET", url, true);


   xmlHttp.send(null);
}


</script>
</head>

<body>
<h1>提前加载分页文章</h1>



<p>
  <select name="select"  onBlur="validate()">
    <option value="1">1</option>
    <option value="2">2</option>
  </select>
</p>
<div id="textDiv">  
</div>

</body>
</html>
