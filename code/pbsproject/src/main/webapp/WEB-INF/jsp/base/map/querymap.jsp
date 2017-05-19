<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script type="text/javascript" src="../js/easyui/themes/default/easyui.css"></script>
	<script type="text/javascript" src="../js/easyui/themes/icon.css"></script>
	<script type="text/javascript" src="../js/custom.box.main.js"></script>

    <style type="text/css">
      body,html,#container{
        height: 100%;
        margin: 0px;
        font:12px Arial;
      }
     
      #open{
      	position:fixed;
      	top:100px;
      	bottom:200px;
      	right:200px;
      	width:800px;
      }
      
      #tip{
      	color:red;
      }
      
    </style>
    <title>Marker example</title>
    
   <script src="../js/marker.js"></script>
   <script src="../js/jquery-1.4.4.js"></script>
  </head>
  <body>
    <!-- 此DIV用于存放地图，不可删除 -->
   <div id="container"></div>
   
		<div class="button-group">
		    <input type="button" class="button" value="打开调度窗口" onClick="javascript:openInfo()"/>
		      <input type="button" class="button" value="关闭调度窗体" onClick="javascript:infoWindow.close()"/>
		    <!--
		    <input type="button" style="position:fixed" value="按钮"/>
		    -->
		    
		    <!--  
		    <iframe width=420 height=330 frameborder=0 scrolling=auto src=${baseurl}dispacher.action></iframe>
		    -->
		</div>
		<div id="tip">
		   点击页面右下角按钮即可开始调度
		</div>
   <script src="http://webapi.amap.com/maps?v=1.3&key=ee1710c4e180567b17806859073595cc"></script>
   <script type="text/javascript">
   //新建地图 
   		var infoWindow;
        var map = new AMap.Map('container',{
        	resizeEnable: true,
        	center: [120.161,30.2523],//地图中心点
        	zoom:15
        	});
   
		   $.ajax({
			   url : "${baseurl}querymap_result.action",
			   type : "post",
			   dataType : "json",
			   success : function(data){
				   console.log(data);
				   //测试总条数   2360  测试通过
				   console.log("记录总数=="+data.total);
				   console.log("rentnamelist=="+data.rows[0].id);
				   console.log("rentnamelist中的operNum=="+data.rows[0].operNum);
				   //循环输出点位标记
				  for(var i = 0;i<data.total;i++){
					  var operNum = data.rows[i].operNum;
					  var maxNumber = data.rows[i].maxNumber;
					  
					  if(operNum < 0.2*maxNumber){
						  var icon = new AMap.Icon({
		    					image: '../images/bike/green.png',
		    					size: new AMap.Size(32, 32)
		    				});
					  }else if(operNum > 0.8*maxNumber){
						  var icon = new AMap.Icon({
		    					image: '../images/bike/red.png',
		    					size: new AMap.Size(32, 32)
		    				});
					  }else{
						  var icon = new AMap.Icon({
		    					image: '../images/bike/blue.png',
		    					size: new AMap.Size(32, 32)
		    				});
					  }
					  
					  var lng = data.rows[i].cLng;
					  var lat = data.rows[i].cLat;
					  
	    				marker = new AMap.Marker({
	    					icon: icon,
	    					position: [lng,lat],
	    					offset: new AMap.Pixel(-16,-32),
	    					title: data.rows[i].id+":"+data.rows[i].rentName+",在架"+data.rows[i].operNum+",最大储量"+data.rows[i].maxNumber,
	    					map: map
	    				});
				  }
			   },
			   error : function(){
				   alert("加载站点失败");
			   },
		   });
		   
		   
    </script>
  </body>
    <script type="text/javascript">
    //跳转至调度页面
    	function openInfo(){
    		//createmodalwindow("添加调度信息",800,250,'${baseurl}dispacher.action');
    		//新窗口打开
    		//window.open("${baseurl}dispacher.action","","top=100,left=100,width=300,height=200");
    		
    		//当前窗口打开
    		//window.location.href="${baseurl}dispacher.action"; 
    		
    		//var div="";
    		//	div+='<div id="open">';
	    	//	div+='<iframe  width=800 height=250 frameborder=0 scrolling=auto src=${baseurl}dispacher.action>';
	    	//	div+='</iframe>';
    		//	div+='</div>';

    		//var $div = $(div);
    		//$("#container").append($div);
    		
    		//添加iframe
    		var info = [];
    		info.push("<iframe  width=800  frameborder=0 scrolling=auto src=${baseurl}dispacher.action>");
    		infoWindow = new AMap.InfoWindow({
    			content:info.join("<br/>")
    		});
    		infoWindow.open(map,map.getCenter());
    	}
    </script>
    <script type="text/javascript" src="http://webapi.amap.com/demos/js/liteToolbar.js"></script>
    
</html>