<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
    <script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="resources/js/main.js"></script>
</head>
<body>
	<div class="container">
        <div class="wrap">
            <div class="header">
                <i class="fa fa-user"></i>
                Đăng nhập hệ thống
            </div>
            <form action="" method="post" accept-charset="utf-8">
            	<fieldset>
            		<div class="label">E-mail</div>
	                <div class="input">
	                    <input id="txtEmail" class="txt" type="email" name="" placeholder="Nhập địa chỉ email" onblur="checkEmail()">
	                    <i class="icon-append fa fa-user" id="infEmail"></i>
                        <!-- <span class="glyphicon glyphicon-user" id="infEmail"></span> -->
	                </div>
	                <div class="label">Mật khẩu</div>
	                <div class="input">
	                   <input id="txtPassword" class="txt" type="password" name="" placeholder="Nhập mật khẩu" onblur="checkPassword()">
	                    <i class="icon-append fa fa-lock" id="infPassword"></i>
                        <!-- <span class="glyphicon glyphicon-lock" id="infPassword"></span> -->
	                </div>
	                <div class="note">	
	                	<input type="checkbox" name=""> Lưu mật khẩu
	                    <a href="">Quên mật khẩu?</a>

	                </div>
            	</fieldset>
            	<div class="footer">
                    <button id="btnButton" type="submit" onclick="return formValidate()">
                        <i class="fa fa-sign-in"></i>
                        Đăng nhập
                    </button>
                </div>
            </form>

        </div>
    </div>
</body>
</html>