<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>自行车管理</title>

<script type="text/javascript">
	//datagrid列定义
	var columns_v = [ [ {
		field : 'bm',//对应json中的key
		title : '编号',
		width : 250
	}, {
		field : 'rq',//对应json中的key
		title : '日期 ',
		width : 120
	}, {
		field : 'cj',//对应json中的key
		title : '厂家',
		width : 120,
	}, {
		field : 'zt',//对应json中的key
		title : '状态',
		width : 120
	},{
		field : 'dt',//对应json中的key
		title : '动态',
		width : 120
	},{
		field : 'zd',//对应json中的key
		title : '站点',
		width : 120
	},{
		field : 'cz',//对应json中的key
		title : '车桩',
		width : 120
	}] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加用户信息", 800, 250, '${baseurl}user/addsysuser.action');
		}
	} ];

	//加载datagrid

	$(function() {
		$('#bikeinfolist').datagrid({
			title : '自行车查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}bike/querybike_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList:[5,10,15],
			toolbar : toolbar_v
		});
	});
	
	//查询方法
	function querybike(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#bikequeryForm").serializeJson();
		//console.log(formdata);
		$('#bikeinfolist').datagrid('load',formdata);
	}
</script>

</head>
<body>

	<!-- html的静态布局 -->
  <form id="bikequeryForm">
	<!-- 查询条件 -->
	<TABLE class="table_search">
		<TBODY>
			<TR>
				<TD class="left">自行车编码：</td>
				<td><INPUT type="text" name="pbsBikeInfoCustom.bm" /></TD>
				<TD class="left">自行车厂家：</TD>
				<td><INPUT type="text" name="pbsBikeInfoCustom.cj" /></TD>

				<TD class="left">自行车动态：</TD>
				<td><INPUT type="text" name="pbsBikeInfoCustom.dt" /></TD>
				<TD class="left">自行车状态：</TD>
				<td><select name="pbsBikeInfoCustom.zt">
						<option value="">请选择</option>
						<option value="入库">入库</option>
						<option value="在用">在用</option>
						<option value="故障">故障</option>
						<option value="丢失">丢失</option>
						<option value="报废">报废</option>

				</select></TD>
				<td><a id="btn" href="#" onclick="querybike()"
					class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
			</TR>


		</TBODY>
	</TABLE>

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="bikeinfolist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
</body>
</html>