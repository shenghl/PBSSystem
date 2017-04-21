<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
        <title>WeUI</title>
        <!-- 引入 WeUI -->
        <link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.1/weui.min.css"/>
    </head>
    <body>
		<div class="icon-box">
            <i class="weui-icon-success weui-icon_msg"></i>
            <div class="icon-box__ctn">
                <h3 class="icon-box__title">借车成功</h3>
                <p class="icon-box__desc">站点:${rent },桩号:${node }</p>
            </div>
        </div>
    </body>
</html>