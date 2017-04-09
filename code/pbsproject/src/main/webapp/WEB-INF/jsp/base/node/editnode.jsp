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
  function nodesave(){
	  jquerySubByFId('nodeform',nodesave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function nodesave_callback(data){
	  
	  message_alert(data);
  }
 
</script>
</head>
<body>


<form id="nodeform" action="${baseurl}node/editnodesubmit.action" method="post">
<input type="hidden" id="nodeid" name="pbsNodeInfoCustom.id" value="${pbsNodeInfo.id }"/>
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
								<TD height=30 width="15%" align=right >车桩编号：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="nodezh" name="pbsNodeInfoCustom.zh"  value="${pbsNodeInfo.zh }" readonly/>
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >车桩状态：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="nodezt" name="pbsNodeInfoCustom.zt"  value="${pbsNodeInfo.zt }"/>
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >自行车编号：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="nodebm" name="pbsNodeInfoCustom.bm" value="${pbsNodeInfo.bm }"/>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >所属站点：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="nodezd" name="pbsNodeInfoCustom.zd" value="${pbsNodeInfo.zd }"/>
								</div>
								<div id="sysuser_groupidTip"></div>
								</TD>
								
								
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="nodesave()">提交</a>
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