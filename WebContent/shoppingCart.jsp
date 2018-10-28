<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge" />
    <meta charset="UTF-8" />
    <title>我的购物车</title>
    <meta name="viewport" content="width=1226" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cart.min.css" />
    <script type="text/javascript">var _head_over_time = (new Date()).getTime();</script>
</head>
<body>
<div class="site-header site-mini-header">
    <div class="container">
        <div class="header-logo">
            <a class="logo ir" href="/store_index.html" title="官网" >官网</a>
        </div>
        <div class="header-title" id="J_miniHeaderTitle"><h2>我的购物车</h2></div>
        <div class="topbar-info" id="J_userInfo">
            <a class="link" href="#" data-needlogin="true">登录</a><span class="sep">|</span><a class="link" href="#" >注册</a>        </div>
    </div>
</div>
<script>
    var SiteCloseTipShow = 1;
</script>
<div class="page-main">

    <div class="container">
        <%--<div class="cart-loading loading" id="J_cartLoading">
            <div class="loader"></div>
        </div>--%>
        <div class="cart-empty">
            <h2>您的购物车还是空的！</h2>
            <p class="login-desc">登录后将显示您之前加入的商品</p>
            <a href="#" class="btn btn-primary btn-login" >立即登录</a>
            <a href="#" class="btn btn-primary btn-shoping">马上去购物</a>
        </div>

    </div>
</div>
</body>