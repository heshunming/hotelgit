
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

function validate() {
   // 0.获取文本框中的数据
  
   var fjid=  document.getElementsByName("fjid");
	   for(var i=0;i<fjid.length;i++)
	   
	   {
	   
	    var  fjids;
	     if(fjid[i].checked==true)  
	     {
	        fjids=fjid[i].value;
	        break;
	      }  
	      
	      
	   }
  
  // alert(document.getElementById[1]("fjid").value);
   // 1.创建XMLHttpRequest对象
   createXMLHttpRequest();
   var url = "/hotelh/aYj.do?fjid=" +fjids;
   // 2.注册回调函数
   // 只需要函数名，不要有小括号
   xmlHttp.onreadystatechange = callback;
   // 3.设置连接参数
   // 第一个参数：请求方式。
   // 第二个参数：url。如果是get方式，请求参数也在url里
   xmlHttp.open("GET", url, true);
   // post方式必须设置请求报头
   // xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");  
   // post方式，把请求参数写在send中
   // xmlHttp.send(queryString);
   // 4.发送请求
   xmlHttp.send(null);
}

function callback() {
	// 5.在回调函数中，处理服务器端响应的数据
    if (xmlHttp.readyState == 4) {
        if (xmlHttp.status == 200) {
            // "message"是在ValidateServlet中，设置的xml的结点名
            var domObj = xmlHttp.responseXML;
            var message = domObj.getElementsByTagName("message")[0].firstChild.data;
             var dz = document.getElementById("dz").value;
   			 var yzts = document.getElementById("yzts").value;
   			 document.getElementById("yj").value=dz*yzts*message;
           
        }
    }
}

