<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>人事管理系统</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="${ctx}/public/images/xj.jpg" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
	<link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
</head>
<%--<style>--%>
<%--    #particles-js {--%>
<%--        width: 100%;--%>
<%--        height: 100%;--%>
<%--        background-size: cover;--%>
<%--        background-position: 50% 50%;--%>
<%--        background-repeat: no-repeat;--%>
<%--    }--%>
<%--    .particles-js-canvas-el{--%>
<%--        position: absolute;--%>
<%--        height: 100%;--%>
<%--        width: 100%;--%>
<%--        overflow: hidden;--%>
<%--        margin-top: -500px;--%>
<%--        z-index: -1;--%>
<%--    }--%>
<%--</style>--%>
<body class="login-bg">
<div>
<%--    style="background-color: #0C0C0C"--%>
    <div class="login layui-anim layui-anim-up" >
       <h1 style="color:#363636;text-align: center">人事系统管理登录</h1>
        <br>
        <br>
        <form method="post" class="layui-form" action="${ctx}/login">
            <input name="username" placeholder="用户名" value="${username}"  type="text" lay-verify="required" class="layui-input" style="border-radius: 50px">
            <br>
            <br>
            <br>
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input" style="border-radius: 50px">
            <br>
            <br>
            <br>
            <input value="登录" lay-submit lay-filter="login" style="width:100%;border-radius: 50px" type="submit" >
        </form>
    </div>
</div>
</body>
</html>