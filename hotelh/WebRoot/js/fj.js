
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
   var idField = document.getElementById("fjno");
   // 1.创建XMLHttpRequest对象
   createXMLHttpRequest();
   var url = "/hotelh/aFj.do?fjno=" + encodeURIComponent(idField.value);
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
            setMessage(message);
        }
    }
}

// DOM方式：
// 1.document.getElementById() 返回id为指定值的元素
// 2.document.getElementsByTagName() 返回一个包含某个相同标签名的元素的结点列表
// 3.firstChild 指向结点列表中的第一个结点
// 4.document.createTextNode() 创建文本结点
// 5.document.createElement() 创建元素结点
// 6.appendChild(node) 将node结点添加到结点列表的末尾 
// 7.removeChild(node) 删除node结点
// 8.replaceChild(newnode, oldnode) 用newnode替换oldnode
// 9.innerHTML	HTML必须全部大写
// 10.   .className  修改css类别 
// 11.setAttribute("bgcolor", "#FFFAFA") 设置元素的属性值
function setMessage(message) {
     var userMessageElement = document.getElementById("userIdMessage");
     var messageText;
     if (message == "invalid") {
         userMessageElement.style.color = "red";
         messageText = "房间号已存在";
     } else {
         userMessageElement.style.color = "green";
         messageText = "房间号可用";
     }
     var messageBody = document.createTextNode(messageText);
     // if the messageBody element has been created simple replace it otherwise
     // append the new element
     if (userMessageElement.childNodes[0]) {
         userMessageElement.replaceChild(messageBody,  userMessageElement.childNodes[0]);
     } else {
         userMessageElement.appendChild(messageBody);
     }
}