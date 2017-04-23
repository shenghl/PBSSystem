<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
        <title>WeUI</title>
        <script type="text/javascript" src="/pbsproject/js/jquery-1.4.4.min.js"></script>
        <!-- 引入 WeUI -->
        <link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.1/weui.min.css"/>
        <script type="text/javascript">
        	
        </script>
    </head>
    <body>
		<div class="weui-panel">
            <div class="weui-panel__hd">订单列表</div>
            <div class="weui-panel__bd">
                <div class="weui-media-box weui-media-box_text">
                    <h4 class="weui-media-box__title"></h4>
                    <p class="weui-media-box__desc" id="time"></p>
                    <ul class="weui-media-box__info">
                        <li class="weui-media-box__info__meta">车桩信息</li>
                        <li class="weui-media-box__info__meta">骑行时间</li>
                        <li class="weui-media-box__info__meta weui-media-box__info__meta_extra">支付信息</li>
                    </ul>
                </div>
            </div>
        </div>
        <script type="text/javascript">
        $(function(){
    		//alert(111);
    		$.ajax({
    			url:"${baseurl}queryorder_result.action",
    			type:"post",
    			dataType:'json',
    			data:{
    				'openid' : 'ojgEp1kS_KSKGaZQwWTfUk0iVf1E'
    			},
    			success : function(data){
    				//alert(data.rows[0].openid);
    				//alert($("#openid").text());
    				$("#time").text(data.rows[0].startTime);
    			},
    			error : function(data){
    				alert("数据加载错误");
    			}
    		});
    	});
        </script>
    </body>
</html>