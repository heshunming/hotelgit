<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	if (session.getAttribute("userId") == null) {
		request.getRequestDispatcher("login.jsp").forward(request,response);
	}
%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>客房管理信息系统</title>
		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="js/menu.js"></script>
		<script type="text/javascript">
			function redi(args){
				var reqUrl;				
				switch (args)
				{
				case 0:				
				reqUrl="#";
				break;
				case 10:				
				  reqUrl="/hotelh/add/addYdKh.jsp";
				  break;
				case 11:				
				  reqUrl="viewAllYd.do";
				  break;
				case 20:				
				  reqUrl="viewAllFj.do?zt=zt";
				  break;
				case 21:				
				  reqUrl="/hotelh/add/addFj.jsp";
				  break;
				case 22:				
				  reqUrl="viewAllFj.do?gl=gl";
				  break;
				case 30:				
				  reqUrl="/hotelh/add/addKh.jsp";
				  break;
				case 31:
				  reqUrl="viewAllYd.do?yzr=yzr";
				  break;
				case 40:
				  reqUrl="viewAllRz.do?tf=tf";
				  break;
				case 50:
				  reqUrl="/hotelh/add/addKh.jsp";
				  break;
				case 51:
				  reqUrl="viewKh.do";
				  break;
				case 52:
				  reqUrl="viewAllHy.do";
				  break;
				case 53:
				  reqUrl="viewAllGs.do";
				  break;
				case 60:
				  reqUrl="viewFjMap.do";
				  break;
				case 61:
				  reqUrl="searchAllRz.do";
				  break;
				case 62:
				  reqUrl="searchAllLsrz.do";
				  break;
				case 63:
				  reqUrl="searchAllJs.do";
				  break;
				case 70:
				  reqUrl="viewAllRz.do";
				  break;
				case 71:
				  reqUrl="viewAllJs.do";
				  break;
				case 80:
				  reqUrl="viewAllCzy.do";
				  break;
				}
				iframe.location= reqUrl;
			}
		</script>
	</head>

	<body>
		<div class="top"></div>
		<div id="header">
			<div class="logo">
				客房管理信息系统
			</div>
			<div class="navigation">
				<ul>
					<li>
						欢迎您,
					</li>
					<li>
						<a href="#">管理员 :${username}</a>
					</li>
					<li>
						<a href="#">修改密码</a>
					</li>
					<li>
						<a href="login.jsp">退出</a>
					</li>
				</ul>
			</div>
		</div>


		<div id="content">

			<div class="left_menu">
				<ul id="nav_dot">
					<li>
						<h4 class="M1">
							<span></span>首页
						</h4>
						<div class="list-item none">
							<a href="#">公告</a>
						</div>
					</li>
					<li>
						<h4 class="M2">
							<span></span>预定管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(10)">预定登记</a>
							<a href='#' onclick="redi(11)">预定编辑</a>
						</div>
					</li>
					<li>
						<h4 class="M3">
							<span></span>客房管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(20)">客房状态</a>
							<a href='#' onclick="redi(21)">添加客房</a>
							<a href='#' onclick="redi(22)">客房管理</a>
						</div>
					</li>
					<li>
						<h4 class="M4">
							<span></span>接待管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(30)">接待登记</a>
							<a href='#' onclick="redi(31)">预定转入住</a>
						</div>
					</li>
					<li>
						<h4 class="M5">
							<span></span>调房管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(40)">调房登记</a>
						</div>
					</li>
					<li>
						<h4 class="M6">
							<span></span>客户管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(50)">添加客户</a>
							<a href='#' onclick="redi(51)">查询客户</a>
							<a href='#' onclick="redi(52)">会员管理</a>
							<a href='#' onclick="redi(53)">协议公司管理</a>
						</div>
					</li>
					<li>
						<h4 class="M8">
							<span></span>信息查询
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(60)">房间图</a>
							<a href='#' onclick="redi(61)">查询入住</a>
							<a href='#' onclick="redi(62)">查询历史入住</a>
							<a href='#' onclick="redi(63)">查询结算记录</a>
						</div>
					</li>
					<li>
						<h4 class="M9">
							<span></span>退房管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(70)">客人退房</a>
							<a href='#' onclick="redi(71)">结算管理</a>
						</div>
					</li>
					<li>
						<h4 class="M10">
							<span></span>人员管理
						</h4>
						<div class="list-item none">
							<a href='#' onclick="redi(80)">用户管理</a>
						</div>
					</li>
				</ul>

			</div>

			<div class="m-right">
				<div class="right-nav">
					<ul>
						<li>
							<img src="images/home.png">
						</li>
						<li style="margin-left: 25px;">
							您当前的位置：
						</li>
						<li>
							<a href="#">${location1}</a>
						</li>
						<li>
							>
						</li>
						<li>
							<a href="#">${location2}</a>
						</li>
					</ul>
				</div>
				<div class="main">
					<iframe src="main.jsp" name="iframe" width="100%" height=800></iframe>
					<br>
				</div>
			</div>
		</div>
		<div class="bottom"></div>
		<div id="footer">
			<p>
				
			</p>
		</div>
		<script>navList(12);</script>
	</body>
</html>

