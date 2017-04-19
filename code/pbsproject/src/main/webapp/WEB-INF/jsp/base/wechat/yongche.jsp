<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="chrome=1">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width" />
    <style type="text/css">
      body,html,#container{
        height: 100%;
        margin: 0px;
      }
      .btn{
      position:fixed;
      left:40%;
      top:80%;
      }
      .class_liji{
      position:fixed;
      left:33%;
      top:70%;
      }
    </style>
<title>公共自行车助手</title>
<!-- 引入 WeUI -->
<link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.1/weui.min.css"/>
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script src="/pbsproject/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=cfa08784f1be35f90f8b8f27f42b9999"></script>
<script type="text/javascript">

var latitude;
var longitude;


	//function jssdk() {
	$(function(){
		$.ajax({
			url : "http://ry16704270.imwork.net/pbsproject/wechatconfig.action",
			type : 'post',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			data : {
				'url' : location.href.split('#')[0]
			},
			success : function(data) {
				wx.config({
					debug : true,
					appId : data.data.appId,
					timestamp : data.data.timestamp,
					nonceStr : data.data.nonceStr,
					signature : data.data.signature,
					jsApiList : [ 'checkJsApi', 'onMenuShareTimeline',
							'onMenuShareAppMessage', 'onMenuShareQQ',
							'onMenuShareWeibo', 'hideMenuItems',
							'showMenuItems', 'hideAllNonBaseMenuItem',
							'showAllNonBaseMenuItem', 'translateVoice',
							'startRecord', 'stopRecord', 'onRecordEnd',
							'playVoice', 'pauseVoice', 'stopVoice',
							'uploadVoice', 'downloadVoice', 'chooseImage',
							'previewImage', 'uploadImage', 'downloadImage',
							'getNetworkType', 'openLocation', 'getLocation',
							'hideOptionMenu', 'showOptionMenu', 'closeWindow',
							'scanQRCode', 'chooseWXPay',
							'openProductSpecificView', 'addCard', 'chooseCard',
							'openCard' ]
				});
			}
		});
		
		$("#liji").click(function(){
			wx.scanQRCode({
			    needResult: 1, // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
			    scanType: ["qrCode","barCode"], // 可以指定扫二维码还是一维码，默认二者都有
			    success: function (res) {
			    var result = res.resultStr; // 当needResult 为 1 时，扫码返回的结果
			    //alert(typeof result);
			    //var a = "{rent:1001,node:1}";
			    //location.href= "http://ry16704270.imwork.net/pbsproject/wechat/riding.action?message="+a;
			    location.href=result;
			}
			});
		});
		
		
	});
	
		wx.ready(function(){
			
			var map = new AMap.Map('container',{
	            resizeEnable: true,
	            zoom: 16,
	            //center: [longitude, latitude]
	        });
			
			AMap.plugin(['AMap.ToolBar','AMap.Scale','AMap.Geolocation'],function(){
		        var toolBar = new AMap.ToolBar();
		        var scale = new AMap.Scale();
		        var geolocation = new AMap.Geolocation();
		        map.addControl(toolBar);
		        map.addControl(scale);
		        map.addControl(geolocation);
		    });
			
			wx.getLocation({
			      success: function (res) {
			        
			        latitude=res.latitude;
			        longitude=res.longitude;
					
			        map.setCenter([longitude,latitude]);
					
				    loadData();
				    
			      },
			      cancel: function (res) {
			        alert('用户拒绝授权获取地理位置');
			      }
			  });
			
			function loadData(){
				$.ajax({
					   url : "${baseurl}querymap_result.action",
					   type : "post",
					   dataType : "json",
					   success : function(data){
						   //测试总条数   2360  测试通过
						   console.log("记录总数=="+data.total);
						   console.log("rentnamelist=="+data.rows[0].id);
						   //循环输出点位标记
						  for(var i = 0;i<data.total;i++){
							  var icon = new AMap.Icon({
			    					image: '../images/bike/blue.png',
			    					size: new AMap.Size(36, 36)
			    				});
			    				marker = new AMap.Marker({
			    					icon: icon,
			    					position: [data.rows[i].lng,data.rows[i].lat],
			    					offset: new AMap.Pixel(-12,-12),
			    					title: data.rows[i].id+":"+data.rows[i].rentName+":"+data.rows[i].lng+","+data.rows[i].lat,
			    					map: map
			    				});
						  }
					   },
					   error : function(){
						   alert("加载站点失败");
					   },
				   }); 
			}
			
		});
	

	function isWeiXin5() {
		var ua = window.navigator.userAgent.toLowerCase();
		var reg = /MicroMessenger\/[5-9]/i;
		return reg.test(ua);
	}

</script>
</head>
<body>

<div id="container" tabindex="0"></div>
<!--<canvas id="myCanvas" width="200" height="100" style="position:fixed;left:75px;top:400px;border:1px solid #d3d3d3;">
您的浏览器不支持 HTML5 canvas 标签。</canvas> -->  
<img id="liji" class="class_liji" alt=".." src="/pbsproject/images/weixin/liji.png" width="120" height="120">
</body>
</html>
