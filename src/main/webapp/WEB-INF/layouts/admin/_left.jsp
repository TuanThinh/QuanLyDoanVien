<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="mySidenav" class="sidenav">
	<button class="btn btn-primary closebtn" id="myBtn" style="width: 100%" onclick="closeNav()"><i class="fa fa-arrow-left"></i></button>
   	<button class="btn btn-primary dropdown-btn">
   		<i class="fa fa-user-circle icon-margin-right"></i>Tài khoản đoàn viên 
   	    <i class="fa fa-caret-down" style="right: 10px"></i>
   	</button>
   	<div class="dropdown-container">
   	    <a href="#">Tạo tài khoản mới</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/tai-khoan">Danh sách tài khoản</a>
   	</div>

   	<button class="btn btn-primary dropdown-btn">
   		<i class="fa fa-users icon-margin-right"></i>Đoàn cơ sở 
   	    <i class="fa fa-caret-down" style="right: 10px"></i>
   	</button>
   	<div class="dropdown-container">
   	    <a href="#">Thành lập đoàn cơ sở</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/doan-co-so">Danh sách đoàn cơ sở</a>
   	</div>
    
    <button class="btn btn-primary dropdown-btn">
   		<i class="fa fa-bullhorn icon-margin-right"></i>Thông báo - Chính sách
   	    <i class="fa fa-caret-down" style="right: 10px"></i>
   	</button>
   	<div class="dropdown-container">
   	    <a href="#">Thông báo, chính sách mới</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/tb-cs">Danh sách thông báo</a>
   	    <a href="#">Danh sách chính sách</a>
   	</div>

   	<button class="btn btn-primary dropdown-btn">
   		<i class="fa fa-universal-access icon-margin-right"></i>Hoạt động
   	    <i class="fa fa-caret-down" style="right: 10px"></i>
   	</button>
   	<div class="dropdown-container">
   	    <a href="#">Hoạt động mới</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/hd-de-xuat">Hoạt động đề xuất</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/hd-duyet">Hoạt động được phê duyệt</a>
   	    <a href="${pageContext.servletContext.contextPath}/admin/hd-huy">Hoạt động bị hủy bỏ</a>
   	</div>
</div>