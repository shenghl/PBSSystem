<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>添加自行车</title>
<script type="text/javascript">
  function rentsave(){
	  jquerySubByFId('rentform',rentsave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function rentsave_callback(data){
	  
	  message_alert(data);
  }
 
</script>
</head>
<body>


<form id="rentform" action="${baseurl}rent/editrentsubmit.action" method="post">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;站点信息</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							
							<TR>
								<TD height=30 width="15%" align=right >站点编号：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="rent_id" name="pbsRentInfoCustom.id"  value="${pbsRentInfo.id }" readonly/>
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >所属区域：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="rent_zoneName" name="pbsRentInfoCustom.zoneName"  value="${pbsRentInfo.zoneName }"/>
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >所属街道：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="rent_road" name="pbsRentInfoCustom.road" value="${pbsRentInfo.road }"/>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >站点名称：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="rent_rentName" name="pbsRentInfoCustom.rentName" value="${pbsRentInfo.rentName }"/>
								</div>
								<div id="sysuser_groupidTip"></div>
								</TD>
								
								
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >最大容量：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="rent_maxNumber" name="pbsRentInfoCustom.maxNumber"  value="${pbsRentInfo.maxNumber }"/>
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >纬度：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="rent_lat" name="pbsRentInfoCustom.lat" value="${pbsRentInfo.lat }" />
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >经度：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="rent_lng" name="pbsRentInfoCustom.lng" value="${pbsRentInfo.lng }" />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="rentsave()">提交</a>
								<a id="closebtn"  class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
							  </td>
							</tr>
						
							</TBODY>
						</TABLE>
					</TD>
				</TR>
   </TBODY>
</TABLE>
</form>
</body>
</html>