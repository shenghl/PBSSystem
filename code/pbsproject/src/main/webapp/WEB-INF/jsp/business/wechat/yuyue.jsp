<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
        <title>预约结果</title>
        <!-- 引入 WeUI -->
        <link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.1/weui.min.css"/>
    </head>
    <body>
		<div class="icon-box" style="text-align:center;margin-top:150px">
            <i class="weui-icon-success weui-icon_msg"></i>
            <div class="icon-box__ctn">
                <h3 class="icon-box__title">预约成功</h3>
                <p class="icon-box__desc"></p>
                <a href="${baseurl}myorder.action">我的订单</a>
            </div>
        </div>
    </body>
</html>