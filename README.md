# hotelgit
本项目是一个基于SSH的客房管理系统，作为学习struts2，Spring4，hibernate4的初学者做的第一个项目。同时本项目中还有一些AJAX和jQuery的应用。
# 项目介绍
* 本系统主要完成客人的预定房间、操作员登记客人信息、按照客人要求选择房间、调整房间，以及客人离开时退房、结账功能。功能介绍如下：<br/>
  * 系统应该为本店所提供的客房建立记录，包括房间编号、类别、单价和当前状态。对客房的信息能进行添加、修改、删除和查询操作。<br/>
  * 当有顾客入住时，系统应该提供当前的客房信息给顾客，当顾客入住时需要对顾客进行登记，包括顾客的个人信息和入住时间等等。<br/>
  * 当顾客退房时，系统能对退房信息进行记录，删除对应的入住信息，修改客房状态，并自动结算出顾客应该支付的住宿费用，并将现金入库处理。<br/>
  * 当有顾客预订房间的时候，系统应该对房间的信息进行入库管理，修改房间的状态，保存顾客的信息和预订的信息。<br/>
  * 当有顾客需要调房时，系统应该先记录客人的费用，然后再保存顾客信息，同时对房间进行一个更新操作。<br/>
  * 当有顾客退房时应该保存顾客退房的信息。<br/>
  * 系统应该具有查询信息功能。<br/>
  * 系统能对管理员的信息进行操作。<br/>
# 数据库
* kh：客房；khlx：客户类型
* yd：预定
* rz: 入住
* fj：房间；fjlx：房间类型
* hy：会员
* szgs:协议公司
* js：结算
# 系统功能设计
<br/>
 ![](https://github.com/heshunming/hotelgit/blob/master/hotelh/images/%E4%BD%93%E7%BB%9F%E7%BB%93%E6%9E%84.png)
# 登录界面设计
<br/>
 ![](https://github.com/heshunming/hotelgit/blob/master/hotelh/images/%E7%99%BB%E5%BD%95%E7%95%8C%E9%9D%A2.png)
# 首页界面设计
<br/>
 ![](https://github.com/heshunming/hotelgit/blob/master/hotelh/images/%E9%A6%96%E9%A1%B5.png)
