<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/resources/css/font-awesome.min.css">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/main.js"></script>
</head>
<body>
	<div class="container">
        <div class="wrap">
            <div class="header">
                <i class="fa fa-user"></i>
                Đăng nhập hệ thống
            </div>
            <form action="/j_spring_security_check" method="post" accept-charset="utf-8">
            	<fieldset>
            		<div class="label">Tài khoản</div>
	                <div class="input">
	                    <input id="txtEmail" class="txt" type="text" name="username" placeholder="Nhập địa chỉ email" >
	                    <i class="icon-append fa fa-user" id="infEmail"></i>
                        <!-- <span class="glyphicon glyphicon-user" id="infEmail"></span> -->
	                </div>
	                <div class="label">Mật khẩu</div>
	                <div class="input">
	                   <input id="txtPassword" class="txt" type="password" name="password" placeholder="Nhập mật khẩu">
	                    <i class="icon-append fa fa-lock" id="infPassword"></i>
	                </div>
	                <div class="note">	
	                	<input type="checkbox" name="remember-me"> Lưu đăng nhập
	                    <a href="">Quên mật khẩu?</a>

	                </div>
            	</fieldset>
				<c:if test="${param.error == 'true'}">
					<div style="color:red;margin:10px 20px;">
						Tài khoản hoặc mật khẩu không chính xác
					</div>
				</c:if>
            	<div class="footer">
                    <button id="btnButton" type="submit">
                        <i class="fa fa-sign-in"></i>
                        Đăng nhập
                    </button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>